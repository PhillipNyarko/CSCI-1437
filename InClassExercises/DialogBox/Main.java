import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog("Please Enter your name");
        JOptionPane.showInputDialog(null, "Your name is " + name);
    }
}
