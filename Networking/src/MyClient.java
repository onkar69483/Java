// MyClient.java
import java.io.*;  
import java.net.*;  

public class MyClient {  
    public static void main(String[] args) {  
        try {      
            Socket s = new Socket("localhost", 4561); 
            System.out.println("Client has Started");
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            java.util.Scanner r = new java.util.Scanner(System.in);
            String str = "Hi";
            while (!str.equalsIgnoreCase("stop")) {
                dout.writeUTF("From Client: " + str);  
                dout.flush();
                str = r.nextLine();
            }
            dout.close();  
            s.close();  
        } catch(Exception e) {
            System.out.println(e);
        }  
    }  
}  
