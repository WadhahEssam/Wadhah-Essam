import javax.swing.JFrame; 

public class ServerText {

	// this class is going to just basicly run the program 
	public static void main(String[] args) {
		Server server = new Server () ;
		server.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		server.startRunning(); // i think you can call this method from the constructor 
	}

}
