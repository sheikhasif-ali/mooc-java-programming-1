import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> list;
    private int currentWeight = 0;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        list = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        
        if(suitcase.totalWeight()+currentWeight<=maxWeight) {
            list.add(suitcase);
            currentWeight += suitcase.totalWeight();
        }
    }

    public String toString() {
        return list.size() + " suitcases " + "(" + currentWeight + "kg)";
    }

    public void printItems() {
        for(Suitcase loop : list) {
            loop.printItems();
        }
    }
}
