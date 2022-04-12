import java.util.Scanner;

public class ModifiedDiamondPrintingProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );

        int row, stars, spaces, numRows;

        do {
            System.out.print("Enter number of rows (odd number 1 to 19): " );
            numRows = input.nextInt();
        } while((numRows>19)||(numRows<0)|| ( numRows % 2 == 0 ) );

        for ( row = 1; row < ( numRows / 2 ) + 1; row++ ) {
            for ( spaces = numRows / 2; spaces >= row; spaces-- )
                System.out.print( " " );

            for ( stars = 1; stars <= ( 2 * row ) - 1; stars++ )
                System.out.print( "*" );

            System.out.println();
        }

        for ( ; row >= 1; row-- ) {
            for ( spaces = numRows /2; spaces >= row; spaces-- )
                System.out.print( " ");

            for ( stars = 1; stars <=( 2 * row ) - 1; stars++ )
                System.out.print( "*" );

            System.out.println();
        }
    }
}
