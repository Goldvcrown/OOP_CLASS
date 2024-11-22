package lab1;
import javax.swing.JOptionPane;

public class DisplayTriangle {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter the height of the triangle:");

        int n = Integer.parseInt(input);

        StringBuilder triangle = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                triangle.append(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                triangle.append("*");
            }

            triangle.append("\n");
        }

        JOptionPane.showMessageDialog(null, triangle.toString());
    }
}
