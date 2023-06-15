import java.util.ArrayList;
import java.util.Scanner;

public class UI {
    ArrayList<Bird> list;

    public UI() {
        list = new ArrayList<>();
    }

    public void startUI(Scanner scanner) {
        while (true) {
            System.out.print("?");
            String command = scanner.nextLine();
            if (command.equals("Add")) {
                System.out.println("Name: ");
                String name = scanner.nextLine();
                System.out.println("Name in Latin: ");
                String lName = scanner.nextLine();
                Bird birdie = new Bird(name, lName);
                list.add(birdie);
            } else if (command.equals("Observation")) {
                System.out.print("Bird?");
                String str = scanner.nextLine();

                for (Bird loop : list) {
                    if (loop.getName().equals(str)) {
                        loop.setObservation();
                        break;
                    } else {
                        System.out.println("Not a bird!");
                    }

                }
            } else if (command.equals("All")) {
                for (Bird loop : list) {
                    System.out.println(loop);
                }
            } else if (command.equals("Quit")) {
                break;
            } else if(command.equals("One")) {
                System.out.print("Bird?");
                String str = scanner.nextLine();
                for(Bird loop : list) {
                    if(loop.getName().equals(str)) {
                        System.out.println(loop);
                    }
                }
            }
        }
    }
}
