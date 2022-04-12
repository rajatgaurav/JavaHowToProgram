import java.util.Scanner;

public class CalculatingSales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double product1 = 0.0, product2 = 0.0, product3 = 0.0, product4 = 0.0, product5 = 0.0;
        int productId = 1;

        System.out.printf("Product 1 - $2.98%nProduct 2 - $4.50%nProduct 3 - $9.98%nProduct 4 - $4.49%nProduct 5 - $6.87%n%n");


        while (productId != 0) {
            System.out.print("Enter product number (1-5) (0 to stop): ");
            productId = input.nextInt();

            if (productId >= 1 && productId <= 5) {
                System.out.print("Enter quantity sold: ");
                int quantity = input.nextInt();

                switch (productId) {
                    case 1 -> product1 += quantity * 2.98;
                    case 2 -> product2 += quantity * 4.50;
                    case 3 -> product3 += quantity * 9.98;
                    case 4 -> product4 += quantity * 4.49;
                    case 5 -> product5 += quantity * 6.87;
                }
            } else if (productId != 0) {
                System.out.println("Product number must be between 1 and 5 or 0 to stop");
            }
        }
        System.out.printf("%nProduct 1: $%.2f%n", product1);
        System.out.printf("Product 2: $%.2f%n", product2);
        System.out.printf("Product 3: $%.2f%n", product3);
        System.out.printf("Product 4: $%.2f%n", product4);
        System.out.printf("Product 5: $%.2f%n", product5);
    }
}
