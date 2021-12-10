package grpc.GUI;

import java.awt.EventQueue;
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

import grpc.registrationControlService.HospitalHelpRequest;
import grpc.registrationControlService.HospitalHelpResponce;
import grpc.registrationControlService.registrationControlServiceGrpc;
import grpc.registrationControlService.sendRegistrationRequest;
import grpc.registrationControlService.sendResgistrationResponce;
import grpc.registrationControlService.registrationControlServiceGrpc.registrationControlServiceBlockingStub;
import grpc.registrationControlService.registrationControlServiceGrpc.registrationControlServiceStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class registrationControlServiceGUI {
	
	private static registrationControlServiceBlockingStub blockingStub;
	private static registrationControlServiceStub	newStub;
	JFrame frame;
	private JTextField textName1;
	private JTextField firstName;
	private JTextField surName;
	private JTextField contactNumber;
	private JTextField homeAddress;
	private JTextArea  textResponse;
	private JTextArea textResponse1;
	String  Value1;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			//overide the run method of runnable
			public void run() {
				try {
					registrationControlServiceGUI window = new registrationControlServiceGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}
	
	//create the application
	
public registrationControlServiceGUI() {
		

		int port = 50051;
		String host = "localhost";
		
		ManagedChannel newChannel = ManagedChannelBuilder
				.forAddress(host, port)
				.usePlaintext()
				.build();

		//stubs -- generate from proto
		blockingStub = registrationControlServiceGrpc.newBlockingStub(newChannel);
		newStub = registrationControlServiceGrpc.newStub(newChannel);
		initialize();
		/*
		try {
			channel.shutdown().awaitTermination(50, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
}
//Initialize the contents of the frame.

	private void initialize() {
	frame = new JFrame();
	//Jframe is a window with a title bar
	frame.setTitle("Client -Emergeny Service Controller");
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
			JPanel panel_service_1 = new JPanel();
			frame.getContentPane().add(panel_service_1);
			//Flow layout - items retain their size, are laid out horizontally and wrap

			panel_service_1.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 15));
			
			//Create new label and add it to the panel
			JLabel lblNewLabel = new JLabel(" Emergeny Registration Control Service: "+"\n");
			panel_service_1.add(lblNewLabel);
			
			
			JLabel lblNewLabel_1 = new JLabel("Today how we can help you ? ");
			panel_service_1.add(lblNewLabel_1);
			
			//Input textbox
			textName1 = new JTextField();
			// add it to the panel
			panel_service_1.add(textName1);
			//How wide should input box be? - doesn't effect number that can be entered
			textName1.setColumns(25);
			
			//Set Up Button ....
			JButton btnSend = new JButton("Send message");
			
			//Add an action listener to our button
			btnSend.addActionListener(new ActionListener() {
				
				//implement action performed method
				//This will happen when the button is clicked
				public void actionPerformed(ActionEvent e) {

					//Retrieve data from GUI
					String name1 = textName1.getText();
					

					//int index = comboOperation.getSelectedIndex();
					//Do some logic with our index or send it over
					
					String user = name1  ;
					
					
					//* This is the only gRPC in this method*/
					// we need to call the server from inside the button code

					HospitalHelpRequest request = HospitalHelpRequest.newBuilder().setHospitalHelp(user).build();

					HospitalHelpResponce response = blockingStub.getHospitalHelp(request);

							
					//populate the JTextArea in the panel
					textResponse.append( response.getHospitalHelp());
					
					System.out.println("Response: " + response.getHospitalHelp());	
					

				}
			}); //End of setup button
			
			//Add button to the panel
			panel_service_1.add(btnSend);
			
			
			textResponse = new JTextArea(5, 20);
			textResponse .setLineWrap(true);
			textResponse.setWrapStyleWord(true);
			
			JScrollPane scrollPane = new JScrollPane(textResponse);
			
			//textResponse.setSize(new Dimension(15, 30));
			panel_service_1.add(scrollPane);

			
// Method for the client streaming
			
			JPanel panel_service_2 = new JPanel();
			frame.getContentPane().add(panel_service_2);
			//Flow layout - items retain their size, are laid out horizontally and wrap

			panel_service_2.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 15));
			
			//Create new label and add it to the panel
			JLabel lblNewLabel_3 = new JLabel("Here is the registration Form. ");
			panel_service_2.add(lblNewLabel_3);
			
			JLabel lblNewLabel_8 = new JLabel("      Please fill the all options:          ");
			panel_service_2.add(lblNewLabel_8);
			
			
			JLabel lblNewLabel_4 = new JLabel("First Name");
			panel_service_2.add(lblNewLabel_4);
			
			//Input textbox
			firstName = new JTextField();
			// add it to the panel
			panel_service_2.add(firstName);
			//How wide should input box be? - doesn't effect number that can be entered
			firstName.setColumns(25);
			
			JLabel lblNewLabel_5 = new JLabel("Surname");
			panel_service_2.add(lblNewLabel_5);
			
			//Input textbox
			surName = new JTextField();
			// add it to the panel
			panel_service_2.add(surName);
			//How wide should input box be? - doesn't effect number that can be entered
			surName.setColumns(25);
			
			JLabel lblNewLabel_6 = new JLabel("Contact No.");
			panel_service_2.add(lblNewLabel_6);
			
			//Input textbox
			contactNumber = new JTextField();
			// add it to the panel
			panel_service_2.add(contactNumber);
			//How wide should input box be? - doesn't effect number that can be entered
			contactNumber.setColumns(25);
			
			JLabel lblNewLabel_7 = new JLabel("Home address");
			panel_service_2.add(lblNewLabel_7);
			
			//Input textbox
			homeAddress = new JTextField();
			// add it to the panel
			panel_service_2.add(homeAddress);
			//How wide should input box be? - doesn't effect number that can be entered
			homeAddress.setColumns(50);
				
			//Set Up Button ....
			JButton btnSend1 = new JButton("Submit");
			
			//Add an action listener to our button
			btnSend1.addActionListener(new ActionListener() {
				
				//implement action performed method
				//This will happen when the button is clicked
				public void actionPerformed(ActionEvent e) {

					//Retrieve data from GUI
					String Name = (firstName.getText());
					String surname = surName.getText();
					String contact = contactNumber.getText();
					String address = homeAddress.getText();
					
					String string = "\n"+Name+ "\n"+surname+"\n"+contact+"\n"+address;
					sendResgistrationResponce req = sendResgistrationResponce.newBuilder().setFirstString(string).build();
					Value1=req.getFirstString();
					System.out.println("Successfully Registered "+"\n");
					Value1=("Successlly Registered "+"\n");
					textResponse1.append(Value1);
									
					//String user = Name + surname ;
					StreamObserver<sendResgistrationResponce> responseObserver = new StreamObserver<sendResgistrationResponce>() {

						@Override
						public void onNext(sendResgistrationResponce req) {
							System.out.println("\n"+"\n"+" Message: "+"\n" +req.getFirstString());
								
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
				
					StreamObserver<sendRegistrationRequest> requestObserver= newStub.sendStringClientStreaming(responseObserver);				
								
					requestObserver.onNext(sendRegistrationRequest.newBuilder().setFirstString("First Name: "+Name).build());
					requestObserver.onNext(sendRegistrationRequest.newBuilder().setFirstString("Surname: "+surname).build());
					requestObserver.onNext(sendRegistrationRequest.newBuilder().setFirstString("Contact Number: "+contact).build());
					requestObserver.onNext(sendRegistrationRequest.newBuilder().setFirstString("Home Address: "+address).build());
				
					
						
					
				}		
				
			}); //End of setup button
			
			//Add button to the panel
			panel_service_2.add(btnSend1);
			
			
			textResponse1 = new JTextArea(5, 15);
			textResponse1 .setLineWrap(true);
			textResponse1.setWrapStyleWord(true);
			
			JScrollPane scrollPane11 = new JScrollPane(textResponse1);
			
			//textResponse1.setSize(new Dimension(15, 30));
			panel_service_2.add(scrollPane11);
	
			
			
	}//end
	
	
	
}//end class
