import java.util.ArrayList;

public class Room {
    private ArrayList<Person> list;
    

    public Room() {
        list = new ArrayList<>();
    }

    public void add(Person person) {
        list.add(person);
    }

    public boolean isEmpty() {
        if (list.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Person> getPersons() {
        return list;
    }

    public Person shortest() {
        if (this.list.isEmpty()) {
            return null;
        }

        int shortest = 1000;
        Person persona = new Person(null, shortest);
        for (Person loop : this.list) {
            if (loop.getHeight() < shortest) {
                shortest = loop.getHeight();
                persona = loop;
                
            }
        }
        return persona;
    }

    public Person take() {
        Person shrt = new Person(null, 0);
        if (list.isEmpty()) {
            return null;
        } else {
            shrt = this.shortest();
            list.remove(shrt);
            return shrt;
        }
    }
}
