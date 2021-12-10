package grpc.GUI;

import java.awt.EventQueue;

import javax.jmdns.ServiceInfo;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import grpc.ambulanceControlService.AmbulanceRequest;
import grpc.ambulanceControlService.AmbulanceResponse;
import grpc.ambulanceControlService.SendResponse;
import grpc.ambulanceControlService.ambulanceControlServiceGrpc;
import grpc.ambulanceControlService.ambulanceControlServiceGrpc.ambulanceControlServiceStub;
import grpc.ambulanceControlService.sendRequest;
import grpc.jmDNS.SimpleServiceDiscovery;

public class ambulanceControlServicesGUI {
	
	private static ambulanceControlServiceStub	newStub;
	private JFrame frame;
	private JTextField firstName;
	private JTextField contactNumber;
	private JTextField homeAddress;
	private JTextField fromBase;
	private JTextField toBase;
	private JTextField temperature;
	private JTextField information;
	private JTextArea  textResponse;
	private JTextArea textResponse1;
	String  Value1;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			//overide the run method of runnable
			public void run() {
				try {
					ambulanceControlServicesGUI window = new ambulanceControlServicesGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}
	
	
	public ambulanceControlServicesGUI() {
		
		/*	ServiceInfo serviceInfo;
		String service_type = "_grpc._tcp.local.";
		//Now retrieve the service info - all we are supplying is the service type
		serviceInfo = SimpleServiceDiscovery.run(service_type);
		//Use the serviceInfo to retrieve the port
		int port = serviceInfo.getPort();
		String host = "localhost";*/
		
		
		//create the application
		int port = 50052;
		String host = "localhost";
		
		ManagedChannel newChannel = ManagedChannelBuilder
				.forAddress(host, port)
				.usePlaintext()
				.build();

		//stubs -- generate from proto
		
		newStub = ambulanceControlServiceGrpc.newStub(newChannel);
		initialize();
		
		
	}
	
	private void initialize() {
		frame = new JFrame();
		//Jframe is a window with a title bar
		frame.setTitle("Client -Ambulance Service Controller");
		//set bounds can be done for frames panels and buttons
		frame.setBounds(250, 250, 300, 600);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Box layout determines how components are laid out in the panel
		//Layout vertically in a col - box layout doesn't wrap
		//See: https://docs.oracle.com/javase/tutorial/uiswing/layout/visual.html
		BoxLayout bl = new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS);

		frame.getContentPane().setLayout(bl);

		//Create JPanel

		//Method for the server streaming
				JPanel panel_service_2 = new JPanel();
				frame.getContentPane().add(panel_service_2);
				//Flow layout - items retain their size, are laid out horizontally and wrap

				panel_service_2.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 15));
				
				//Create new label and add it to the panel
				JLabel lblNewLabel_3 = new JLabel("Here is the registration Form. ");
				panel_service_2.add(lblNewLabel_3);
				
				JLabel lblNewLabel_8 = new JLabel("      Please fill the all options:          ");
				panel_service_2.add(lblNewLabel_8);
				
				JLabel lblNewLabel_6 = new JLabel("Contact No.");
				panel_service_2.add(lblNewLabel_6);
				
				//Input textbox
				contactNumber = new JTextField();
				// add it to the panel
				panel_service_2.add(contactNumber);
				//How wide should input box be? - doesn't effect number that can be entered
				contactNumber.setColumns(25);
				
				
				JLabel lblNewLabel_4 = new JLabel("First Name");
				panel_service_2.add(lblNewLabel_4);
				
				//Input textbox
				firstName = new JTextField();
				// add it to the panel
				panel_service_2.add(firstName);
				//How wide should input box be? - doesn't effect number that can be entered
				firstName.setColumns(25);
				
				JLabel lblNewLabel_7 = new JLabel("Home address");
				panel_service_2.add(lblNewLabel_7);
				
				//Input textbox
				homeAddress = new JTextField();
				// add it to the panel
				panel_service_2.add(homeAddress);
				//How wide should input box be? - doesn't effect number that can be entered
				homeAddress.setColumns(50);
				
				//Set Up Button ....
				JButton btnSend1 = new JButton("Enter");
				
				//Add an action listener to our button
				btnSend1.addActionListener(new ActionListener() {
					
					//implement action performed method
					//This will happen when the button is clicked
					public void actionPerformed(ActionEvent e) {
						
						int contact = Integer.parseInt(contactNumber.getText());
						String Name = firstName.getText();
						String address = homeAddress.getText();
						
						//String string = (contact+"\n"+Name+"\n"+address);
						
						AmbulanceRequest request = AmbulanceRequest.newBuilder()
								.setNumbers(contact).setName(Name).setAddress(address).build();	
						
						Value1=request.getNumbers()+request.getName()+request.getAddress();
						Value1=("Ambulance is on the way don't worry we will be there shortly"+"\n");
						textResponse.append(Value1);
						
						StreamObserver<AmbulanceResponse> responseObserver = new StreamObserver<AmbulanceResponse>() {

							

							@Override
							public void onNext(AmbulanceResponse Value) {
								System.out.println(Value.getMessage());
								
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
						
						
						newStub.emergencyAmbulance(request, responseObserver);						
						
					}	//action event button
			
				});// button close
	
				//Add button to the panel
				panel_service_2.add(btnSend1);
				
				
				textResponse = new JTextArea(5, 15);
				textResponse .setLineWrap(true);
				textResponse.setWrapStyleWord(true);
				
				JScrollPane scrollPane11 = new JScrollPane(textResponse);
				
				//textResponse1.setSize(new Dimension(15, 30));
				panel_service_2.add(scrollPane11);
				
//bidirectional streaming		
				
				JPanel panel_service_21 = new JPanel();
				frame.getContentPane().add(panel_service_21);
				//Flow layout - items retain their size, are laid out horizontally and wrap

				panel_service_21.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 15));
					
				JLabel lblNewLabel_61 = new JLabel("What problem do you have?");
				panel_service_21.add(lblNewLabel_61);
				
				fromBase = new JTextField();
				// add it to the panel
				panel_service_21.add(fromBase);
				//How wide should input box be? - doesn't effect number that can be entered
				fromBase.setColumns(25);
				
				JLabel lblNewLabel_62 = new JLabel("Do you have any alergies");
				panel_service_21.add(lblNewLabel_62);
				
				//Input textbox
				toBase = new JTextField();
				// add it to the panel
				panel_service_21.add(toBase);
				//How wide should input box be? - doesn't effect number that can be entered
				toBase.setColumns(25);
				
				JLabel lblNewLabel_63 = new JLabel("Any other problem? ");
				panel_service_21.add(lblNewLabel_63);
				
				//Input textbox
				temperature = new JTextField();
				// add it to the panel
				panel_service_21.add(temperature);
				//How wide should input box be? - doesn't effect number that can be entered
				temperature.setColumns(50);
					
				
				JLabel lblNewLabel_64 = new JLabel("Any other thing you want to tell us about patient? ");
				panel_service_21.add(lblNewLabel_64);
				
				//Input textbox
				information = new JTextField();
				// add it to the panel
				panel_service_21.add(information);
				//How wide should input box be? - doesn't effect number that can be entered
				information.setColumns(50);				
	
	
		//Set Up Button ....
				JButton btnSend = new JButton("Submit");
				
				//Add an action listener to our button
				btnSend.addActionListener(new ActionListener() {
					
					//implement action performed method
					//This will happen when the button is clicked
					public void actionPerformed(ActionEvent e) {

						//Retrieve data from GUI
						String fromBase1 = (fromBase.getText());
						String toBase1 = toBase.getText();
						String temperature1 = temperature.getText();
						String information1 = information.getText();
						
						String string = fromBase+"\n"+toBase+ "\n"+temperature+"\n"+information;
						SendResponse req = SendResponse.newBuilder().setFinalMessage(string).setAmbulanceNumber(0).build();
						Value1=req.getAmbulanceNumber()+req.getFinalMessage();
						System.out.println("Message successfully send "+"\n");
						Value1=("Message successlly Send "+"\n");
						textResponse1.append(Value1);
						
						StreamObserver<SendResponse> responseObserver = new StreamObserver<SendResponse>() {

							@Override
							public void onNext(SendResponse msg) {
								System.out.println("Ambulance Number: " + msg.getAmbulanceNumber() + " is on the way.  "+ msg.getFinalMessage() );
									
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
					
						StreamObserver<sendRequest> requestObserver= newStub.ambulanceStatus(responseObserver);				
							
						requestObserver.onNext(sendRequest.newBuilder().setAmbulancenumber(29080).setFromBase(fromBase1).setToBase(toBase1).build());
						requestObserver.onNext(sendRequest.newBuilder().setAmbulancenumber(29080).setFromBase(temperature1).setToBase(information1).build());
							
					}	//action event button
					
				});// button close
	
				panel_service_21.add(btnSend);
				
				
				textResponse1 = new JTextArea(5, 15);
				textResponse1 .setLineWrap(true);
				textResponse1.setWrapStyleWord(true);
				
				JScrollPane scrollPane111 = new JScrollPane(textResponse1);
				
				//textResponse1.setSize(new Dimension(15, 30));
				panel_service_21.add(scrollPane111);
	
	}//intialize method end
	
	
}//Second method initialize1	
	