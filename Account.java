import java.util.Scanner;

class Account {
    String accountHolder;
    double balance;
    int accountNumber;

    // Constructor
    Account(String acc, int acco, double bal) {
        accountHolder = acc;
        accountNumber = acco;
        balance = bal;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid amount");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // Display balance method
    public void displayBalance() {
        System.out.println("Holder: " + accountHolder + " | Account: " + accountNumber + " | Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input account details
        System.out.print("Enter Account Holder Name: ");
        String accountholder = sc.nextLine();

        System.out.print("Enter Account Number: ");
        int accountNumber = sc.nextInt();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        // Creating account object
        Account acc1 = new Account(accountholder, accountNumber, balance);

        // Performing operations
        acc1.displayBalance();
        acc1.deposit(5000);
        acc1.withdraw(2000);
        acc1.displayBalance();

        // Close scanner
        sc.close();
    }
}
