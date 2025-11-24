package code;
import javax.swing.*;

public class ChoosingOption {
    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(null,
                "Do you want to change to the first class ticket?");
        JOptionPane.showMessageDialog(null,
                "You have chosen: " + (option == JOptionPane.YES_OPTION ? "Yes" :
                                      option == JOptionPane.NO_OPTION ? "No" : "Cancel"));

        // Custom option
        Object[] options = {"I do", "I don't"};
        int choice = JOptionPane.showOptionDialog(null,
                "Do you love Java?",
                "Custom Option Dialog",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);
        JOptionPane.showMessageDialog(null, "Your choice: " + options[choice]);
    }
}
