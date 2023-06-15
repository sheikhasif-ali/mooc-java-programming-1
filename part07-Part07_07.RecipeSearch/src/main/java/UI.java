import java.util.*;
import java.nio.file.Paths;
import java.lang.Integer;

public class UI {
    private ArrayList<Recipe> cookBook;

    public UI() {
        this.cookBook = new ArrayList<>();
    }

    public void startUI(Scanner scanner) {
        System.out.print("File to read: ");
        String file = scanner.nextLine();

        ArrayList<String> arr = this.createList(file);

        this.createRecipeList(arr);

        while (true) {

            System.out.println("Commands:\nlist - lists the recipes\nstop - stops the program\nfind name - searches recipes by name\nfind cooking time - searches recipes by cooking time\nfind ingredient - searches recipes by ingredient\nEnter command: ");
            String command = scanner.nextLine();

            if (command.equals("list")) {
                showList();
            } else if (command.equals("stop")) {
                break;
            } else if (command.equals("find name")) {
                System.out.println("Searched word: ");
                String str = scanner.nextLine();
                nameSearch(str);
            } else if (command.equals("find cooking time")) {
                System.out.println("Max cooking time: ");
                int time = Integer.valueOf(scanner.nextLine());
                timeSearch(time);
            } else if(command.equals("find ingredient")) {
                System.out.println("Ingredient: ");
                String ingr = scanner.nextLine();
                ingredientSearch(ingr);
            }
        }
    }

    public ArrayList<String> createList(String file) {
        ArrayList<String> list = new ArrayList<>();
        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                String str = reader.nextLine();
                list.add(str);
            }
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
        return list;

    }

    public void createRecipeList(ArrayList<String> list) {
        // recieves a basic string list of recepies and converts it into a list of
        // objects of class recipe

        int j = 0;
        for (int i = 0; i < list.size(); i++) {
            ArrayList<String> listOfIngredient = new ArrayList<>();
            String adder = "";

            if (list.get(i).chars().allMatch(Character::isDigit)) {
                for (j = i + 1; ; j++) {
                    if (j == list.size()) {
                        break;
                    }
                    if (list.get(j).equals("")) {
                        break;
                    }
                    adder = list.get(j);
                    listOfIngredient.add(adder);
                }

                Recipe rec = new Recipe(list.get(i - 1), list.get(i), listOfIngredient);
                cookBook.add(rec);
                i = j;
            }
        }
    }

    public void showList() {
        for (Recipe loop : cookBook) {
            System.out.println(loop);
        }

    }

    public void nameSearch(String str) {
        for(Recipe loop : cookBook) {
            String s1 = loop.getName().toLowerCase();
            String s2 = str.toLowerCase();
            if(s1.contains(s2)) {
                System.out.println(loop);
            }
        }
    }

    public void timeSearch(int time) {
        for(Recipe loop : cookBook) {
            if(loop.getTime()<=time) {
                System.out.println(loop);
            }
        }
    }

    public void ingredientSearch(String ingr) {
        for(Recipe loop : cookBook) {
            if(loop.getIngredient().contains(ingr)) {
                System.out.println(loop);
            }
        }
    }
}
