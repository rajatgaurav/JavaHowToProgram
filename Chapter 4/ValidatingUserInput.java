import java.util.*;

public class ValidatingUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value (1 and 2 for end): ");
        int number = input.nextInt();

        while (number != 1 && number != 2) {
            System.out.print("Enter the number (1 and 2 for end): ");
            number = input.nextInt();

            if (number == 1 || number == 2) {
                System.out.println("Input successful validated!");
            }
        }
    }
}
