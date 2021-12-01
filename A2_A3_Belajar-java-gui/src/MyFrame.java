import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame() throws HeadlessException {
        // Jframe = a GUI window to add components to
        // Jframe = jendela GUI untuk menambahkan ke komponen

        this.setTitle("Frame App");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(420,420);
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        ImageIcon icon = new ImageIcon("LOGO_UNP KOTAK.jpg");
        this.setIconImage(icon.getImage());
        this.getContentPane().setBackground(new Color(123,50,250));

    }
}
