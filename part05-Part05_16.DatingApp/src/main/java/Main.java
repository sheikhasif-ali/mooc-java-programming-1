
public class Main {

    public static void main(String[] args) {
        // test your program here!
        SimpleDate date = new SimpleDate(30, 12, 2011);
        System.out.println("Friday of the examined week is " + date);
    
        SimpleDate newDate = date.afterNumberOfDays(790);
    
    
    
        System.out.println("new date: " + newDate);
    }
}
