
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> list = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String inputId = scanner.nextLine();
            if (inputId.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String inputName = scanner.nextLine();
            if (inputName.isEmpty()) {
                break;
            }

            Archive product = new Archive(inputId, inputName);
            list.add(product);
        }
        
        ArrayList<String> idList = new ArrayList<>();

        System.out.println("==Items==");

        for(Archive loop : list) {
            if(idList.contains(loop.getId())) {
                continue;
            }
            System.out.println(loop);
            idList.add(loop.getId());
        }
       

    }
}
