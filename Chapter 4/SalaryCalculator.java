import java.util.*;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 1;
        double hours, rate, pay;
        System.out.print("Enter employee weekly working hours (-1 to end): ");
        hours = input.nextDouble();
        while (hours != -1) {
            System.out.print("Enter employee hourly rate: ");
            rate = input.nextDouble();

            if (hours >= 1 && hours <= 40)
                pay = hours * rate;
            else
                pay = (hours * rate) + (hours - 40) * (rate * 1.5);

            System.out.printf("Total pay for %d employee is $%.2f%n%n",count, pay);
            count++;

            System.out.print("Enter employee weekly working hours (-1 to end): ");
            hours = input.nextInt();
        }
    }
}
