import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {

        System.out.println("n\tn!\n");

        for (int counter = 1; counter <= 20; counter++) {
            long factorial = 1;

            for (int smaller = 1; smaller < counter; smaller++)
                factorial *= smaller;

            System.out.printf("%d\t%d%n", counter, factorial);
        }
    }
}
