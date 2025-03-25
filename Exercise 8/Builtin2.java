import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Builtin2{
    public static void main(String[] args) {

        JFrame frame = new JFrame("Date & Time Display");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);


        JLabel label = new JLabel("Click the button to see date & time!");
        label.setBounds(50, 30, 300, 30);
        frame.add(label);


        JButton button = new JButton("Show Date & Time");
        button.setBounds(100, 80, 200, 30);
        frame.add(button);


        frame.getContentPane().setBackground(Color.LIGHT_GRAY);


        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Date now = new Date();
                label.setText("Current Date & Time: " + now.toString());
            }
        });


        frame.setVisible(true);
    }
}
