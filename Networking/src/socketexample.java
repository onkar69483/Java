// SocketExample.java
import java.io.*;  
import java.net.*;  

public class socketexample {  
    public static void main(String[] args) {  
        try {  
            ServerSocket ss = new ServerSocket(4561);  
            System.out.println("Server Started");
            Socket s = ss.accept(); // Establishes connection 
            DataInputStream dis = new DataInputStream(s.getInputStream());
            while (true) {
                String str = (String) dis.readUTF();
                System.out.println(str);
            }
            // ss.close();  
        } catch(Exception e) {
            System.out.println(e);
        }  
    }  
}  
