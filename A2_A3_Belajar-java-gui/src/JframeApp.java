import javax.swing.*;
import java.awt.*;

public class JframeApp {
    public static void main(String[] args) {

        // Jframe = a GUI window to add components to
        // Jframe = jendela GUI untuk menambahkan ke komponen

        JFrame frame = new JFrame();
        frame.setTitle("Frame App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(420,420);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        ImageIcon icon = new ImageIcon("LOGO_UNP KOTAK.jpg");
        frame.setIconImage(icon.getImage());
        frame.getContentPane().setBackground(new Color(123,50,250));
    }
}
