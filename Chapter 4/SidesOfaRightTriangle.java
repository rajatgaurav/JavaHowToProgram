import java.util.Scanner;

public class SidesOfaRightTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter side 1: ");
        int side1 = input.nextInt();
        System.out.print("Enter side 2: ");
        int side2 = input.nextInt();
        System.out.print("Enter side 3: ");
        int side3 = input.nextInt();

        boolean trangle;

        trangle = false;

        if ((side1 + side2) == side3)
            trangle = true;
        else if ((side1 + side3) == side2)
            trangle = true;
        else if ((side2 + side3) == side1)
            trangle = true;


        if (trangle)
            System.out.println("These are the sides of a right triangle.");
        else
            System.out.println("These do not form a right triangle.");
    }
}
