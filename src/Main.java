import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Car car = new Car();
//        car.setMake("Porsche");
//        car.setModel("Carrera");
//        car.setColor("Red");
//        car.setDoors(4);
//        car.setConvertible(true);
//        System.out.println("make = " + car.getMake());
//        System.out.println("model = " + car.getModel());
//        System.out.println("color = " + car.getColor());
//        car.describleCar();
//
//        Car targa = new Car();
//        targa.setMake("Porsche");
//        targa.setModel("Targa");
//        targa.setColor("Red");
//        car.setConvertible(false);
//        targa.setDoors(4);
//        targa.describleCar();

        int currentYear = 2023;
        String userDateOfBirth = "1996";

        int dateOfBirth = Integer.parseInt(userDateOfBirth);

        System.out.println("Age = " + (currentYear - dateOfBirth));

        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }
    }

    public static String getInputFromConsole(int currentYear) {

        String name = System.console().readLine("Name: ");
        System.out.println("Hi " + name);

        String dateOfBirth = System.console().readLine("The year you were born: ");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "You are " + age + " years old.";
    }

    public static String getInputFromScanner(int currentYear) {

        Scanner scanner = new Scanner(System.in);

//        String name = System.console().readLine("Name: ");
        System.out.println("Hi ");
        String name = scanner.nextLine();

//        String dateOfBirth = System.console().readLine("The year you were born: ");
//        System.out.println("The year you were born: ");
//        String dateOfBirth = scanner.nextLine();
//        int age = currentYear - Integer.parseInt(dateOfBirth);

        boolean validDOB = false;
        int age = 0;
        do {
            System.out.println("Year of birth >= " + (currentYear - 125) + " and <= " + (currentYear));
            try {
                age = checkData(currentYear, scanner.nextLine());
                validDOB = age < 0 ? false : true;
            } catch (NumberFormatException ex) {
                System.out.println(ex);
                System.out.println("Character not allowed!!! Try again.");
            } catch (NullPointerException ex) {
                System.out.println(ex);
                System.out.println("Character not allowed!!! Try again.");
            }
        } while (!validDOB);

        return "You are " + name + " and you are " + age + " years old.";
    }

    public static int checkData(int currentYear, String dateOfBirth) {
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        if (dob < minimumYear || dob > currentYear) {
            return -1;
        }
        return (currentYear - dob);
    }
}
