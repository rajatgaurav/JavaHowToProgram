public class ModifiedCompoundInterestProgram {
    public static void main(String[] args) {
        double principal = 1000.0;

        for (int interestRate = 5; interestRate <= 10; interestRate++) {
            double rate = interestRate / 100.0;

            System.out.printf("%nInterest Rate: %d%%%n", interestRate);
            System.out.printf("%s%20s%n", "Year", "Amount on deposit");

            for (int year = 1; year <= 10; ++year) {
                double amount = principal * (1.0 + rate);

                for ( int power = 2; power <= year; power++ )
                    amount *= ( 1.0 + rate );

                System.out.printf("%4d%,20.2f%n", year, amount);
            }
        }
    }
}

