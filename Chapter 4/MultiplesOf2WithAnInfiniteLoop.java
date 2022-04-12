public class MultiplesOf2WithAnInfiniteLoop {
    public static void main(String[] args) {
        int n = 2;
        while (n > 0) {
            System.out.printf("%d\n",n);
            n *= 2;
        }
    }
}
