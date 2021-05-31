import javax.swing.*;

public class Solve {
    public void firstDegreeOneVariable() {
        double a, b, c, x;
        a = Double.parseDouble(JOptionPane.showInputDialog(null, "a * x + b = c\nEnter a: "));
        b = Double.parseDouble(JOptionPane.showInputDialog(null, "a * x + b = c\nEnter b: "));
        c = Double.parseDouble(JOptionPane.showInputDialog(null, "a * x + b = c\nEnter c: "));
        if (a == 0 && c - b != 0) {
            JOptionPane.showMessageDialog(null, "The equation has no solution");
        } else if (a == 0 && c - b == 0) {
            JOptionPane.showMessageDialog(null, "The equation has countless solutions");
        } else {
            JOptionPane.showMessageDialog(null, "x = " + ((c - b) / a));
        }
    }

    public void firstDegreeTwoVariable() {
        double a1, b1, c1, a2, b2, c2;
        a1 = Double.parseDouble(JOptionPane.showInputDialog(null, "a1 * x + b1 * y = c1\na2 * x + b2 * y = c2\nEnter a1: "));
        b1 = Double.parseDouble(JOptionPane.showInputDialog(null, "a1 * x + b1 * y = c1\na2 * x + b2 * y = c2\nEnter b1: "));
        c1 = Double.parseDouble(JOptionPane.showInputDialog(null, "a1 * x + b1 * y = c1\na2 * x + b2 * y = c2\nEnter c1: "));
        a2 = Double.parseDouble(JOptionPane.showInputDialog(null, "a1 * x + b1 * y = c1\na2 * x + b2 * y = c2\nEnter a2: "));
        b2 = Double.parseDouble(JOptionPane.showInputDialog(null, "a1 * x + b1 * y = c1\na2 * x + b2 * y = c2\nEnter b2: "));
        c2 = Double.parseDouble(JOptionPane.showInputDialog(null, "a1 * x + b1 * y = c1\na2 * x + b2 * y = c2\nEnter c2: "));

        double d, d1, d2;
        d = a1 * b2 - a2 * b1;
        d1 = c1 * b2 - c2 * b1;
        d2 = a1 * c2 - a2 * c1;
        if (d != 0) {
            double e = d1 / d;
            double e1 = d2 / d;
            JOptionPane.showMessageDialog(null, "The equation has one solution x = " + e + " and y= " + e1);
        } else if ((d == 0 && d1 != 0) || (d == 0 && d2 != 0)) {
            JOptionPane.showMessageDialog(null, "The equation has no solution");
        } else if (d == 0 && d1 == 0 && d2 == 0) {
            JOptionPane.showMessageDialog(null, "The equation has countless solutions");
        }

    }

    public void secondDegreeTwoVariable() {
        double a, b, c;
        a = Double.parseDouble(JOptionPane.showInputDialog(null, "a * x^2 + b * x + c = 0\nEnter a: "));
        b = Double.parseDouble(JOptionPane.showInputDialog(null, "a * x^2 + b * x + c = 0\nEnter b: "));
        c = Double.parseDouble(JOptionPane.showInputDialog(null, "a * x^2 + b * x + c = 0\nEnter c: "));

        if (a == 0) {
            if (b == 0) {
                JOptionPane.showMessageDialog(null, "The equation has no solution");
            } else {
                JOptionPane.showMessageDialog(null, "The equation has one solution: x = " + (-c / b));
            }
        }
        double delta = b * b - 4 * a * c;
        double x1, x2;
        if (delta > 0) {
            x1 = ((-b + Math.sqrt(delta)) / (2 * a));
            x2 = ((-b - Math.sqrt(delta)) / (2 * a));
            JOptionPane.showMessageDialog(null, "The equation has two solutions x1 = " + x1 + " and x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            JOptionPane.showMessageDialog(null, "The equation has one solution: x = " + x1);
        } else {
            JOptionPane.showMessageDialog(null, "The equation has no solution");
        }
    }
}
