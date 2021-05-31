import javax.swing.*;

public class Equation {
    public static void main(String[] args) {
        Double option;
        option = Double.parseDouble(JOptionPane.showInputDialog("Enter option:\n1. The first degree equation (linear equation) with one variable\n2. The first degree equation (linear equation) with two variables\n3. The second degree equation with one variable"));
        Solve solve = new Solve();

        if (option == 1) solve.firstDegreeOneVariable();
        else if (option == 2) solve.firstDegreeTwoVariable();
        else if (option == 3) solve.secondDegreeTwoVariable();
        else JOptionPane.showMessageDialog(null, "Wrong option!");

        System.exit(0);
    }
}
