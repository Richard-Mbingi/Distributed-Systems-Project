import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {
        //Create client socket
        Socket s = new Socket("localhost", 4999);

        DataOutputStream dos = new DataOutputStream(s.getOutputStream());

        //Reads data coming form the server
        InputStreamReader in = new InputStreamReader(s.getInputStream());
        BufferedReader bf = new BufferedReader(in);

        //Reads data from the keyboard
        BufferedReader kb = new BufferedReader(
                new InputStreamReader(System.in)
        );

        String str, str1;

        //repeat as long as logout is not typed at client
        while (!(str = kb.readLine()).equals("logout")) {
            //send to server
            dos.writeBytes(str + "\n");

            //receive from the server
            str1 = bf.readLine();

            System.out.println(str1);
        }

    }
}