import java.io.*;
import java.util.*;

public class ComparingIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();

        if (firstNumber > secondNumber)
            System.out.printf("%d is larger", firstNumber);
        if (firstNumber < secondNumber)
            System.out.printf("%d is larger", secondNumber);
        if (firstNumber == secondNumber)
            System.out.printf("These numbers are equal");
    }
}
