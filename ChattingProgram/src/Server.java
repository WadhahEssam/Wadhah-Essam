import java.io.* ; 
import java.net.* ; 
import java.awt.* ; 
import java.awt.event.*; 
import javax.swing.* ; 

public class Server extends JFrame {

	//  GUI
	private JTextField textField ; 
	private JTextArea textArea ; 
	
	private ObjectOutputStream output ; 
	private ObjectInputStream input ; 
	
	private ServerSocket server ;
	
	// Socket is the connection between two computer 
	private Socket connection ; 
	
	//constructor 
	public Server () {
		super ("Chat Aden") ;
		textField = new JTextField () ;
		textField.setEditable(false);  /// before you r connected to anther one  you are not able to send your stuff to any one 
		textField.addActionListener(new ActionListener() {
			public void actionPerformed ( ActionEvent e ) { // when the user hit enter this code will perform
				sendMessage(e.getActionCommand());  // e.getActionCommand returns the stuff that was in the text area ,, 
				textField.setText(""); // it becomes nothing after you press enter 
			}
		});
		
		this.setLayout(new BorderLayout());
		textArea = new JTextArea () ;
		this.add(textArea , BorderLayout.CENTER ) ;
		this.add(new JScrollPane (textField) , BorderLayout.SOUTH );
		this.setSize(new Dimension (300 , 150));
		this.setVisible(true);
	}
	
	// ser up and run the server  ,, after the gui is being created
	
	// setting up the server and giving it a port  number (( server Socket ))
	public void startRunning () {
		try {
			server = new ServerSocket (2457 /* port number , the adress */, 100 /* how many people can sit and wait ( the backlog ) */ ) ; 
			while ( true ) { // it is going to run for ever >>> maybe i will change it later to the update method that i know 
				
				try {
					waitForConnection () ; // 1 // start up and wait for someone to chat with 
					setupStreams () ; // 2 // set up the input and output stream
					whileChatting() ; // 3 // sending the messages back and forth 
					
				}catch ( EOFException e ) {
					showMessage ( "\n Server ended the Connection! ") ; //  this will show when exception ( EndOfStream ) 
				}
				finally {
					closeCrap() ; // what will happen after everything 
				}
				
			}
		}catch ( Exception e) {
			e.printStackTrace();
		}
	}
	
	// 1 // wait for connection , then desplay connection information 
	private void waitForConnection() throws IOException {
		showMessage("Waiting for someone to connect... \n"); // not needed just a fancy 
		connection = server.accept() ; // this connection ( the socket ) is gonna be created throw the looping of the whild 
		showMessage("Now Connected to "  + connection.getInetAddress().getHostName() ) ;  // returns the address of the anther side  ( the IP adress )  ; 
	}
	
	// 2 // get stream to send and receive data 
	private void setupStreams() throws IOException {
		output = new ObjectOutputStream ( connection.getOutputStream() ) ; // creating the pathway that allows us to connect to anther computer
		output.flush(); // sometimes when ever you want to send something  , and sometimes bytes get bufferd ,    ( data gets left over when you try to send something to someone else ) ,, 
		input = new ObjectInputStream ( connection.getInputStream() ) ; // creating the pathway to receive something form someone else
		// you don't have to flush in the input 
		showMessage("\n Streams are now setup! \n "); 
	}
	
	// 3 // during the chat conversation 
	private void whileChatting () throws IOException {
		String message = " You are now connected! " ; 
		sendMessage(message) ; 
		ableToType(true); // allow the user to type stuff in the textField 
		do { // having a conversation 
			
			try {
				message = ( String ) input.readObject(); // changing the things the send to string which is the text 
				showMessage("\n " + message ) ; 
				
			}catch ( ClassNotFoundException classNotFoundException ) {
				showMessage( "\n what the hell the user send ! ") ; // will not happen unless if the user send something that is not STRING ( maybe if he was trying to hack us )  ; // they user send object that is not string 
			}
			
		}while (!message.equals("CLIENT - END")) ;// when any one type END the conversation will end 
	}
	
	private void closeCrap () { // close stream and sockets after you r done chatting 
		showMessage("\n Closing connections ... \n ") ;
		ableToType(false) ; // prevent the user form typing
		try {
			output.close();
			input.close();
			connection.close() ; 
			// closing everything so the memory is returned back 

		}catch ( IOException e ) {
			e.printStackTrace();
		}
	}
	
	// send message to client 
	private void sendMessage ( String message ) {
		try {
			output.writeObject("SERVER :" + message); // because this is the server or it should be the name of the user name // this method is wrapping the output with an object of type ( string in this case )  ;
			output.flush();   // it is not needed but it is good to flush the output everything
			showMessage ( "SERVER : " + message ) ; 
		}catch ( IOException e ) {
			textArea.append("\n ERROR : YOU CAN'T SEND THIS MESSAGE \n");
		}
	}
	
	//ubdates the chatwindow 
	private void showMessage ( final String s ) {
		SwingUtilities.invokeLater(  // this is creating a thread which is updating the text inside the gui 
					new Runnable (){
						public void run () {
							textArea.append(s); // the chat window which is the text area gets updated with the new text
						}
					}
				);
	}
	
	// let the user type stuff into their box ( text field )  
	private void ableToType (final boolean tof) {
		SwingUtilities.invokeLater(  // this is creating a thread which is updating the text inside the gui 
				new Runnable (){
					public void run () {
						textField.setEditable(tof) ;
					}
				}
			);
	}
	
	
}
