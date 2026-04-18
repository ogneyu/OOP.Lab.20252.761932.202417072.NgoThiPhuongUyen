package hust.soict.ite6.lab01.BT2;
// Example 3: BT2.HelloNameDialog.java
import javax.swing.JOptionPane;
public class HelloNameDialog {
    static void main() {
        String result;
        result = JOptionPane.showInputDialog("Please enter your name:");
        JOptionPane.showMessageDialog(null, "Hi " + result + "!");
        System.exit(0);
        }
}

