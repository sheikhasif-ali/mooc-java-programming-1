
public class Main {

    public static void main(String[] args) {
        // you can write code here to try out your program
        Apartment manhattanStudioApt = new Apartment(1, 16, 5500);
        Apartment atlantaTwoBedroomApt = new Apartment(2, 38, 4200);
        Apartment bangorThreeBedroomApt = new Apartment(3, 78, 2500);

        Apartment a1 = new Apartment(1, 20, 1000);
        Apartment a2 = new Apartment(2, 30, 2000);
        Apartment a3 = new Apartment(2, 23, 1500);
        System.out.println(a1.moreExpensiveThan(a2)); 

    }
}
