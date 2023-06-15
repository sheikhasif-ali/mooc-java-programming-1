
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        String name = "";
        int avgAge = 0;
        int length = 0;
        int count = 0;

        while (true) {
            String str = scanner.nextLine();
            if (str.equals("")) {
                break;
            }

            String[] split = str.split(",");

            if (split[0].length() > length) {
                name = split[0];
                length = split[0].length();
            }

            avgAge += Integer.valueOf(split[1]);
            count++;

            
        }
        System.out.println("Longest Name: " + name);
        System.out.println("Average of the birth years: " + 1.0*avgAge/count);

    }

}
