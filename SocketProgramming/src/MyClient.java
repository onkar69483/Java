import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.net.Socket;
import java.util.Scanner;

public class MyClient {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 1234);
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            DataInputStream dis = new DataInputStream(s.getInputStream());
            Scanner sc = new Scanner(System.in);
            String str = "";

            while (!str.equalsIgnoreCase("stop")) {
                System.out.print("Client: ");
                str = sc.nextLine();
                dos.writeUTF(str);
                dos.flush();

                String received = dis.readUTF();
                System.out.println("Server: " + received);
            }

            dos.close();
            dis.close();
            s.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
