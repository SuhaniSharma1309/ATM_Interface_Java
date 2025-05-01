import java.util.Scanner;

public class APP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount userAccount = new BankAccount(1000.0); // Starting balance

        while (true) {
            System.out.println("\nWelcome to ATM Interface");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current Balance: ₹" + userAccount.checkBalance());
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ₹");
                    double depositAmount = sc.nextDouble();
                    userAccount.deposit(depositAmount);
                    System.out.println("Deposited Successfully!");
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ₹");
                    double withdrawAmount = sc.nextDouble();
                    if (userAccount.withdraw(withdrawAmount)) {
                        System.out.println("Withdrawn Successfully!");
                    } else {
                        System.out.println("Insufficient Balance!");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using ATM!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid Option. Try again.");
            }
        }

    }
}
