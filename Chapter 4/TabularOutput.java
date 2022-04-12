public class TabularOutput {
    public static void main(String[] args) {
        System.out.printf("N\t\t10*N\t100*N\t1000*N%n");

        int counter = 1;
        while (counter <= 5) {
            System.out.printf("%n%d\t\t%d\t\t%d\t\t%d", counter, 10 * counter, 100 * counter, 1000 * counter);
            counter++;
        }
    }
}
