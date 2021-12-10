package grpc.ambulanceControlService;

import java.io.IOException;
import grpc.ambulanceControlService.ambulanceControlServiceGrpc.ambulanceControlServiceImplBase;
import grpc.jmDNS.SimpleServiceRegistration;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class ambulanceServer {

	

	public static void main(String[] args) throws IOException, InterruptedException {
						
			/*	int port = 50052;
				String service_type = "_http._tcp.local.";
				String service_name = "GrpcServer";
				SimpleServiceRegistration ssr = new SimpleServiceRegistration();
				ssr.run(port, service_type, service_name);*/
				
				
				ambulanceServer Server = new ambulanceServer();
				Server.start();
			}
			
		private void start() throws IOException, InterruptedException{
			try {
				System.out.println("Starting Emergency Ambulance Server...");
				int port = 50052;
				Server server = ServerBuilder.forPort(port).addService(new ambulanceControlServiceImpl()).build().start();
				System.out.println("Emergency Ambulance Server Started." +"\n"+"Now gRPC running on the port "+port);
				server.awaitTermination();
				}catch(Exception e) {
					System.out.println("Error starting in emergency ambulance server! "+e.getMessage());
				}
			}

		static class ambulanceControlServiceImpl extends ambulanceControlServiceImplBase{
				
//server streaming
				
			public void emergencyAmbulance(AmbulanceRequest request,
				StreamObserver<AmbulanceResponse> responseObserver) {
					System.out.printf("Emergengy Request for the Ambulance: "+"\n");
					System.out.printf("\n"+"Need Ambulance, Message from the client :  \n",
							request.getNumbers(), request.getName(), request.getAddress()  );

					System.out.println("Client Details are as follow: "+"\n"+"Contact Number: "+request.getNumbers()+"\n"+ "Name: "+request.getName()+"\n"+"Address: "+ request.getAddress() );
						//String random_value = (request.getNumbers() + request.getName() + request.getAddress());

						AmbulanceResponse reply = AmbulanceResponse.newBuilder().setMessage("Ambulance send").build();

						responseObserver.onNext(reply);

						try {
							//wait for a second
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					responseObserver.onCompleted();

				}


				
				
//bidirectional streaming
								
			public StreamObserver<sendRequest> ambulanceStatus(StreamObserver<SendResponse> responseObserver) {
				
				return new StreamObserver<sendRequest> () {

					@Override
					public void onNext(sendRequest msg) {
						
						System.out.println("This is the response from the patient: ");
						System.out.println("Active Ambulance Number: "+ msg.getAmbulancenumber() + ", Patient Problem: "+ msg.getFromBase() + ", Any information: "+ msg.getToBase()  );
						
						//String converted =  msg.getAmbulancenumber()+ msg.getFromBase()+ msg.getToBase();
						
						SendResponse reply = SendResponse.newBuilder().setAmbulanceNumber(msg.getAmbulancenumber()).setFinalMessage("Dont worry").build();
						
						responseObserver.onNext(reply);
						
					}

					@Override
					public void onError(Throwable t) {
						
						t.printStackTrace();
						
					}

					@Override
					public void onCompleted() {
						System.out.println("Procedure is completed ");
						
						//completed too
						responseObserver.onCompleted();
					}
					
				};
		}

	}
}//end class

