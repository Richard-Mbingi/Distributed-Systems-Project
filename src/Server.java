import javax.swing.*;
import java.awt.*;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Server {
    public static void main(String[] args) throws IOException {
        JFrame jFrame = new JFrame("Server");
        jFrame.setSize(400, 400);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);

        Random random = new SecureRandom();
        int rand = random.nextInt(30000);

        System.out.println(rand);

        JLabel jLabelText = new JLabel("Waiting for input from client");
        JLabel jPersonalCodeText = new JLabel("Your personal code: " + rand);

        jFrame.add(jLabelText, BorderLayout.SOUTH);
        jFrame.add(jPersonalCodeText, BorderLayout.CENTER);

        jFrame.setVisible(true);

        ServerSocket serverSocket = new ServerSocket(4999);

        Socket socket = serverSocket.accept();

        InputStream inputStream = socket.getInputStream();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
    }
}