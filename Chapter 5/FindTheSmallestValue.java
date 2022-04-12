import java.util.Scanner;

public class FindTheSmallestValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter integer of integer: ");
        int integer = input.nextInt();

        int smallest = 0;

        for (int counter = 1; counter <= integer; counter++) {
            System.out.print("Enter the integer: ");
            int number = input.nextInt();

            if (counter == 1)
                smallest = number;
            else if (number < smallest)
                smallest = number;
        }
        System.out.printf("%nSmallest integer is: %d", smallest);
    }
}
