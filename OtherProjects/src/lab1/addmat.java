package lab1;
import javax.swing.JOptionPane;

public class addmat {

    public static void main(String[] args) {
        int response = JOptionPane.showConfirmDialog(null, 
                "Do you want to use constant matrices?", 
                null, 
                JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.NO_OPTION){
            String rowsinput = JOptionPane.showInputDialog("Enter the number of rows:");
            String colsinput = JOptionPane.showInputDialog("Enter the number of columns:");
            int rows = Integer.parseInt(rowsinput);
            int cols = Integer.parseInt(colsinput);

            int[][] matrixA = new int[rows][cols];
            int[][] matrixB = new int[rows][cols];
            int[][] resultMatrix = new int[rows][cols];
            
            for (int i = 0; i < rows; i++) {
                StringBuilder prompt = new StringBuilder("Enter elements for Row " + (i + 1) + " of matrix A (separated by spaces):");
                String input = JOptionPane.showInputDialog(prompt.toString());
                String[] elements = input.split(" ");
                for (int j = 0; j < cols; j++) {
                    matrixA[i][j] = Integer.parseInt(elements[j]);
                }
            }

            for (int i = 0; i < rows; i++) {
                StringBuilder prompt = new StringBuilder("Enter elements for Row " + (i + 1) + " of matrix B (separated by spaces):");
                String input = JOptionPane.showInputDialog(prompt.toString());
                String[] elements = input.split(" ");
                for (int j = 0; j < cols; j++) {
                    matrixB[i][j] = Integer.parseInt(elements[j]);
                }
            }

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
                }
            }

            StringBuilder result = new StringBuilder("Resultant matrix is\n");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    result.append(resultMatrix[i][j]).append(" ");
                }
                result.append("\n");
            }

            JOptionPane.showMessageDialog(null, result.toString());
        }else if (response == JOptionPane.YES_OPTION){
            
            
            JOptionPane.showMessageDialog(null, "matrix1 is\n" + "1 2\n3 4");
            JOptionPane.showMessageDialog(null, "matrix2 is\n" + "5 6\n7 8");
            JOptionPane.showMessageDialog(null, "Resultant matrix is\n" + "6 8\n10 12");
        }
    }
}
