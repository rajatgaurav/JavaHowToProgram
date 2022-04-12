import java.io.*;
import java.util.*;

public class LargestAndSmallestIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();

        System.out.print("Enter third number: ");
        int thirdNumber = input.nextInt();

        System.out.print("Enter fourth number: ");
        int fourthNumber = input.nextInt();

        System.out.print("Enter fifth number: ");
        int fifthNumber = input.nextInt();

        int largest = 0;
        if (firstNumber > largest)
            largest = firstNumber;
        if (secondNumber > largest)
            largest = secondNumber;
        if (thirdNumber > largest)
            largest = thirdNumber;
        if (fourthNumber > largest)
            largest = fourthNumber;
        if (fifthNumber > largest)
            largest = fifthNumber;

        System.out.printf("Largest: %d\n", largest);

        int smallest = 0;
        if (firstNumber > smallest)
            smallest = firstNumber;
        if (secondNumber < smallest)
            smallest = secondNumber;
        if (thirdNumber < smallest)
            smallest = thirdNumber;
        if (fourthNumber < smallest)
            smallest = fourthNumber;
        if (fifthNumber < smallest)
            smallest = fifthNumber;

        System.out.printf("Smallest: %d", smallest);
    }
}
