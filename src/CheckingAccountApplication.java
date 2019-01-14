import java.util.Scanner;

public class CheckingAccountApplication {
    public static void main(String[] args) {
        System.out.println("Your bank manages " + CheckingAccount.getNumberOfAccounts() + " accounts.");

        System.out.println("The routing number for your bank is:");
        System.out.println(CheckingAccount.routingNumber);


        // Create two checking accounts
        CheckingAccount account1 = new CheckingAccount("Sophie", "Joint");
        CheckingAccount account2 = new CheckingAccount("Ryan", "Business");

        account1.getAccountInfo();
        account1.deposit(500);

        System.out.println(CheckingAccount.getNumberOfAccounts());

        account2.getAccountInfo();
    }
}
