
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        boolean bool = false;

        try(Scanner reader = new Scanner(Paths.get(file))) {
            while(reader.hasNextLine()) {
                String str = reader.nextLine();
                if(str.equals(searchedFor)) {
                    bool = true;
                    break;
                }
            }
            if(bool == true) {
                System.out.println("Found!");
                
            } else if(bool == false) {
                System.out.println("Not found.");

            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
    }
}
