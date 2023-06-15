import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private JokeManager manager;

    public UserInterface(JokeManager manager, Scanner scanner) {
        this.scanner = scanner;
        this.manager = manager;
    }

    public void start() {
        while (true) {
            System.out.println("Commands: \n1 - add a joke\n2 - draw a joke\n3 - list jokes\n X - stop");
            String command = scanner.nextLine();
            if (command.equals("X")) {
                break;
            } else if (command.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke = scanner.nextLine();
                manager.addJoke(joke);
            } else if (command.equals("2")) {
                String rjoke = manager.drawJoke();
                System.out.println(rjoke);
            } else if (command.equals("3")) {
                manager.printJokes();
            }
        }
    }
}
