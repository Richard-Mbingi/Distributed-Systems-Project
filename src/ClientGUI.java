import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientGUI implements ActionListener {
    private static JLabel stdNoLabel;
    private static JTextField stdNoText;
    private static JLabel stdNameLabel;
    private static JTextField stdNameText;
    private static JLabel courseLabel;
    private static JTextField courseText;
    private static JLabel otpLabel;
    private static JTextField otpText;
    private static JButton button;
    private static JLabel success;

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(panel);
        panel.setLayout(null);

        //Student No.
        stdNoLabel = new JLabel("Student No.");
        stdNoLabel.setBounds(10, 20, 80 ,25);
        panel.add(stdNoLabel);

        stdNoText = new JTextField(20);
        stdNoText.setBounds(120, 20, 165 , 25);
        panel.add(stdNoText);

        //Student Name
        stdNameLabel = new JLabel("Student Name");
        stdNameLabel.setBounds(10, 50, 80 ,25);
        panel.add(stdNameLabel);

        stdNameText = new JTextField(20);
        stdNameText.setBounds(120, 50, 165 , 25);
        panel.add(stdNameText);

        //Course
        courseLabel = new JLabel("Course");
        courseLabel.setBounds(10, 80, 80 ,25);
        panel.add(courseLabel);

        courseText = new JTextField(20);
        courseText.setBounds(120, 80, 165 , 25);
        panel.add(courseText);

        //OTP
        otpLabel = new JLabel("OTP");
        otpLabel.setBounds(10, 110, 80 ,25);
        panel.add(otpLabel);

        otpText = new JTextField(20);
        otpText.setBounds(120, 110, 165 , 25);
        panel.add(otpText);

        button = new JButton("Send");
        button.setBounds(10, 140, 80, 25);
        button.addActionListener(new ClientGUI());
        panel.add(button);

        success = new JLabel("");
        success.setBounds(120,140, 300, 25);
        panel.add(success);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String stdNo = stdNoText.getText();
        String stdName = stdNameText.getText();
        String course = courseText.getText();
        String otp = otpText.getText();
        System.out.println(stdNo + "\n" + stdName + "\n" + course + "\n" + otp);

        //TODO: Form validation
    }
}
