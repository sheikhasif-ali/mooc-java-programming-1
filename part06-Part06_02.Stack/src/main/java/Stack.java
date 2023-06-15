import java.util.ArrayList;

public class Stack {
    private ArrayList<String> list ;

    public Stack() {
        this.list = new ArrayList<>();
    }
    public boolean isEmpty() {
        if(this.list.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public void add(String value) {
        this.list.add(value);
    }

    public ArrayList<String> values() {
        return list;
    }

    public String take() {
        String retr = list.get(list.size()-1);
        list.remove(list.size()-1);
        return retr;
    }
}
