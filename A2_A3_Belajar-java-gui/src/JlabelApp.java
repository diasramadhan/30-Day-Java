import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class JlabelApp {
    public static void main(String[] args) {
        //icon
        Icon icon = new ImageIcon("logo.png");
        //boder
        Border border = BorderFactory.createLineBorder(Color.GREEN,5);

        JLabel label = new JLabel();
        label.setText("Bro, do you even code");
        label.setIcon(icon);
//        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setForeground(new Color(0x00FF00));
        label.setFont(new Font("MV Boli",Font.PLAIN,20));
        label.setBackground(Color.black);
        label.setOpaque(true);
        label.setBorder(border);

        //CONTAINER ===========
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
//        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        // AKHIR CONTAINER =====

        //finally
        frame.add(label);
//        frame.pack();

    }
}
