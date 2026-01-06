package aplication;

import model.entities.Account;
import model.exception.DomainException;

import java.util.Locale;
import java.util.Scanner;

public class AccountHolder {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account date");
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            sc.nextLine();
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account account = new Account(number, holder, balance, withdrawLimit);

            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            account.withdraw(sc.nextDouble());
            System.out.printf("New balance: %.2f", account.getBalance());
        }
        catch (DomainException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }


        sc.close();

    }
}
