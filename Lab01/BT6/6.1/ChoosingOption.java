package BT6;
import javax.swing.JOptionPane;
public class ChoosingOption {
    static void main(String[] args) {
        int option= JOptionPane.showConfirmDialog(null,
                "Do you want to change the first class ticket?");
        JOptionPane.showMessageDialog(null,
                "You're chosen: " + (option==JOptionPane.YES_OPTION?"Yes":"No"));
        System.exit(0);
    }
}
