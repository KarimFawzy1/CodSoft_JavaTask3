package com.mycompany.interfaceforatm;
import java.util.Scanner;

public class ATM {

    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void displayMenu() {
        System.out.println("\nATM Menu:");
        System.out.println("1. Withdraw Cash");
        System.out.println("2. Deposit Cash");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

    public void performTransaction(int choice) {
        Scanner scanner = new Scanner(System.in);
        double amount;

        switch (choice) {
            case 1:
                System.out.print("Enter amount to withdraw: ");
                amount = scanner.nextDouble();
                withdraw(amount);
                break;
            case 2:
                System.out.print("Enter amount to deposit: ");
                amount = scanner.nextDouble();
                deposit(amount);
                break;
            case 3:
                checkBalance();
                break;
            case 4:
                System.out.println("Exiting ATM...");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private void withdraw(double amount) {
        if (account.withdraw(amount)) {
            System.out.println("Withdrawal successful. Please collect your cash.");
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }

    private void deposit(double amount) {
        account.deposit(amount);
        System.out.println("Deposit successful. Your new balance is: " + account.getBalance());
    }

    private void checkBalance() {
        System.out.println("Your current balance is: " + account.getBalance());
    }
}
