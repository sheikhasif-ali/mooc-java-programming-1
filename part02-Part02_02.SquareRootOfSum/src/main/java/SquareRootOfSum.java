
import java.rmi.StubNotFoundException;
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.valueOf(scanner.nextLine());
        int num2 = Integer.valueOf(scanner.nextLine());

        double sqroot = Math.sqrt((num2+num1));

        System.out.println(sqroot);
    }
}
