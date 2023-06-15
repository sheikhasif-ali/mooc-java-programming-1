import java.util.ArrayList;



public class Suitcase {
    private ArrayList<Item> list;
    private int maxWeight = 0;

    public Suitcase(int maxWeight) {
        list = new ArrayList<>();
        this.maxWeight = maxWeight;

    }

    public void addItem(Item item) {
        int currentWeight = totalWeight();

        if(currentWeight+item.getWeight()<=maxWeight) {
            list.add(item);
            currentWeight += item.getWeight();
        }
        
    }

    public void printItems() {
        for(Item loop : list) {
            System.out.println(loop);
        }
    }

    public int totalWeight() {
        int currentWeight = 0;
        for(Item loop : list) {
            currentWeight += loop.getWeight();
        }
        return currentWeight;
    }

    public Item heaviestItem() {
        if(list.isEmpty()) {
            return null;
        }
        Item heavy = new Item(null, 0);
        int heaviest = 0;
        for(Item loop : list) {
            if(loop.getWeight()>heaviest) {
                heaviest = loop.getWeight();
                heavy = loop;
            }
        }

        return heavy;
    }

    public String toString() {
        if(list.isEmpty()) {
            return "no items (0 kg)";
        } else if(list.size()==1) {
            return "1 item (" + totalWeight() + " kg)";
        }
        return list.size() + " items " + "(" + totalWeight() + " kg)";
    }

    
}
