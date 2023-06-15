
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String str = scanner.nextLine();
            if(str.equals("")) {
                break;
            }
            String[] split = str.split(" ");
            System.out.println(split[split.length-1]);

        }

    }
}
