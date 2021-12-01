import javax.swing.*;

public class LaunchPage {
    JFrame frame = new JFrame();
    JButton button = new JButton("New window");

    public LaunchPage() {

        button.setBounds(100,160,200,40);
        button.setFocusable(false);

        //event
        button.addActionListener(e -> {
            frame.dispose();
            NewWindows newWindows = new NewWindows();
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);

        frame.add(button);
        frame.setVisible(true);
    }
}
