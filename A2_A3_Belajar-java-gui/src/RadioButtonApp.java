import javax.swing.*;
import java.awt.*;

public class RadioButtonApp {
    public static void main(String[] args) {

        JFrame frame =  new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JRadioButton pizzaButton = new JRadioButton("Pizza");
        JRadioButton hamburgerButton = new JRadioButton("Hamburger");
        JRadioButton hotdogButton = new JRadioButton("Hotdog");

        //gruop button
        ButtonGroup eatGroup = new ButtonGroup();
        eatGroup.add(pizzaButton);
        eatGroup.add(hamburgerButton);
        eatGroup.add(hotdogButton);

        //event
        pizzaButton.addActionListener(e -> {
            System.out.println("You ordered pizza");
        });
        hamburgerButton.addActionListener(e -> {
            System.out.println("You ordered hamburger");
        });
        hotdogButton.addActionListener(e -> {
            System.out.println("You ordered hot dog");
        });

        //finally
        frame.add(pizzaButton);
        frame.add(hamburgerButton);
        frame.add(hotdogButton);
        frame.pack();
        frame.setVisible(true);
    }
}
