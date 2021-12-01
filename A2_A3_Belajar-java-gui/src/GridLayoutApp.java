import javax.swing.*;
import java.awt.*;

public class GridLayoutApp {
    public static void main(String[] args) {
//        Layout Manager = Defines the natural layout for components Within a container
//        (Mendefinisikan tata letak untuk komponen Dalam wadah)

//        GridLayout = places components in a grid of cells.
//        (menempatkan komponen dalam kotak sel.)
//                     Each component takes all the available space within its cell,
//        (Setiap komponen mengambil semua ruang yang tersedia di dalam selnya,)
//                     and each cell 1s the same size.
//        (dan setiap sel berukuran sama.)

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new GridLayout(3,3,5,5));

        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));
//        frame.add(new JButton("10"));

        //finally
        frame.setVisible(true);


    }
}
