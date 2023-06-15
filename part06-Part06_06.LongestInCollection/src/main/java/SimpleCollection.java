
import java.util.ArrayList;

import javax.lang.model.type.NullType;

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

    public String longest() {
        if(elements.isEmpty()) {
            return null;
        }
        String returnObj = elements.get(0);
        for(String loop : elements) {
            if(loop.length()>returnObj.length()) {
                returnObj = loop;
            }
        }
        return returnObj;

        
    }

}
