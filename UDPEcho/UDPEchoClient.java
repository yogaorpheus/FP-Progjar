package UDPEcho;

import java.io.*; 
import java.net.*; 
import java.util.*;    
 
public class UDPEchoClient 
    { 
      private static InetAddress host; 
      private static final int PORT = 1234; 
      private static DatagramSocket datagramSocket; 
      private static DatagramPacket inPacket, outPacket; 
      private static byte[] buffer; 
      public static void main(String[] args) 
      {
         try
         {
             host = InetAddress.getByName("10.151.253.6");
         }
         catch(UnknownHostException uhEx)
         {
             System.out.println("Host ID not found!");
             System.exit(1);
         } 
        accessServer();
      }    
       private static void accessServer()
       {
          try
          {
               //Step 1… 
               datagramSocket = new DatagramSocket();    
               //Set up stream for keyboard entry… 
               Scanner userEntry = new Scanner(System.in);    
              String message="", response="";
              do
              {
                   System.out.print("Enter message: ");
                   message = userEntry.nextLine();
                   if (!message.equals("***CLOSE***"))
                   {
                       outPacket = new DatagramPacket(message.getBytes(),message.length(),host,PORT); 
                       datagramSocket.send(outPacket);
                       buffer = new byte[256];
                        inPacket = new DatagramPacket(buffer, buffer.length); 
                        datagramSocket.receive(inPacket);
                       response = new String(inPacket.getData(),0, inPacket.getLength()); 
                        System.out.println("\nSERVER> Nuzul "+response);
                   }
               }while (!message.equals("***CLOSE***")); 
 
          } 
 
          catch(IOException ioEx)
          {
               ioEx.printStackTrace();
          }
        finally
          {
               System.out.println("\n* Closing connection… *");
               datagramSocket.close();                  //Step 8. 
          }
      } 
    } 
  