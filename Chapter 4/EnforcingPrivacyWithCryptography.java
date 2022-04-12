import java.util.Scanner;

public class EnforcingPrivacyWithCryptography {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );

        System.out.print( "Enter a four-digit number: " );
        int number = input.nextInt();

        int digit1 = ( number / 1000 + 7 ) % 10;
        int digit2 = ( number % 1000 / 100 + 7 ) % 10;
        int digit3 = ( number % 100 / 10 + 7 ) % 10;
        int digit4 = ( number % 10 + 7 ) % 10;
        int encryptedNumber = digit1 * 10 + digit2 + digit3 * 1000 + digit4 * 100;

        System.out.printf( "Encrypted number is %d\n", encryptedNumber );

        System.out.printf( "%nEnter a four-digit number: " );
        int number1 = input.nextInt();

        int digit11 = ( number1 / 1000 + 3 ) % 10;
        int digit21 = ( number1 % 1000 / 100 + 3 ) % 10;
        int digit31 = ( number1 % 100 / 10 + 3 ) % 10;
        int digit41 = ( number1 % 10 + 3 ) % 10;

        int decryptedNumber = digit11 * 10 + digit21 + digit31 * 1000 + digit41 * 100;

        System.out.printf( "Decrypted number is %d\n", decryptedNumber );
    }
}
