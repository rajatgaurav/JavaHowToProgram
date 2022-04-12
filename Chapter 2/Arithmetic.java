import java.io.*;
import java.util.*;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();

//        int sum = firstNumber + secondNumber;
//        System.out.printf("Sum: %d\n", sum);
        System.out.printf("Sum: %d", firstNumber + secondNumber);

//        int product = firstNumber * secondNumber;
//        System.out.printf("Product: %d\n", product);
        System.out.printf("Product: %d", firstNumber * secondNumber);

//        int difference = firstNumber - secondNumber;
//        System.out.printf("Difference: %d\n", difference);
        System.out.printf("Difference: %d", firstNumber - secondNumber);

//        int division = firstNumber / secondNumber;
//        System.out.printf("Sum: %d\n", division);
        System.out.printf("Sum: %d", firstNumber / secondNumber);
    }
}
