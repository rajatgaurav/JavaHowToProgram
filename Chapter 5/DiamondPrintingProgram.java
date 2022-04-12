public class DiamondPrintingProgram {
    public static void main(String[] args) {
        int row, stars, spaces;

        for ( row = 1; row <= 5; row++ ) {

            for ( spaces = 5; spaces > row; spaces-- )
                System.out.print( " " );

            for ( stars = 1; stars <= ( 2 * row ) - 1; stars++ )
                System.out.print( "*" );

            System.out.println();
        }

        for ( row = 4; row >= 1; row-- ) {

            for ( spaces = 5; spaces > row; spaces-- )
                System.out.print( " " );

            for ( stars = 1; stars <= ( 2 * row ) - 1; stars++ )
                System.out.print( "*" );

            System.out.println();
        }
    }
}
