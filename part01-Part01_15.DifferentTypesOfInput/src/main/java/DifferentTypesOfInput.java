
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a string: ");
        String text = scanner.nextLine();

        System.out.println("Give an integer: ");
        Integer number = Integer.valueOf(scanner.nextLine());

        System.out.println("Give a double: ");
        Double floating = Double.valueOf(scanner.nextLine());

        System.out.println("Give a boolean: ");
        Boolean bool = Boolean.valueOf(scanner.nextLine());

        System.out.println("You gave the string " + text);
        System.out.println("You gave the integer " + number);
        System.out.println("You gave the double " + floating);
        System.out.println("You gave the boolean " + bool);

        // Write your program here

    }
}
