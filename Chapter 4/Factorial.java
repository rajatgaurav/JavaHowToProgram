import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive Integer: ");
        int number1 = input.nextInt();

        System.out.printf("%d! is ", number1);

        int factorial = 1;
        while (number1 > 0) {
            factorial *= number1;
            number1--;
        }
        System.out.println(factorial);

        System.out.printf("%nEnter a positive Integer: ");
        int accuracy = input.nextInt();

        int factorial1 = 1;
        int number2 = 1;
        double e = 1.0;
        while (number2 < accuracy) {
            factorial1 *= number2;
            e += 1.0 / factorial1;
            number2++;
        }
        System.out.print("e is ");
        System.out.println(e);

        System.out.printf( "%nEnter a positive Integer: " );
        int x = input.nextInt();
        System.out.print( "Enter desired accuracy of e: " );
        int accuracy1 = input.nextInt();

        int factorial2 = 1;
        int number3 = 1;
        double e1 = 1.0;
        double exponent = 1.0;

        while (number3 < accuracy1) {
            factorial2 *= number3;
            exponent *= x;
            e1 += exponent / factorial2;
            number3++;
        }
        System.out.printf( "e to the %d is ", x );
        System.out.println( e1 );
    }
}
