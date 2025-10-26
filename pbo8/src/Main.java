import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Judul Window");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3, 1));

        JButton button1 = new JButton("Klik Saya");

        ImageIcon icon = new ImageIcon("src/smolimg.jpg");
        JButton button2 = new JButton(icon);

        JButton button3 = new JButton("Submit", icon);

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}