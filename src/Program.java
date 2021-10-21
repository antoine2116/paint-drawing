import java.awt.EventQueue;
import javax.swing.JFrame;

public class Program {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                DessinFrame application = new DessinFrame("paint drawing");
                application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                application.setSize(800, 600);
                application.setVisible(true);

            }
        });
    }
}
