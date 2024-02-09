import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
      // Loginform loginform=new Loginform();
       JFrame frame = new JFrame("JCalendar Example");
      //  JCalendar calendar = new JCalendar();
        JDateChooser jDateChooser=new JDateChooser();

        frame.setTitle("Date Chooser Example");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JDateChooser dateChooser = new JDateChooser();
        panel.add(dateChooser);

        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}