package lab1;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class WorkwithArray {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter the array (e.g: 1 2 3 4):");
        if (input == null){
            input = "1789 2035 1899 1456 2013";
        }
        String[] inputArray = input.split("\\s+");
        int[] numbers = new int[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            numbers[i] = Integer.parseInt(inputArray[i]);
        }
        Arrays.sort(numbers);

        int sum = calculateSum(numbers);

        double average = calculateAverage(numbers, sum);

        JOptionPane.showMessageDialog(null, "Sorted Array: " + Arrays.toString(numbers));
        JOptionPane.showMessageDialog(null, "Sum: " + sum + "\nAverage: " + average);
    }

    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static double calculateAverage(int[] array, int sum) {
        return (double) sum / array.length;
    }
}
