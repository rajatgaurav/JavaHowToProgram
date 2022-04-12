import java.util.Scanner;

public class SidesOfATriangle {
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

        if (side1 + side2 > side3)
            if (side2 + side3 > side1)
                if (side3 + side1 > side2)
                    trangle = true;

        if (trangle)
            System.out.println("These could be sides to a triangle");
        else
            System.out.println("These do not form a triangle.");
    }
}
