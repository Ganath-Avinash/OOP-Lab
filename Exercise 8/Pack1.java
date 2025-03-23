import java.util.Scanner;
import javax.swing.*;

public class Pack1{
    public static void main(String[] args) {
        System.out.println(Math.sqrt(25));
	JFrame frame = new JFrame("I am Ganath");
        JButton button = new JButton("Click!");
        frame.add(button);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}



