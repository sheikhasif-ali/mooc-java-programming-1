
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        

    }
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for(int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) <= upperLimit && numbers.get(i) >= lowerLimit) {
                System.out.println(numbers.get(i));

            }
        }
    }
    
}
