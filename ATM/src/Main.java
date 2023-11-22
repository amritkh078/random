import java.util.Scanner;

class Account {
    private int balance;

    public Account(int initialBalance) {
        this.balance = initialBalance;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Please collect your money");
        } else {
            System.out.println("Insufficient Balance or Invalid Amount");
        }
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Your Money has been successfully deposited");
        } else {
            System.out.println("Invalid Amount for Deposit");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int initialBalance = 100000; // Initial balance set to 100,000
        Scanner sc = new Scanner(System.in);
        Account account = new Account(initialBalance);

        while (true) {
            System.out.println("\nAutomated Teller Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");
            System.out.print("Choose the operation you want to perform:");

            int choice = sc.nextInt();
            int amount;

            switch (choice) {
                case 1:
                    System.out.print("Enter money to be withdrawn:");
                    amount = sc.nextInt();
                    if (amount > account.getBalance()) {
                        System.out.println("Insufficient Balance for Withdrawal");
                    } else {
                        account.withdraw(amount);
                    }
                    break;

                case 2:
                    System.out.print("Enter money to be deposited:");
                    amount = sc.nextInt();
                    account.deposit(amount);
                    break;

                case 3:
                    int balance = account.getBalance();
                    System.out.println("Balance : " + balance);
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
