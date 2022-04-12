import java.util.*;

public class FindTheLargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number(as integers): ");
        int largest = input.nextInt();

        int counter = 1;
        int number;
        while ( counter < 10 ) {
            System.out.print("Enter number(as integers): ");
            number = input.nextInt();
            //largest = number;
            if (number > largest)
                largest = number;

            counter++;
        }
        System.out.printf("%nLargest number is: %d%n", largest);
    }
}
