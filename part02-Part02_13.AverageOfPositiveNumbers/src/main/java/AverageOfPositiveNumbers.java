
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int count = 0;
        while(true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if(number == 0) {
                break;
            } else if (number > 0) {
                num = num + number;
                count = count + 1;
            }

        }

        if(count == 0) {
            System.out.println("Cannot calculate the average ");
        } else {
            double avg = (1.0*num)/count; 
            System.out.println(avg);

        }
    }
}
