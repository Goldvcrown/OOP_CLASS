package lab1;
import java.util.Scanner;
public class InputFromKeyboard {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("what's your name?");
        String strname = keyboard.nextLine();
        System.out.println("how old are you?");
        int iAge = keyboard.nextInt();
        System.out.println("how tall are you(m)?");
        double dHeight = keyboard.nextDouble();
        System.out.println("mrs/ms." + strname + ", " + iAge + "years old. " + "your height is " + dHeight + ".");

    }
}
