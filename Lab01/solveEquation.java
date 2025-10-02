package Lab01;
import javax.swing.JOptionPane;

public class solveEquation {
    public static void main(String[] args) {
        String type = JOptionPane.showInputDialog(null, 
            "Enter type of equation:\n1 - Linear (ax+b=0)\n2 - System of 2 linear equations\n3 - Quadratic (ax^2+bx+c=0)",
            "Equation Solver", JOptionPane.INFORMATION_MESSAGE);

        int option = Integer.parseInt(type);

        switch (option) {
            case 1: // ax + b = 0
                String strA = JOptionPane.showInputDialog(null, "Enter a:");
                String strB = JOptionPane.showInputDialog(null, "Enter b:");
                double a = Double.parseDouble(strA);
                double b = Double.parseDouble(strB);

                if (a == 0) {
                    if (b == 0) {
                        JOptionPane.showMessageDialog(null, "Infinite solutions.");
                    } else {
                        JOptionPane.showMessageDialog(null, "No solution.");
                    }
                } else {
                    double x = -b / a;
                    JOptionPane.showMessageDialog(null, "Solution: x = " + x);
                }
                break;

            case 2: // Hệ 2 PT bậc nhất
                double a11 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter a11:"));
                double a12 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter a12:"));
                double b1  = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter b1:"));
                double a21 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter a21:"));
                double a22 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter a22:"));
                double b2  = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter b2:"));

                double D  = a11 * a22 - a21 * a12;
                double D1 = b1 * a22 - b2 * a12;
                double D2 = a11 * b2 - a21 * b1;

                if (D != 0) {
                    double x1 = D1 / D;
                    double x2 = D2 / D;
                    JOptionPane.showMessageDialog(null, "Solution: x1 = " + x1 + ", x2 = " + x2);
                } else {
                    if (D1 == 0 && D2 == 0) {
                        JOptionPane.showMessageDialog(null, "Infinite solutions.");
                    } else {
                        JOptionPane.showMessageDialog(null, "No solution.");
                    }
                }
                break;

            case 3: // ax^2 + bx + c = 0
                double qa = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter a:"));
                double qb = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter b:"));
                double qc = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter c:"));

                if (qa == 0) {
                    JOptionPane.showMessageDialog(null, "This is not a quadratic equation (a=0).");
                } else {
                    double delta = qb * qb - 4 * qa * qc;
                    if (delta < 0) {
                        JOptionPane.showMessageDialog(null, "No real roots.");
                    } else if (delta == 0) {
                        double x = -qb / (2 * qa);
                        JOptionPane.showMessageDialog(null, "Double root: x = " + x);
                    } else {
                        double x1 = (-qb + Math.sqrt(delta)) / (2 * qa);
                        double x2 = (-qb - Math.sqrt(delta)) / (2 * qa);
                        JOptionPane.showMessageDialog(null, "Roots: x1 = " + x1 + ", x2 = " + x2);
                    }
                }
                break;

            default:
                JOptionPane.showMessageDialog(null, "Invalid option.");
        }
    }
}