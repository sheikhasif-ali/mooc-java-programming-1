
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int small = 1000;
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }

            list.add(input);
            if(input < small) {
                small = input;
            }
        }

        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) == small) {

                System.out.println("Smallest number: " + small);
                break;
                
            }
        }
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) == small) {

                System.out.println("Found at index: " + i);
                
            }
        }

        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        
    }
}
