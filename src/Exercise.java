import java.util.Scanner;
public class Exercise {
    public static void main(String[] args) {
        canPack(5,3,24);
        getLargestPrime();
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        boolean result = false;
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            System.out.println("false");
            return result;
        }

        if ((bigCount * 5) + smallCount >= goal) {
            while (goal > 0) {
                if (goal >= 5) {
                    if (bigCount >= 1) {
                        goal -= 5;
                        bigCount--;
                    } else if (smallCount >= goal) {
                        goal = 0;
                        System.out.println("true");
                        return true;
                    } else {
                        System.out.println("false");
                        return false;
                    }
                } else if (goal < 5) {
                    if (smallCount >= goal) {
                        goal = 0;
                        System.out.println("true");
                        return true;
                    } else {
                        System.out.println("false");
                        return false;
                    }
                }
            }
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    public static int getLargestPrime() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("Invalid Number");
            return -1;
        } else {
            if (number > 1) {
            int i;
            for (i = 2; i <= number; i++) {
                if (number % i == 0) {
                    number /= i;
                    i--;
                }
            }
            System.out.println(i);
                return i;
            } else {
                return -1;
            }
        }
    }
}
