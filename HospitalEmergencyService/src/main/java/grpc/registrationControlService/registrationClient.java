package grpc.registrationControlService;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import javax.jmdns.ServiceInfo;

import grpc.jmDNS.SimpleServiceDiscovery;
//import javax.jmdns.ServiceInfo;
//import grpc.jmDNS.SimpleServiceDiscovery;
import grpc.registrationControlService.registrationControlServiceGrpc.registrationControlServiceBlockingStub;
import grpc.registrationControlService.registrationControlServiceGrpc.registrationControlServiceStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

public class registrationClient {

	public static void main(String[] args) throws InterruptedException {
		/*ServiceInfo serviceInfo;
		String service_type = "_grpc._tcp.local.";
		//Now retrieve the service info - all we are supplying is the service type
		serviceInfo = SimpleServiceDiscovery.run(service_type);
		//Use the serviceInfo to retrieve the port
		int port = serviceInfo.getPort();
		String host = "localhost";*/
		

		//Build a channel
		int port = 50051;
		String host= "localhost";
		
		ManagedChannel newChannel = ManagedChannelBuilder.
				forAddress(host, port)
				.usePlaintext()
				.build();
			
//Stub is a local object that represent the service
		registrationControlServiceBlockingStub bstub = registrationControlServiceGrpc.newBlockingStub(newChannel);
		registrationControlServiceStub asyncStub = registrationControlServiceGrpc.newStub(newChannel);
		
//Here I am using the blocking stub for the unary method
	
	try {
			System.out.println("Hospital Help line"+"\n"+"\n"+" Today How can we help you? ");
			Scanner scanner= new Scanner(System.in);
			String user = scanner.nextLine();
			//System.out.println(user);
			HospitalHelpRequest request = HospitalHelpRequest.newBuilder().setHospitalHelp(user).build();

			HospitalHelpResponce response = bstub.getHospitalHelp(request);

			System.out.println(response.getHospitalHelp());
			//scanner.close();
		} catch (StatusRuntimeException e) {
			System.out.print(e.getMessage());

			return;

		}
		
// for the client streaming method
		
		
		StreamObserver<sendResgistrationResponce> responseObserver = new StreamObserver<sendResgistrationResponce>() {

			@Override
			public void onNext(sendResgistrationResponce value) {
				System.out.println("\n"+"\n"+" Message: "+"\n" +value.getFirstString());
				
			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onCompleted() {
				// TODO Auto-generated method stub
				
			}

		};
		
		//now add in streaming
		//For incoming messages we need to implement a StreamObserver
		//Then wee pass it to the GRPC library
		//asyncStub
		StreamObserver<sendRegistrationRequest> requestObserver= asyncStub.sendStringClientStreaming(responseObserver);
		try {
			System.out.println("   Please Enter your First name: ");
			Scanner scanner1= new Scanner(System.in);
			String firstName = scanner1.nextLine();
			
			System.out.println("   Please Enter your Surname: ");
			Scanner scanner2= new Scanner(System.in);
			String surName = scanner2.nextLine();
			
			System.out.println("   Please Enter your contact number: ");
			Scanner scanner3= new Scanner(System.in);
			String contactNumber = scanner3.nextLine();
			
			System.out.println("   Please Enter your home address: ");
			Scanner scanner4= new Scanner(System.in);
			String homeAddress = scanner4.nextLine();
			
					
		requestObserver.onNext(sendRegistrationRequest.newBuilder().setFirstString("First Name: "+firstName).build());
		requestObserver.onNext(sendRegistrationRequest.newBuilder().setFirstString("Surname: "+surName).build());
		requestObserver.onNext(sendRegistrationRequest.newBuilder().setFirstString("Contact Number: "+contactNumber).build());
		requestObserver.onNext(sendRegistrationRequest.newBuilder().setFirstString("Home Address: "+homeAddress).build());
		
		
		}catch(StatusRuntimeException e) {
			System.out.println("Error closing down channel");
		}
		finally {
			newChannel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
		}
		requestObserver.onCompleted();
		
		Thread.sleep(5000);
		
	}

}
