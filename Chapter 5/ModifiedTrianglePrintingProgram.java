public class ModifiedTrianglePrintingProgram {
    public static void main(String[] args) {
        int row, column, space;

        for ( row = 1; row <= 10; row++ ) {
            for ( column = 1; column <= row; column++ )
                System.out.print('*');
            for ( space = 1; space <= 10 - row; space++ )
                System.out.print(" ");

            System.out.print("\t");

            for ( column = 10; column >= row; column-- )
                System.out.print( "*" );
            for ( space = 1; space < row; space++ )
                System.out.print( " " );

            System.out.print("\t");

            for ( space = 1; space < row; space++ )
                System.out.print( " " );
            for ( column = 10; column >= row; column-- )
                System.out.print( "*" );

            System.out.print("\t");

            for ( space = 10; space > row; space-- )
                System.out.print( " " );
            for ( column = 1; column <= row; column++ )
                System.out.print( "*" );

            System.out.println();
        }
    }
}

