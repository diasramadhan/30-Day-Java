import javax.print.attribute.standard.Sides;
import javax.swing.*;
import java.awt.*;

public class SlidersApp {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Demo Slider");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);

        JPanel panel = new JPanel();


        JSlider slider = new JSlider(0,100,50);
        slider.setPreferredSize(new Dimension(400,200));
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);
        slider.setPaintLabels(true);
        slider.setOrientation(JSlider.VERTICAL);

        JLabel label = new JLabel();
        label.setText("Celcius = " + slider.getValue());
        //EVENT
        slider.addChangeListener(e -> {
            label.setText("Celcius = " + slider.getValue());
        });

//        //EVENT
//        label.addVetoableChangeListener(evt -> {
//            label.setText("Celcius = " + slider.getValue());
//        });

        //finally
        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setVisible(true);
    }
}
