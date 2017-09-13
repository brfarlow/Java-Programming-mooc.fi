
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account newAccount = new Account("New Account", 100.00);
        
        newAccount.deposit(20.00);
        System.out.println("New Account: "+newAccount);
        
    }

}
