public class TheTwelveDaysOfChristmasSong {
    public static void main(String[] args) {
        for ( int day = 1; day <= 12; day++ ) {
            System.out.print( "On the " );

            switch ( day ) {
                case 1:
                    System.out.print( "first" );
                    break;
                case 2:
                    System.out.print( "second" );
                    break;
                case 3:
                    System.out.print( "third" );
                    break;
                case 4:
                    System.out.print( "fourth" );
                    break;
                case 5:
                    System.out.print( "fifth" );
                    break;
                case 6:
                    System.out.print( "sixth" );
                    break;
                case 7:
                    System.out.print( "seventh" );
                    break;
                case 8:
                    System.out.print( "eighth" );
                    break;
                case 9:
                    System.out.print( "ninth" );
                    break;
                case 10:
                    System.out.print( "tenth" );
                    break;
                case 11:
                    System.out.print( "eleventh" );
                    break;
                case 12:
                    System.out.print( "twelfth" );
                    break;
            }
            System.out.println(" day of Christmas, my true love gave to me:" );

            switch ( day ) {
                case 12:
                    System.out.println( "Twelve lords-a-leaping," );
                case 11:
                    System.out.println( "Eleven pipers piping," );
                case 10:
                    System.out.println( "Ten drummers drumming," );
                case 9:
                    System.out.println( "Nine ladies dancing," );
                case 8:
                    System.out.println( "Eight maids-a-milking," );
                case 7:
                    System.out.println( "Seven swans-a-swimming," );
                case 6:
                    System.out.println( "Six geese-a-laying," );
                case 5:
                    System.out.println( "Five golden rings." );
                case 4:
                    System.out.println( "Four calling birds," );
                case 3:
                    System.out.println( "Three French hens," );
                case 2:
                    System.out.println( "Two turtle doves, and" );
                case 1:
                    System.out.println( "a Partridge in a pear tree." );
            }
            System.out.println();
        }
    }
}
