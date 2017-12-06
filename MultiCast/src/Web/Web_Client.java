/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Web;

/**
 *
 * @author ASUS
 */
import java.net.*;
import java.io.*;
import java.util.*;

public class Web_Client
{
    public static void main(String[] args) 
    {
	// read arguments
	if (args.length!=2) {
	    System.out.println("Usage: java MultiClient <host> <port>");
	    System.exit(-1);
	}
	String host = args[0];
	int port = Integer.parseInt(args[1]);

	System.out.println("MultiClient 1.0");
	System.out.println("Enter request followed by one empty line or 'quit' to quit.");
	BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

	try {
	mainloop:
	    while (true) {
		// read user request
		StringBuffer req = new StringBuffer();
		boolean done = false, first = true;
		while (!done) {
		    // get a line
		    System.out.print(host + ":" + port + "> ");
		    String line = user.readLine();
		    if (line.equals("quit"))
			break mainloop;
		    req.append(line).append("\r\n");
		    if (line.length()==0 && !first)
			done = true; // done when reading blank line
		    first = false;
		}

		Socket socket = null; 
		try {
		    // create socket and connect (don't occupy port too long)
		    socket = new Socket(host, port); 
		    socket.setSoTimeout(60000); // set timeout to 1 minute
		    PrintStream out = new PrintStream(socket.getOutputStream());
		    out.print(req); // send bytes in default encoding
		    out.flush();
		    
		    // show reply
		    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		    while (true) {
			String line = in.readLine();
			if (line==null)
			    break;
			System.out.println(line);
		    }		
		} catch (Exception e) { System.err.println(e); }
		if (socket!=null)		    
		    socket.close(); // close connection
	    }
	}
	catch (Exception e) { System.err.println(e); }
    }
}