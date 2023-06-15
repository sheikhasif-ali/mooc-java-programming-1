import java.util.ArrayList;

public class Recipe {
    private String name;
    private int time;
    private ArrayList<String> ingredient;

    public Recipe(String name, String time, ArrayList<String> list) {
        this.name = name;
        this.time = Integer.valueOf(time);
        this.ingredient = list;
    }

    public String toString() {
        return name + ", cooking time: " + time + "\n";
    }

    public String getName() {
        return this.name;
    }

    public int getTime() {
        return this.time;
    }
    public ArrayList<String> getIngredient() {
        return this.ingredient;
    }
}
