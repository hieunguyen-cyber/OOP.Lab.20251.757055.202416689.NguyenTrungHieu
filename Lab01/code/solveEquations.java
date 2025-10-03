package code;
import javax.swing.JOptionPane;

public class EquationSolver {
    public static void main(String[] args) {
        // Menu lựa chọn
        String choiceStr = JOptionPane.showInputDialog(
            null,
            "Choose type of equation to solve:\n"
            + "1. First Degree Equation (ax + b = 0)\n"
            + "2. First Degree Equation System (a1x1 + a2x2 = a0; b1x1 + b2x2 = b0)\n"
            + "3. Second Degree Equation (ax^2 + bx + c = 0)",
            "Equation Solver",
            JOptionPane.INFORMATION_MESSAGE
        );

        int choice = Integer.parseInt(choiceStr);

        switch (choice) {
            case 1: { // Phương trình bậc 1
                String sa0 = JOptionPane.showInputDialog(null, "Enter value of a:", "Input", JOptionPane.INFORMATION_MESSAGE);
                String sb0 = JOptionPane.showInputDialog(null, "Enter value of b:", "Input", JOptionPane.INFORMATION_MESSAGE);

                double a = Double.parseDouble(sa0);
                double b = Double.parseDouble(sb0);

                if (a == 0) {
                    if (b == 0) {
                        JOptionPane.showMessageDialog(null, "All real numbers are roots", "Answer", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "No real roots", "Answer", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "x = " + (-b / a), "Answer", JOptionPane.INFORMATION_MESSAGE);
                }
                break;
            }

            case 2: { // Hệ phương trình bậc nhất 2 ẩn
                String sa1 = JOptionPane.showInputDialog(null, "Enter a1:", "Input", JOptionPane.INFORMATION_MESSAGE);
                String sa2 = JOptionPane.showInputDialog(null, "Enter a2:", "Input", JOptionPane.INFORMATION_MESSAGE);
                String sa0 = JOptionPane.showInputDialog(null, "Enter a0:", "Input", JOptionPane.INFORMATION_MESSAGE);

                String sb1 = JOptionPane.showInputDialog(null, "Enter b1:", "Input", JOptionPane.INFORMATION_MESSAGE);
                String sb2 = JOptionPane.showInputDialog(null, "Enter b2:", "Input", JOptionPane.INFORMATION_MESSAGE);
                String sb0 = JOptionPane.showInputDialog(null, "Enter b0:", "Input", JOptionPane.INFORMATION_MESSAGE);

                double a1 = Double.parseDouble(sa1);
                double a2 = Double.parseDouble(sa2);
                double a0 = Double.parseDouble(sa0);
                double b1 = Double.parseDouble(sb1);
                double b2 = Double.parseDouble(sb2);
                double b0 = Double.parseDouble(sb0);

                double D = a1 * b2 - a2 * b1;
                double D1x = -(a2 * b0 - a0 * b2);
                double D2x = (a1 * b0 - a0 * b1);

                if (D != 0) {
                    JOptionPane.showMessageDialog(null, "x = " + D1x / D + "\ny = " + D2x / D, "Solution", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    if (a1 * b0 == a0 * b1 && a2 * b0 == a0 * b2) {
                        JOptionPane.showMessageDialog(null, "Infinite solutions", "Result", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "No solution", "Result", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                break;
            }

            case 3: { // Phương trình bậc 2
                String sa = JOptionPane.showInputDialog(null, "Enter a:", "Input", JOptionPane.INFORMATION_MESSAGE);
                String sb = JOptionPane.showInputDialog(null, "Enter b:", "Input", JOptionPane.INFORMATION_MESSAGE);
                String sc = JOptionPane.showInputDialog(null, "Enter c:", "Input", JOptionPane.INFORMATION_MESSAGE);

                double a = Double.parseDouble(sa);
                double b = Double.parseDouble(sb);
                double c = Double.parseDouble(sc);

                if (a == 0) { // quay về bậc 1
                    if (b == 0) {
                        if (c == 0) {
                            JOptionPane.showMessageDialog(null, "All real numbers are roots", "Answer", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "No real roots", "Answer", JOptionPane.INFORMATION_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "x = " + (-c / b), "Answer", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    double delta = b * b - 4 * a * c;
                    if (delta < 0) {
                        JOptionPane.showMessageDialog(null, "No real roots", "Result", JOptionPane.INFORMATION_MESSAGE);
                    } else if (delta == 0) {
                        JOptionPane.showMessageDialog(null, "x = " + (-b / (2 * a)), "Result", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                        JOptionPane.showMessageDialog(null, "x1 = " + x1 + "\n" + "x2 = " + x2, "Result", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                break;
            }

            default:
                JOptionPane.showMessageDialog(null, "Invalid choice!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}