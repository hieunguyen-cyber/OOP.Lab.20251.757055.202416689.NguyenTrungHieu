package code;
import javax.swing.JOptionPane;
//ax + b = 0
public class FirstDegreeEquation {
    public static void main(String[] args){
        String sa0,sb0;

        sa0 = JOptionPane.showInputDialog(null, "Please enter the value of a:","Enter the value of a", JOptionPane.INFORMATION_MESSAGE);
        sb0 = JOptionPane.showInputDialog(null,"Please enter the value of b:","Enter the value of b", JOptionPane.INFORMATION_MESSAGE);
        
        double a = Double.parseDouble(sa0);
        double b = Double.parseDouble(sb0);
        
        if (a == 0){
            if (b == 0){
                JOptionPane.showMessageDialog(null, "All real numbers are root", "Answer",JOptionPane.INFORMATION_MESSAGE );
            }
            else {
                JOptionPane.showMessageDialog(null, "No real roots", "Answer",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"x="+ -b/a, "Answer",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
