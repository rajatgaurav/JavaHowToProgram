import java.io.*;
import java.util.*;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number = input.nextInt();

        if (number % 2 == 0)
            System.out.println("Even");
        if (number % 2 != 0)
            System.out.println("Odd");
    }
}
