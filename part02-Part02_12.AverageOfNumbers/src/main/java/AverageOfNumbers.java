
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int count = 0;
        while(true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if(number == 0) {
                break;
            } else {
                num = num + number;
                count = count + 1;
            }

        }
        double avg = (1.0*num)/count; 
        System.out.println("Average of the numbers: " + avg);

    }
}
