import java.util.Scanner;

public class TextUI {
    private SimpleDictionary dictionary;
    private Scanner scanner;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.dictionary = dictionary;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (command.equals("add")) {
                System.out.print("Word: ");
                String word = scanner.nextLine();

                System.out.print("Translation: ");
                String translate = scanner.nextLine();

                dictionary.add(word, translate);

            } else if(command.equals("search")) {
                System.out.print("To be translated: ");
                String translate = scanner.nextLine();

                String translation = dictionary.translate(translate);

                if(translation == null) {
                    System.out.println("Word " + translate + " was not found");
                    break;
                }

                System.out.println("Translation: " + translation);
            } 
            
            else {
                System.out.println("Unknown command");
            }
        }
    }
}
