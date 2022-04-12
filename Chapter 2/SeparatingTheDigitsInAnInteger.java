import java.io.*;
import java.util.*;

public class SeparatingTheDigitsInAnInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 5 digits integer: ");
        int number = input.nextInt();

        if (number >= 10000 && number < 99999) {
            System.out.printf("%d   ", number / 10000);
            System.out.printf("%d   ", number / 1000 % 10);
            System.out.printf("%d   ", number / 100 % 10);
            System.out.printf("%d   ", number % 100 / 10);
            System.out.printf("%d   ", number % 10);

//            int number5 = number / 10000;
//            int number4 = number / 1000 % 10;
//            int number3 = number / 100 % 10;
//            int number2 = number % 100 / 10;
//            int number1 = number % 10;
//
//            System.out.printf("%d   %d   %d   %d   %d", number5, number4, number3, number2, number1);
        }
        if (number > 99999)
            System.out.println("You had entered a number more than five digits.");

        if (number <= 9999)
            System.out.println("You had entered a number less than five digits.");
    }
}
