import java.util.Scanner;
public class Challenger1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        double sum = 0;

        do {
            System.out.println("Enter number #" + counter + "");
            String nextNumber = scanner.nextLine();
            try {
                double number = Double.parseDouble(nextNumber);
                counter++;
                sum += number;
            } catch (NumberFormatException character) {
                System.out.println("Invalid Number" + character);
            }
        } while (counter <= 5);
        System.out.println("The sum of 5 numbers = " + sum);
    }
}
