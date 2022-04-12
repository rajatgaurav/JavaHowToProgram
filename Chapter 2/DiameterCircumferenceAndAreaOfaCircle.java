import java.io.*;
import java.util.*;

public class DiameterCircumferenceAndAreaOfaCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of circle: ");
        int radius = input.nextInt();

//        int diameter = 2 * redius;
//        System.out.printf("Diameter: %d\n", diameter);
//
//        float circumference = 2 * Math.PI * (float)radius;
//        System.out.printf("Circumference: %.2f\n", circumference);
//
//        float area = Math.PI * radius * radius;
//        System.out.printf("Area: %.2f", area);

        System.out.printf("Diameter: %d\n", 2 * radius);
        System.out.printf("Circumference: %.2f\n", 2 * Math.PI * radius);
        System.out.printf("Area: %.2f", Math.PI * radius * radius);
    }
}
