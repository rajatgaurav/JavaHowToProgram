import java.io.*;
import java.util.*;

public class CarPoolSavingCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Total miles driven per day: ");
        int totalMiles = input.nextInt();

        System.out.print("Cost per gallon of gasoline: ");
        int gasolineCost = input.nextInt();

        System.out.print("Average miles per gallon: ");
        int averageMiles = input.nextInt();

        System.out.print("Parking fee per day: ");
        int parkingFee = input.nextInt();

        System.out.print("Tolls per day: ");
        int tolls = input.nextInt();

//        int dailyDrivingCost = (totalMiles / averageMiles) * gasolineCost + parkingFee + tolls;
//        System.out.printf("\nYour Daily Driving Cost Is: %d\n", dailyDrivingCost);

        System.out.printf("\nYour daily driving cost is: %d\n", (totalMiles / averageMiles) * gasolineCost + parkingFee + tolls);
    }
}
