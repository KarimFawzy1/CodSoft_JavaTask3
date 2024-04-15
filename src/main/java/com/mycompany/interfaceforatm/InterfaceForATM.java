package com.mycompany.interfaceforatm;
import java.util.Scanner;

public class InterfaceForATM {

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.00); // Initial balance
        ATM atm = new ATM(account);

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            atm.displayMenu();
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();
            atm.performTransaction(choice);
        } while (choice != 4);
    }
}
