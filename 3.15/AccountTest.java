import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        displayAccount(account1);
        displayAccount(account2);

        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        account1.deposit(depositAmount); 

        displayAccount(account1);
        displayAccount(account2);

        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        account2.deposit(depositAmount); 

        displayAccount(account1);
        displayAccount(account2);
    }

    public static void displayAccount(Account accountToDisplay) {
        System.out.printf("%s's balance: $%.2f%n",
                accountToDisplay.getName(), accountToDisplay.getBalance());
    }
}
