import java.util.*;

public class PrintingTheDecimalEquivalentOfABinaryNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );

        int bit = 1;
        int decimal = 0;

        System.out.print( "Enter a binary number: " );
        int binary = input.nextInt();

        while (binary != 0) {
            decimal += binary % 10 * bit;
            binary /= 10;
            bit *= 2;
        }
        System.out.printf( "Decimal is: %d\n", decimal );
    }
}
