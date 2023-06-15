import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Books> library = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // System.out.println("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }

            // System.out.println("Pages: ");
            int page = Integer.valueOf(scanner.nextLine());

            // System.out.println("Year: ");
            int year = Integer.valueOf(scanner.nextLine());

            library.add(new Books(title, page, year));
        }

        System.out.println("What information will be printed? ");
        String option = scanner.nextLine();

        if (option.equals("everything")) {
            for (Books loop : library) {
                System.out.println(loop.toString());
            }

        } else if (option.equals("name")) {
            for (Books loop : library) {
                System.out.println(loop.getTitle());
            }

        }
    }
}
