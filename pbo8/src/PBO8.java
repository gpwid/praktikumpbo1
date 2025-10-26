import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PBO8 extends JFrame {

    private JButton pencetButton;
    private JPanel panelutama;

    public PBO8() {
        setTitle("PBO 8");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
        add(panelutama);

        pencetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(panelutama, "kontol kau", "kenak tipu", JOptionPane.PLAIN_MESSAGE);
            }
        });

        setVisible(true);
    }
}
