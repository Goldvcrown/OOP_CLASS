package lab1;
import javax.swing.JOptionPane;

public class EquationSolver {
    public static void main(String[] args) {
        String[] options = {"Linear Equation", "Quadratic Equation", "System of Linear Equations"};
        int choice = JOptionPane.showOptionDialog(
                null, 
                "Which type of equation would you like to solve?", 
                null,
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.INFORMATION_MESSAGE, 
                null, 
                options, 
                options[0]);

        if (choice == 0) {
            String aInput = JOptionPane.showInputDialog("Enter coefficient a (a != 0):");
            double a = Double.parseDouble(aInput);

            String bInput = JOptionPane.showInputDialog("Enter coefficient b:");
            double b = Double.parseDouble(bInput);

            if (a == 0) {
                JOptionPane.showMessageDialog(null, "Can't solve, coefficient 'a' cannot be zero.");
            } else {
                double x = -b / a;
                JOptionPane.showMessageDialog(null, "The solution to the linear equation is x = " + x);
            }

        } else if (choice == 1) {
            double a = Double.parseDouble(JOptionPane.showInputDialog("Enter coefficient a (a ≠ 0):"));
            double b = Double.parseDouble(JOptionPane.showInputDialog("Enter coefficient b:"));
            double c = Double.parseDouble(JOptionPane.showInputDialog("Enter coefficient c:"));

            if (a == 0) {
                JOptionPane.showMessageDialog(null, "Can't solve, coefficient 'a' cannot be zero for a quadratic equation.");
            } else {
                double discriminant = b * b - 4 * a * c;

                if (discriminant > 0) {
                    double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                    double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                    JOptionPane.showMessageDialog(null, "The equation has two distinct real roots: x1 = " + x1 + ", x2 = " + x2);
                } else if (discriminant == 0) {
                    double x = -b / (2 * a);
                    JOptionPane.showMessageDialog(null, "The equation has one double root: x = " + x);
                } else {
                    JOptionPane.showMessageDialog(null, "The equation has no real roots.");
                }
            }

        } else if (choice == 2) {
            double a11 = Double.parseDouble(JOptionPane.showInputDialog("Enter a11:"));
            double a12 = Double.parseDouble(JOptionPane.showInputDialog("Enter a12:"));
            double b1 = Double.parseDouble(JOptionPane.showInputDialog("Enter b1:"));
            double a21 = Double.parseDouble(JOptionPane.showInputDialog("Enter a21:"));
            double a22 = Double.parseDouble(JOptionPane.showInputDialog("Enter a22:"));
            double b2 = Double.parseDouble(JOptionPane.showInputDialog("Enter b2:"));

            double D = a11 * a22 - a21 * a12;
            double D1 = b1 * a22 - b2 * a12;
            double D2 = a11 * b2 - a21 * b1;

            if (D == 0) {
                if (D1 == 0 && D2 == 0) {
                    JOptionPane.showMessageDialog(null, "The system has infinitely many solutions.");
                } else {
                    JOptionPane.showMessageDialog(null, "The system has no solution.");
                }
            } else {
                double x1 = D1 / D;
                double x2 = D2 / D;
                JOptionPane.showMessageDialog(null, "The solution is x1 = " + x1 + ", x2 = " + x2);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No valid selection made.");
        }
    }
}
