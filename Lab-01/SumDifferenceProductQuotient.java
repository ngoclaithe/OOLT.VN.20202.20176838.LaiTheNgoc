import javax.swing.*;

public class SumDifferenceProductQuotient {
    public static void main(String[] args) {
        String strNum1, strNum2;
        Double num1, num2;

        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        num1 = Double.parseDouble(strNum1);

        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        num2 = Double.parseDouble(strNum2);

        JOptionPane.showMessageDialog(null, "Sum: " + (num1 + num2));
        JOptionPane.showMessageDialog(null, "Difference: " + (num1 - num2));
        JOptionPane.showMessageDialog(null, "Product: " + (num1 * num2));
        if (num2 != 0) {
            JOptionPane.showMessageDialog(null, "Quotient: " + (num1 / num2));
        } else {
            JOptionPane.showMessageDialog(null, " Second number is 0");
        }
        System.exit(0);
    }
}
