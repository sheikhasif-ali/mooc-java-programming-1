
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal) {
        if(!(this.meals.contains(meal))) {
            this.meals.add(meal);
        }
    }

    public void printMeals() {
        for(String loop : meals) {
            System.out.println(loop);
        }
    }

    public void clearMenu() {
        meals.clear();
    }
    // implement the required methods here
}
