import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            
            System.out.print("Name: ");
            String show = scanner.nextLine();
            if (show.isEmpty()) {
                break;
            }

            System.out.print("Duration: ");
            int dur = Integer.valueOf(scanner.nextLine());

            programs.add(new TelevisionProgram(show, dur));
        }
        System.out.println("Program's maximum duration? ");
        int max = Integer.valueOf(scanner.nextLine());
        for(TelevisionProgram loop : programs) {
            if(loop.getDuration()<=max) {
                System.out.println(loop);
            }
        }
    }
}
