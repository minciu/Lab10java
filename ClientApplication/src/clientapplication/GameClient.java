/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientapplication;

import java.io.*;
import java.net.*;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class GameClient {
    public GameClient() throws IOException {
    String serverAddress = "127.0.0.1"; // The server's IP address
 int PORT = 8100; // The server's port
 try (
 Socket socket = new Socket(serverAddress, PORT);
 PrintWriter out =
new PrintWriter(socket.getOutputStream(), true);
  Scanner myObj = new Scanner(System.in);      
 
      
 BufferedReader in = new BufferedReader (
 new InputStreamReader(socket.getInputStream())) ) {
 // Send a request to the server
  
   while(true){
  String  request = myObj.nextLine();
  
    
 out.println(request);
 
 // Wait the response from the server 
 String response = in.readLine ();
 System.out.println(response);
 if(response.equals("exit")) break;
 }} catch (UnknownHostException e) {
 System.err.println("No server listening... " + e);
 }
     
        
    }
    }

