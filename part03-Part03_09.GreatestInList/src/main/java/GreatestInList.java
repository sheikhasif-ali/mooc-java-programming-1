
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
            if(input > sum) {
                sum = input;
            }
        }
        
        System.out.println("");
        System.out.println("The greatest number: " + sum);
        // implement finding the greatest number in the list here
    }
}
