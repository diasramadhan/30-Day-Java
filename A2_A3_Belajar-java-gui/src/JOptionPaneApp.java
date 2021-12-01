import javax.swing.*;

public class JOptionPaneApp {
    public static void main(String[] args) {
//        JOption Pane
//        pop up a standard dialog box that prompts users for a value
//        or informs them of something

//        JOptionPane.showMessageDialog(null,"This is some useless info","Title",JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showMessageDialog(null,"Here is more useless info","Title",JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null,"Really ? ","Title",JOptionPane.QUESTION_MESSAGE);
//        JOptionPane.showMessageDialog(null,"Youre computer has a VIRUS ","Title",JOptionPane.WARNING_MESSAGE);
//        JOptionPane.showMessageDialog(null,"Call Support Center","Title",JOptionPane.ERROR_MESSAGE);

        //JOptionPane.showConfirmDialog(null,"Bro do you even code","new title",JOptionPane.YES_NO_CANCEL_OPTION);
//        String name = JOptionPane.showInputDialog("What is your name");
//        System.out.println("Hello " + name);

        String[] names = {
                "Dias","Mala","Dima"
        };

        ImageIcon icon = new ImageIcon("LOGO_UNP KOTAK.jpg");

        JOptionPane.showOptionDialog(
                null,
                "What's youre name ?",
                "Names",JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                icon,
                names,
                0);
    }
}
