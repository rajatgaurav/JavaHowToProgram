import java.io.*;
import java.util.*;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Account Number(as integers or -1 to quit): ");
        int accountNumber = input.nextInt();

        while (accountNumber != -1) {
            System.out.print("Enter Balance(as integers): ");
            int oldBalance = input.nextInt();
            System.out.print("Enter Charges(as integers): ");
            int charges = input.nextInt();
            System.out.print("Enter Credits(as integers): ");
            int credits = input.nextInt();
            System.out.print("Enter Credit Limit(as integers): ");
            int creditLimit = input.nextInt();

            int newBalance = oldBalance + charges - credits;

            System.out.printf( "New balance is %d%n", newBalance );

            if (newBalance > creditLimit)
                System.out.println( "Credit limit exceeded" );

            System.out.printf("%nEnter Account Number(as integers or -1 to quit): ");
            accountNumber = input.nextInt();
        }
    }
}


//  Develop a Java application that determines whether any of several department-store customers has exceeded the credit limit on a charge account.
//  For each customer, the following facts are available:
//  a) account number
//  b) balance at the beginning of the month
//  c) total of all items charged by the customer this month
//  d) total of all credits applied to the customer’s account this month
//  e) allowed credit limit.
//  The program should input all these facts as integers,
//  calculate the new balance (= beginning balance + charges – credits),
//  display the new balance and determine whether the new balance exceeds the customer’s credit limit.
//  For those customers whose credit limit is exceeded,
//  the program should dis- play the message "Credit limit exceeded".


//import java.io.*;
//import java.util.*;
//
//public class CreditLimitCalculator {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter account number(as integers)for end 0: ");
//        int accountNumber = input.nextInt();
//
//        while (accountNumber != 0) {
//            System.out.print("Enter balance at the beginning of the month(as integers): ");
//            int beginningBalance = input.nextInt();
//            System.out.print("Enter total of all items charged by the customer this month(as integers): ");
//            int charges = input.nextInt();
//            System.out.print("Enter total of all credits applied to the customer’s account this month(as integers): ");
//            int creditApplied = input.nextInt();
//            System.out.print("Enter allowed credit limit(as integers): ");
//            int creditLimit = input.nextInt();
//
//            //int newBalance = (beginningBalance + charges) – creditApplied;
//            int newBalance = (beginningBalance + charges) - creditLimit;
//
//            //System.out.printf("%nNew balance is: %d", newBalance);
//
//            if (newBalance < creditLimit) {
//                System.out.printf("Account number: %d%n", accountNumber);
//                System.out.printf("Credit limit: %d%n", creditLimit);
//                System.out.printf("Balance: %d%n", newBalance);
//            } else {
//                System.out.printf("Account number: %d%n", accountNumber);
//                System.out.printf("Credit limit: %d%n", creditLimit);
//                System.out.printf("Balance: %d%n", newBalance);
//                System.out.printf("%nCredit limit exceeded");
//            }
//            System.out.print("Enter account number(as integers) for end 0: ");
//            int accountNumber = input.nextInt();
//        }
//    }
//}