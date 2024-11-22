package lab1;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class NumberofDays  {

    public static void main(String[] args) {
        Map<String, Integer> monthMap = new HashMap<>();
        initializeMonthMap(monthMap);

        int year = getValidYear();
        String monthInput = getValidMonth(monthMap);

        int month = monthMap.get(monthInput.trim());

        int days = calculateDays(month, year);
        JOptionPane.showMessageDialog(null, "The month of " + monthInput + " in the year " + year + " has " + days + " days.");
    }

    public static void initializeMonthMap(Map<String, Integer> monthMap) {
        monthMap.put("January", 1);
        monthMap.put("Jan", 1);
        monthMap.put("Jan.", 1);
        monthMap.put("1", 1);

        monthMap.put("February", 2);
        monthMap.put("Feb", 2);
        monthMap.put("Feb.", 2);
        monthMap.put("2", 2);

        monthMap.put("March", 3);
        monthMap.put("Mar", 3);
        monthMap.put("Mar.", 3);
        monthMap.put("3", 3);

        monthMap.put("April", 4);
        monthMap.put("Apr", 4);
        monthMap.put("Apr.", 4);
        monthMap.put("4", 4);

        monthMap.put("May", 5);
        monthMap.put("5", 5);

        monthMap.put("June", 6);
        monthMap.put("Jun", 6);
        monthMap.put("6", 6);

        monthMap.put("July", 7);
        monthMap.put("Jul", 7);
        monthMap.put("7", 7);

        monthMap.put("August", 8);
        monthMap.put("Aug", 8);
        monthMap.put("Aug.", 8);
        monthMap.put("8", 8);

        monthMap.put("September", 9);
        monthMap.put("Sep", 9);
        monthMap.put("Sep.", 9);
        monthMap.put("9", 9);

        monthMap.put("October", 10);
        monthMap.put("Oct", 10);
        monthMap.put("Oct.", 10);
        monthMap.put("10", 10);

        monthMap.put("November", 11);
        monthMap.put("Nov", 11);
        monthMap.put("Nov.", 11);
        monthMap.put("11", 11);

        monthMap.put("December", 12);
        monthMap.put("Dec", 12);
        monthMap.put("Dec.", 12);
        monthMap.put("12", 12);
    }

    public static int getValidYear() {
        int year = -1;
        while (year < 0) {
            String yearString = JOptionPane.showInputDialog(null, "Enter  year :");
            if (yearString == null) {
                return -1;
            }
            try {
                year = Integer.parseInt(yearString);
                if (year < 0) {
                    JOptionPane.showMessageDialog(null, "Please enter a non-negative number for the year.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a valid year.");
            }
        }
        return year;
    }

    public static String getValidMonth(Map<String, Integer> monthMap) {
        String monthInput = "";
        while (true) {
            monthInput = JOptionPane.showInputDialog(null, "Enter a month:");
            if (monthInput == null) {
                return null; 
            }
            if (monthMap.containsKey(monthInput.trim())) {
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Invalid month input. Please try again.");
            }
        }
        return monthInput;
    }

    public static int calculateDays(int month, int year) {
        if (month == 2) { 
            return (isLeapYear(year)) ? 29 : 28;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) { 
            return 30;
        } else { 
            return 31;
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
