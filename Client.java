import java.io.*;
import java.net.*;

public class Client {

    //initialize socket, input & output streams
    private Socket socket = null;
    private DataInputStream input = null;
    private DataOutputStream out = null;

    //constructor to put ip address and port
    public Client (String address, int port){
        //establish connecton
        try {
            socket = new Socket(address, port);
            System.out.println("Connected");

            //takes input from terminal
            input = new DataInputStream(System.in);

            //sends output to the socket
            out = new DataOutputStream(socket.getOutputStream());
        }
        catch (UnknownHostException u){
            System.out.println(u);
        }
        catch (IOException i){
            System.out.println(i);
        }

        //string to read message from input
        String line = "";

        //Keep reading until over is input
        while(!line.equals("Over")){
            try {
                //TODO: Fix deprecation error
                line = input.readLine();
                out.writeUTF(line);
            } catch (IOException i){
                System.out.println(i);
            }
        }
    }
    public static void main(String args[]){
        Client client = new Client("127.0.0.1", 5000);
    }
}
