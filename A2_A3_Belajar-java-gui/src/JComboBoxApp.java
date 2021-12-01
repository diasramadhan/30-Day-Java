import javax.swing.*;
import java.awt.*;

public class JComboBoxApp {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
//        frame.setLocationRelativeTo(null);

        JComboBox<String> comboBox = new JComboBox<String>(new String[]{
                "Senin","Selasa","Rabu","Kamis","Jumat","Sabtu","Minggu"
        });
        //EVENT
        comboBox.addActionListener(e -> {
            System.out.println(comboBox.getSelectedItem());
        });

        //finally
        frame.add(comboBox);
        frame.pack();
        frame.setVisible(true);
    }
}
