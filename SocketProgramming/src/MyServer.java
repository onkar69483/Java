import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MyServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(1234);
            Socket s = ss.accept();
            System.out.println("Server Started!");

            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            Scanner scanner = new Scanner(System.in);

            while (true) {
                String received = dis.readUTF();
                System.out.println("Client: " + received);

                System.out.print("Server: ");
                String reply = scanner.nextLine();
                dos.writeUTF(reply);
                dos.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
