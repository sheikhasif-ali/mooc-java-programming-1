
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        while(true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if(number == 0) {
                break;
            } else {
                num = num + number;
            }

        }
        System.out.println("Sum of the numbers: " + num);

    }
}
