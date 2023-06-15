
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        } else {
            int value = this.elements.size();
            String content = "";
            String sOrNo = ":";
            if(this.elements.size()>1) {
                sOrNo = "s:";
            }

            for(int i = 0; i < this.elements.size(); i++) {
                content += elements.get(i);
                if(i < this.elements.size()-1) {
                    content += "\n";
                }
            }
            return "The collection " + this.name +  " has " + value + " element" + sOrNo+ "\n" + content;
        }
    }
}
