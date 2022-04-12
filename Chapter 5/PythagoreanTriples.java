public class PythagoreanTriples {
    public static void main(String[] args) {
        int side1, side2, hypotenuse;

        for ( side1 = 1; side1 <= 500; side1++ )
            for ( side2 = 1; side2 <= 500; side2++ )
                for ( hypotenuse = 1; hypotenuse <= 500; hypotenuse++ )
                    if ( ( side1 * side1 ) + ( side2 * side2 ) == ( hypotenuse * hypotenuse ) )
                        System.out.printf( "s1: %d, s2: %d, h: %d\n", side1, side2, hypotenuse );
    }
}
