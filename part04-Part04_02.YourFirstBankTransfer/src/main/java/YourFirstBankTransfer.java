
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        Account matt = new Account("Matthews account", 1000);
        Account my = new Account("My account", 0);

        matt.withdrawal(100.0);
        my.deposit(100.0);

        System.out.println(matt);
        System.out.println(my);
        // write your program here
    }
}
