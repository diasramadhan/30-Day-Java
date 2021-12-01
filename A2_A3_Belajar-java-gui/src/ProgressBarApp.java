import javax.swing.*;

public class ProgressBarApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);


        JProgressBar progressBar = new JProgressBar();
        progressBar.setValue(0);
        progressBar.setBounds(0,0,420,50);
        progressBar.setStringPainted(true);

        frame.add(progressBar);

        //finally
        frame.setVisible(true);
    }
}
