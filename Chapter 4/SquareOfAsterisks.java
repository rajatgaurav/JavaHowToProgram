import java.util.*;

public class SquareOfAsterisks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print( "Enter length of side (from 1 to 20): ");
        int stars = input.nextInt();

        if (stars < 1 || stars > 20) {
            System.out.println( "Invalid Input\nUsing default value 1 - 20");
            return;
        }

        int row = 1;

        while (row <= stars) {
            int column = 1;

            while (column <= stars) {
                if (row == 1)
                    System.out.print("*");
                else if (row == stars)
                    System.out.print("*");
                else if (column == 1)
                    System.out.print("*");
                else if (column == stars)
                    System.out.print("*");
                else
                    System.out.print(" ");

                column++;
            }

            System.out.println();
            row++;
        }
    }
}
