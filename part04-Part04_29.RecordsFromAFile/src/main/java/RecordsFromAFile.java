
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String file = scanner.nextLine();

        try(Scanner reader = new Scanner(Paths.get(file))) {
            while(reader.hasNextLine()) {
                String str = reader.nextLine();

                String[] parts = str.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);

                if(age == 1 ) {
                    System.out.println(name + ", age: " + age + " year");
                } else if(age >=2 || age == 0) {
                    System.out.println(name + ", age: " + age + " years");
                }
            }
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
    }
}
