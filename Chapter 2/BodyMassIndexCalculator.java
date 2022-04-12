import java.io.*;
import java.util.*;

public class BodyMassIndexCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight(Kilograms): ");
        double weightInKilograms = input.nextDouble();

        System.out.print("Enter your height(Meters): ");
        double heightInMeters = input.nextDouble();

//        double bmi = weightInKilograms / (heightInMeters * heightInMeters);
//        System.out.printf("\nBMI Values: %.1f\n", bmi);

        System.out.printf("\nBMI Values: %.1f\n", weightInKilograms / (heightInMeters * heightInMeters));

        System.out.printf("\nBMI VALUES\nUnberweight: less then 18.5\nNormal:\t\t between 18.5 and 24.9\nOverweight:\t between 25 and 29.5\nObese:\t\t 30 or greater");
    }
}
