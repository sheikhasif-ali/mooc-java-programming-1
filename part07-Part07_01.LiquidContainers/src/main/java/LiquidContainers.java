
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0, second = 0;
        System.out.print("> ");

        while (true) {
            System.out.println("First: " + first + "/" + 100);
            System.out.println("Second: " + second + "/" + 100);
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
                if (first < 100 && amount > 0) {
                    first += amount;
                    if (first > 100) {
                        first = 100;
                    }

                }

            } else if (command.equals("move")) {
                if (second < (second + amount) && amount > 0) {

                    if (amount > first) {
                        second = first;
                        first = 0;
                    } else {
                        second += amount;
                        first -= amount;
                    }
                    
                    if (second > 100) {
                        second = 100;
                    } else if (first < 0) {
                        first = 0;
                    }

                }

            } else if (command.equals("remove")) {
                if (second > amount) {
                    second -= amount;
                    if (second < 0) {
                        second = 0;

                    }
                }
            }

        }
    }
}
