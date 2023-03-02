import java.util.Scanner;

public class Challenger2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double max = 0;
        double min = 0;
        int loopCount = 0;

        while (true) {
            System.out.println("Enter any number or character to exit: ");
            String nextEntry = scanner.nextLine();
            try {
                double validNum = Double.parseDouble(nextEntry);
                if (loopCount == 0 || validNum < min) {
                    min = validNum;
                }
                if (loopCount == 0 || validNum > max) {
                    max = validNum;
                }
                loopCount++;
            } catch (Exception num) {
                break;
            }
        }
        if (loopCount > 0) {
            System.out.println("Min = " + min + ", Max = " + max);
        } else {
            System.out.println("No valid data entered!");
        }
    }
}
