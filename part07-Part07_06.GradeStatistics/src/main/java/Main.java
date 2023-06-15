
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Grade sheet = new Grade();
        sheet.startUi(scanner);

        System.out.println("Point average (all): " + sheet.average());
        if (sheet.average50() < 0) {
            System.out.println("-");
        } else {
            System.out.println("Point average (passing): " + sheet.average50());

        }
        System.out.println("Pass percentage" + sheet.passPercent());
        // Write your program here -- consider breaking the program into
        // multiple classes.
        sheet.printGrade();
    }
}
