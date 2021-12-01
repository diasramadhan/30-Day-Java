import javax.swing.*;
import java.awt.*;

public class JpanelApp {
    public static void main(String[] args) {

        ImageIcon icon = new ImageIcon("LOGO_UNP KOTAK.jpg");
        //CONTAINER ===========
        JFrame frame = new JFrame();
        frame.setIconImage(icon.getImage());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750,750);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        // AKHIR CONTAINER =====


        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        redPanel.setBounds(0,0,250,250);
        //finally
        frame.add(redPanel);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(250,0,250,250);
        //finally
        frame.add(greenPanel);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(0,250,500,250);
        //finally
        frame.add(bluePanel);

        JLabel label = new JLabel("Hi");
        label.setIcon(icon);
        redPanel.add(label);


    }
}
