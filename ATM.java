import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        int balance = 50000;
        int pin = 1234;
        Scanner sc = new Scanner(System.in);

        // PIN Authentication
        System.out.print("Enter your 4-digit PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin != pin) {
            System.out.println("Access denied. Incorrect PIN.");
            return;
        }

        System.out.println("\nWelcome to the ATM!");

        boolean quit = false;
        while (!quit) {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Withdraw Cash");
            System.out.println("2. Deposit Cash");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    int withdrawAmount = sc.nextInt();
                    if (withdrawAmount > balance) {
                        System.out.println("Insufficient balance!");
                    } else {
                        balance -= withdrawAmount;
                        System.out.println("Please collect your cash. Withdrawn: $" + withdrawAmount);
                    }
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    int depositAmount = sc.nextInt();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.println("Successfully deposited: $" + depositAmount);
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;

                case 3:
                    System.out.println("Current Account Balance: $" + balance);
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    quit = true;
                    break;

                default:
                    System.out.println("Invalid choice. Please select between 1 and 4.");
            }
        }
        sc.close();
    }
}
