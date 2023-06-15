
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        System.out.println("Team: ");
        String team = scan.nextLine();
        int count = 0;
        int wins = 0;
        int loss = 0;

        try(Scanner reader = new Scanner(Paths.get(str))) {
            while(reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] parts = line.split(",");
                if(parts[0].equals(team)){
                    count++;
                    if(Integer.valueOf(parts[2])>Integer.valueOf(parts[3])) {
                        wins++;
                    } else if(Integer.valueOf(parts[2])<Integer.valueOf(parts[3])) {
                        loss++;
                    }
                } else if(parts[1].equals(team)) {
                    count++;
                    if(Integer.valueOf(parts[2])>Integer.valueOf(parts[3])) {
                        loss++;
                    } else if(Integer.valueOf(parts[2])<Integer.valueOf(parts[3])) {
                        wins++;
                    }
                }
                
            }
            System.out.println("Games: " + count);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + loss);
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
        

    }

}
