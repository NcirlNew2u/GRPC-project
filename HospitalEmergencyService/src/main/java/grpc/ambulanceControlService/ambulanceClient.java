package grpc.ambulanceControlService;

import java.util.Scanner;

import javax.jmdns.ServiceInfo;

import grpc.ambulanceControlService.ambulanceControlServiceGrpc.ambulanceControlServiceStub;
import grpc.jmDNS.SimpleServiceDiscovery;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class ambulanceClient {

		private static ambulanceControlServiceStub  asyncStub;
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			/*ServiceInfo serviceInfo;
			String service_type = "_grpc._tcp.local.";
			//Now retrieve the service info - all we are supplying is the service type
			serviceInfo = SimpleServiceDiscovery.run(service_type);
			//Use the serviceInfo to retrieve the port
			int port = serviceInfo.getPort();
			String host = "localhost";
			*/

			//Build a channel
			int port = 50052;
			String host= "localhost";
			
			ManagedChannel newChannel = ManagedChannelBuilder.
					forAddress(host, port)
					.usePlaintext()
					.build();
				
			//Stub is a local object that represent the service
			asyncStub = ambulanceControlServiceGrpc.newStub(newChannel);
			
			
			emergencyAmbulanceAsyn();
			ambulanceStatus();
		
		}
		
		
		

//AsyncStub server streaming
			public static void emergencyAmbulanceAsyn() {
				
				System.out.printf("Emergengy Request for the Ambulance: "+"\n"+"\n");
				System.out.printf("Please enter the following details: "+"\n");
					
				Scanner scanner= new Scanner(System.in);
				System.out.println(" Please enter your phone number:");
				Integer Number = scanner.nextInt();
				
				Scanner scanner1= new Scanner(System.in);
				System.out.println(" Please enter your Name:");
				String name = scanner1.nextLine();
				
				Scanner scanner2= new Scanner(System.in);
				System.out.println(" Please enter your Address:");
				String address = scanner2.nextLine();

				AmbulanceRequest request = AmbulanceRequest.newBuilder()
						.setNumbers(Number).setName(name).setAddress(address).build();


				StreamObserver<AmbulanceResponse> responseObserver = new StreamObserver<AmbulanceResponse>() {

					

					@Override
					public void onNext(AmbulanceResponse value) {
						System.out.println(value.getMessage());
						
					}

					@Override
					public void onError(Throwable t) {
						t.printStackTrace();

					}

					@Override
					public void onCompleted() {
						System.out.println("\n"+"Ambulance is on the way don't worry we will be there shortly ... "+"\n");
					}

				};

				asyncStub.emergencyAmbulance(request, responseObserver);

				try {
					Thread.sleep(15000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		
//bidirectional streaming
			public static void ambulanceStatus() {

				System.out.println("Please give us the following details");
				StreamObserver<SendResponse> responseObserver = new StreamObserver<SendResponse>() {

					//int count =0 ;
						
					@Override
					public void onNext(SendResponse msg) {
						System.out.println("Ambulance Number: " + msg.getAmbulanceNumber() + " is on the way.  "+ msg.getFinalMessage() );
						//count += 1;
					}

					@Override
					public void onError(Throwable t) {
						t.printStackTrace();

					}

					@Override
					public void onCompleted() {
						System.out.println("Thanks! stay with us");
					}

				};



				StreamObserver<sendRequest> requestObserver = asyncStub.ambulanceStatus(responseObserver);

				try {
					
					Scanner scanner3= new Scanner(System.in);
					System.out.println("What problem do you have? ");
					String fromBase = scanner3.nextLine();
					
					Scanner scanner4= new Scanner(System.in);
					System.out.println("Do you have any alergies");
					String toBase = scanner4.nextLine();
					
					Scanner scanner5= new Scanner(System.in);
					System.out.println("Any other problem? ");
					String temperature = scanner3.nextLine();
					
					Scanner scanner6= new Scanner(System.in);
					System.out.println("Any other thing you want to tell us about patient? ");
					String information = scanner4.nextLine();

					requestObserver.onNext(sendRequest.newBuilder().setAmbulancenumber(29080).setFromBase(fromBase).setToBase(toBase).build());
					requestObserver.onNext(sendRequest.newBuilder().setAmbulancenumber(29080).setFromBase(temperature).setToBase(information).build());
					
					// Mark the end of requests
					requestObserver.onCompleted();
					
				} catch (RuntimeException e) {
					e.printStackTrace();
				} 
				try {
					Thread.sleep(15000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}	


		}



