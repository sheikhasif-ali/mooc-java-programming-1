
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        Account newAccount = new Account("My Account", 100.0);

        newAccount.deposit(20.0);

        System.out.println(newAccount);
    }
}
