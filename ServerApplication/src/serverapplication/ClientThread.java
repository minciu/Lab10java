/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverapplication;

import java.io.*;
import java.net.*;

class ClientThread extends Thread {
 private Socket socket = null ;
 public ClientThread (Socket socket) { this.socket = socket ; }
 public void run () {
 try {
 // Get the request from the input stream: client → server
 BufferedReader in = new BufferedReader(
 new InputStreamReader(socket.getInputStream()));
 
   while(true){
  String request=in.readLine();
 // Send the response to the oputput stream: server → client
 
 PrintWriter out = new PrintWriter(socket.getOutputStream());
 String raspuns;
 if(request.equals("stop")){
  raspuns = "Server stopped ";
  }
   else 
 {  
     raspuns = "Server received the request " + request + "!";
     System.out.println ("Client has request:" + request);
 }
 //Testing exit
 //response="exit";
 out.println(raspuns);
 out.flush();
 if(request.equals("stop")) break;
 }} catch (IOException e) {
 System.err.println("Communication error... " + e);
 } finally {
 try {
 socket.close(); // or use try-with-resources
 } catch (IOException e) { System.err.println (e); }
 } 
 }
}
