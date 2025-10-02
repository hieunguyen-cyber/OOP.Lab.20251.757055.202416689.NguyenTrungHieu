package Lab01;
import javax.swing.JOptionPane;

public class calculateTwoNumbers {
    public static void main(String[] args){
	String strNum1, strNum2, divisor;
	strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ","Input the first number",JOptionPane.INFORMATION_MESSAGE);
	strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ","Input the first number",JOptionPane.INFORMATION_MESSAGE);
	divisor = JOptionPane.showInputDialog(null, "Please pick the divisor: ","Input the divisor (first/second)",JOptionPane.INFORMATION_MESSAGE);
	double num1 = Double.parseDouble(strNum1);
	double num2 = Double.parseDouble(strNum2);
	double sum = num1 + num2;
	double difference = Math.abs(num2 - num1);
	double product = num1*num2;
	double quotient = 0;
	if (num1 == 0 && divisor.equals("first") ||
    		num2 == 0 && divisor.equals("second")) {
    		JOptionPane.showMessageDialog(null, "Error: Division by zero!");
    		System.exit(1);
	}
	if (divisor.equals("first")) {
    		quotient = num2 / num1;
	} else if (divisor.equals("second")) {
    		quotient = num1 / num2;
	}
	JOptionPane.showMessageDialog(null,
    		"Sum: " + sum +
    		"\nDifference: " + difference +
    		"\nProduct: " + product +
    		"\nQuotient: " + quotient
	);
	System.exit(0);
    }
}
