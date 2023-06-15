
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Statistics stats = new Statistics();
        Statistics statsEven = new Statistics();
        Statistics statsOdd = new Statistics();

        System.out.println("Enter numbers:");
        while(true) {
            int number = Integer.valueOf(scanner.nextLine());
            if(number<0) {
                break;
            } else {
                stats.addNumber(number);
                if(number%2 == 0) {
                    statsEven.addNumber(number);
                } else {
                    statsOdd.addNumber(number);
                }

            }
        }
        System.out.println("Count: " + stats.getCount());
        System.out.println("Sum: " + stats.sum()); 
         System.out.println("Sum of even numbers: " + statsEven.sum()); 
        System.out.println("Sum of odd numbers : " + statsOdd.sum()); 

        System.out.println("Average: " + stats.average());
    }
}
