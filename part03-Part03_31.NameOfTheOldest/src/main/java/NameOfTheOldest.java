
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        String name = "";
        while(true) {
            String str = scanner.nextLine();
            if(str.equals("")) {
                break;
            }
            String[] split = str.split(",");
            if(age < Integer.valueOf(split[1])) {
                age = Integer.valueOf(split[1]);
                name = split[0];
            }

        }
        System.out.println("Name of the oldest: " + name);

    }
}
