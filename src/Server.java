import java.io.*;
import java.net.*;

public class Server{
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(4999);
        Socket s = ss.accept();

        System.out.println(("Client connected"));


        //Sends data to client
        PrintStream ps = new PrintStream(s.getOutputStream());

        //Reads data coming from client
        InputStreamReader in = new InputStreamReader(s.getInputStream());
        BufferedReader bf = new BufferedReader(in);

        //Reads data from the keyboard
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

        //server executes continuously
        while (true) {
            // repeats as long as client does not send a null string
            String str, str1;

            //read from client
            while ((str = bf.readLine()) != null) {
                System.out.println(str);
                str1 = kb.readLine();

                //send to client
                ps.println(str1);
            }

            //Closes connection
            ps.close();
            bf.close();
            kb.close();
            ss.close();
            s.close();

            //terminate application
            System.exit(0);
        }
    }
}