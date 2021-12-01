import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyframeWithButton extends JFrame {
    public MyframeWithButton() throws HeadlessException {
        JButton button =  new JButton("Button");
        button.setBounds(200,100,100,50);
        button.addActionListener(e -> {
            System.out.println("poo");
        });

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
    }
}
