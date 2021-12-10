package grpc.registrationControlService;

import java.io.IOException;
import grpc.jmDNS.SimpleServiceRegistration;
import grpc.registrationControlService.registrationControlServiceGrpc.registrationControlServiceImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class registrationServer {

		//private Server server;
		public static void main(String[] args) throws IOException, InterruptedException {

		/*int port = 50051;
		String service_type = "_grpc._tcp.local.";
		String service_name = "GrpcServer";
		SimpleServiceRegistration ssr = new SimpleServiceRegistration();
		ssr.run(port, service_type, service_name);*/
			
			registrationServer Server = new registrationServer();
			Server.start();
		}
		
			private void start() throws IOException, InterruptedException{
			try {
				System.out.println("Starting Emergency Registration Server...");
				int port = 50051;
				Server server = ServerBuilder.forPort(port).addService(new registrationControlServiceImpl()).build().start();
				System.out.println("Emergency Registration Server Started." +"\n"+"Now gRPC running on the port "+port);
				server.awaitTermination();
			}catch(Exception e) {
				System.out.println("Error starting in emergency registration server! "+e.getMessage());
				}
			}
	
  static class registrationControlServiceImpl extends registrationControlServiceImplBase{
			
//unary RPC
				@Override
				public void getHospitalHelp(HospitalHelpRequest 
						request, StreamObserver<HospitalHelpResponce> responseObserver) {
					try {
					String hospitalHelp = request.getHospitalHelp();
					System.out.println("\n"+"Message from Client: "+hospitalHelp);
				
					//Now build our response to send back to the client
				
					HospitalHelpResponce.Builder response = HospitalHelpResponce.newBuilder();
				
					response.setHospitalHelp("\n"+"For '"+hospitalHelp+"' service you need a registeration."+"\n");
				
					responseObserver.onNext(response.build());
					responseObserver.onCompleted();
					}catch(Exception e) {
						System.out.println("Unary rpc "+e.getMessage());
						}
				}
				
//Client streaming for the registration process
				
				@Override
				public StreamObserver<sendRegistrationRequest> sendStringClientStreaming(
						StreamObserver<sendResgistrationResponce> responseObserver){
					System.out.println("\n"+"Here is the registration process data"+"\n");
					
					return new StreamObserver<sendRegistrationRequest>() {

						@Override
						public void onNext(sendRegistrationRequest value) {
							System.out.println(value.getFirstString());
							
						}

						@Override
						public void onError(Throwable t) {
							// TODO Auto-generated method stub
							
						}

						@Override
						public void onCompleted() {
							sendResgistrationResponce.Builder response = sendResgistrationResponce.newBuilder();
							
							response.setFirstString("  You are registered now: Thanks for the registration"+"\n");
							//this coresponde to one message
							responseObserver.onNext(response.build());
							//this coresponds to a second message
							//let send a new string back...
							response.setFirstString("Now Streaming!  ");
							responseObserver.onNext(response.build());
							responseObserver.onCompleted();
							
						}};
								
				}
				
			
			}//end class for our implementation
		
		

}//end class
