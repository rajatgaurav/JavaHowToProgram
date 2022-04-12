import java.util.Scanner;

public class BarChartPrintingProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 1 , value = 0, number1 = 0, number2 = 0, number3 = 0, number4 = 0, number5 = 0;

        while (counter <= 5) {
            System.out.print("Enter Number: ");
            int number = input.nextInt();

            if (number >= 1 && number <= 30) {
                switch (counter) {
                    case 1 -> number1 = number;
                    case 2 -> number2 = number;
                    case 3 -> number3 = number;
                    case 4 -> number4 = number;
                    case 5 -> number5 = number;
                }
                    counter++;
                } else {
                    System.out.println("Invalid Input\nNumber should be between 1 and 30" );
            }
        }

        for (counter = 1; counter <= 5; counter++) {
            switch (counter) {
                case 1 -> value = number1;
                case 2 -> value = number2;
                case 3 -> value = number3;
                case 4 -> value = number4;
                case 5 -> value = number5;
            }
            for (int i = 1; i <= value; i++)
                System.out.print("*");
            System.out.println();
        }
    }
}
