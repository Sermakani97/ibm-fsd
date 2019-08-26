package comm.exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.ResultSet;
import java.sql.SQLException;

import comm.example.service.EmployeeService;
import comm.example.service.EmployeeServiceImpl;
import model.Employee;

public class NetworkingServer {
    
    public static void main(String [] args) {
        
        ServerSocket server = null;
        Socket client;
        
        // Default port number we are going to use
        int portnumber = 1234;
       
        
        // Create Server side socket
        try {
            server = new ServerSocket(portnumber);
        } catch (IOException ie) {
            System.out.println("Cannot open socket." + ie);
            System.exit(1);
        }
        System.out.println("ServerSocket is created " + server);
        
        // Wait for the data from the client and reply
        while(true) {
            
            try {
                
                // Listens for a connection to be made to
                // this socket and accepts it. The method blocks until
                // a connection is made
                System.out.println("Waiting for connect request...");
                client = server.accept();
                
                System.out.println("Connect request is accepted...");
                String clientHost = client.getInetAddress().getHostAddress();
                int clientPort = client.getPort();
                System.out.println("Client host = " + clientHost + " Client port = " + clientPort);
                
                // Read data from the client
                InputStream clientIn = client.getInputStream();
                BufferedReader br = new BufferedReader(new
                        InputStreamReader(clientIn));
                String msgFromClient = br.readLine();
                System.out.println("Message received from client = " + msgFromClient);
                
                // Send response to the client
                if (msgFromClient != null && !msgFromClient.equalsIgnoreCase("bye")) {
                    OutputStream clientOut = client.getOutputStream();
                    PrintWriter pw = new PrintWriter(clientOut, true);
                    String ansMsg = "Hello, " + msgFromClient;
                    pw.println(ansMsg);
                }
                
                // Close sockets
                if (msgFromClient != null && msgFromClient.equalsIgnoreCase("bye")) {
                    server.close();
                    client.close();
                    break;
                }
                
            } catch (IOException ie) {
            }
        }
    }
    	public int factorial(int n) {
		// TODO Auto-generated method stub
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
return fact;
	}
	
	
		public void display(int id, String firstname, String lastname, String email) {
			// TODO Auto-generated method stub
			EmployeeService server = null;
			try {
				server = new EmployeeServiceImpl();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			server.createEmployee(new Employee(id,firstname,lastname,email));
			
		}
		public ResultSet search(int id)
		{
			ResultSet s = null;
			try {
				RS2XMLConfig rc=new RS2XMLConfig();
				s=rc.getAllEmployees(id);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return s;
		}
}
