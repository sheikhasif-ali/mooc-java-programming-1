
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        while(true) {
            String str = scanner.nextLine();
            if(str.equals("")) {
                break;
            }
            String[] split = str.split(",");
            if(age < Integer.valueOf(split[1])) {
                age = Integer.valueOf(split[1]);
            }

        }
        System.out.println("Age of the oldest: " + age);

    }
}
