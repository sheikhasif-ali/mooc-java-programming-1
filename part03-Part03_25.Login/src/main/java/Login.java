
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Username: ");
        String usr = scanner.nextLine();
        System.out.println("Enter Password: ");
        String pass = scanner.nextLine();

        if(usr.equals("alex") && pass.equals("sunshine") || usr.equals("emma") && pass.equals("haskell")) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
