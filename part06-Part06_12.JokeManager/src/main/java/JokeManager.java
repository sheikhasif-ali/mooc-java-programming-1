import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> list;

    public JokeManager() {
        this.list = new ArrayList<>();
    }

    public void addJoke(String joke) {
        list.add(joke);
    }

    public String drawJoke() {
        if (list.isEmpty()) {
            return "Jokes are in short supply.";
        } else {
            Random draw = new Random();
            int index = draw.nextInt(list.size());
            return list.get(index);
        }
    }

    public void printJokes() {
        System.out.println("Printing the jokes.");
        for(String loop : list) {
            System.out.println(loop);
        }
    }

}