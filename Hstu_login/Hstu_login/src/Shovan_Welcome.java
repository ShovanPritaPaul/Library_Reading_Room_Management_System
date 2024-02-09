import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Shovan_Welcome extends JFrame {
    private JPanel Main;
    private JButton adminButton;
    private JButton studentButton;
    private JButton accessButton;

    public Shovan_Welcome(){
        setContentPane(Main);
        setSize(450, 400);
        //setMaximumSize(new Dimension(600, 600));
        //setModal(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setVisible(true);

        studentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Run_Project();
            }
        });
        adminButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
               new Shovan_AdminPage();
            }
        });
        accessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Vupal_Entering_Outside();
            }
        });
    }

    public static void main(String[] args) {
        new Shovan_Welcome();
    }
}
