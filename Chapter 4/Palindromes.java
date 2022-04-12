import java.util.*;

public class Palindromes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter five-digits integer (-1 to end): ");
        int number = input.nextInt();

        while (number != -1) {
            if (number > 9999 && number < 100000) {
                int a = number / 10000 % 10;
                int b = number / 1000 % 10;
                int c = number / 100 % 10;
                int d = number / 10 % 10;
                int e = number % 10;

                if (a == e && b == d) {
                    System.out.println("Palindrome");
                    return;
                } else {
                    System.out.printf("Not a Palindrome%n");
                    System.out.println();
                }
            } else {
                System.out.printf("%nError!%nPlease Enter 5 digits number%n%n");
            }
            System.out.print("Enter five-digits integer (-1 to end): ");
            number = input.nextInt();
        }
    }
}
