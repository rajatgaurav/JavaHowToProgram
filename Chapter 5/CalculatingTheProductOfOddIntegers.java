public class CalculatingTheProductOfOddIntegers {
    public static void main(String[] args) {
        int product = 1;
        for (int counter = 3; counter <= 15; counter +=2 )
            product *= counter;

        System.out.printf("Product of Odd number: %d", product);
    }
}
