import java.io.*;
import java.util.*;

public class ArithmeticSmallestAndLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();

        System.out.print("Enter third number: ");
        int thirdNumber = input.nextInt();


//        int sum = firstNumber + secondNumber;
//        System.out.printf("Sum: %d\n", sum);
        System.out.printf("Sum: %d\n", firstNumber + secondNumber + thirdNumber);

//        int average = (firstNumber + secondNumber + thirdNumber) / 3;
//        System.out.printf("Average: %d\n", average);
        System.out.printf("Average: %d\n", (firstNumber + secondNumber + thirdNumber) / 3);

//        int product = firstNumber * secondNumber * thirdNumber;
//        System.out.printf("Product: %d\n", product);
        System.out.printf("Product: %d\n", firstNumber * secondNumber * thirdNumber);

        int largest = 0;
        if (firstNumber > largest)
            largest = firstNumber;
        if (secondNumber > largest)
            largest = secondNumber;
        if (thirdNumber > largest)
            largest = thirdNumber;

        System.out.printf("Largest: %d\n", largest);

        int smallest = 0;
        if (firstNumber > smallest)
            smallest = firstNumber;
        if (secondNumber < smallest)
            smallest = secondNumber;
        if (thirdNumber < smallest)
            smallest = thirdNumber;

        System.out.printf("Smallest: %d\n", smallest);
    }
}
