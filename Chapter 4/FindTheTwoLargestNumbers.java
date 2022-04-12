import java.util.*;

public class FindTheTwoLargestNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secondLargest;
        System.out.print("Enter number(as integers): ");
        int largest = input.nextInt();
        System.out.print("Enter number(as integers): ");
        int number = input.nextInt();

        if (number > largest) {
            secondLargest = largest;
            largest = number;
        } else
            secondLargest = number;

        int counter = 2;


        while ( counter < 10 ) {
            System.out.print("Enter number(as integers): ");
            number = input.nextInt();
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest)
                secondLargest = number;

            counter++;
        }
        System.out.printf("%nLargest number is: %d%n", largest);
        System.out.printf("Second largest number is: %d%n", secondLargest);
    }
}
