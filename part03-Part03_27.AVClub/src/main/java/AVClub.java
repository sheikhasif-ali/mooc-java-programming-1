
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            String str = scanner.nextLine();
            String[] split = str.split(" ");
            for(int i = 0; i < split.length; i++) {
                if(split[i].contains("av")) {
                    System.out.println(split[i]);
                }
            }
            if(str.equals("")) {
                break;
            }

        }


    }
}
