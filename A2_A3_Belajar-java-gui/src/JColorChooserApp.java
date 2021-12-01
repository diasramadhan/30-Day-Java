import javax.swing.*;
import java.awt.*;

public class JColorChooserApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JButton button = new JButton("Pick a color");
        JLabel label = new JLabel();
        label.setBackground(Color.black);
        label.setText("This is some text :D");
        label.setFont(new Font("MV Boli",Font.PLAIN,100));
        label.setOpaque(true);

        //event
        button.addActionListener(e -> {
//            JColorChooser colorChooser = new JColorChooser();

            Color color = JColorChooser.showDialog(null,"Pick a color..I guess",Color.black);
        } );

        frame.add(button);
        frame.add(label);
        frame.pack();
        frame.setVisible(true);
    }
}
