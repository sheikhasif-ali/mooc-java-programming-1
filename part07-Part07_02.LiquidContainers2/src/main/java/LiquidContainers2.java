
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("> ");
        Container container1 = new Container();
        Container container2 = new Container();

        while (true) {

            System.out.println("First: " + container1);
            System.out.println("Second: " + container2);

            String input = scan.nextLine();
            String[] parts = input.split(" ");
            int amount = 0;
            String command = parts[0];
            if (input.contains(" ")) {
                amount = Integer.valueOf(parts[1]);

            }

            if (input.equals("quit")) {
                break;
            } else if (command.equals("add")) {
                container1.add(amount);

            } else if (command.equals("move")) {
                if(container1.contains()>=amount) {
                    container1.remove(amount);
                    container2.add(amount);

                } else {
                    container2.add(container1.contains());
                    container1.remove(container2.contains());
                }

            } else if (command.equals("remove")) {
                container2.remove(amount);

            }

        }
    }
}