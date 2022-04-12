import java.io.*;
import java.util.*;

public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();

        if (firstNumber % secondNumber == 0)
            System.out.printf("%d is multiples of %d", firstNumber, secondNumber);
        if (firstNumber % secondNumber != 0)
            System.out.printf("%d is not multiples of %d", firstNumber, secondNumber);
    }
}
