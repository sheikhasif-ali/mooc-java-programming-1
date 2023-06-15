
public class MainProgram {

    public static void main(String[] args) {
        // test your class here
        Money firstMoneyObject = new Money(1, 5);
        // secondMoneyObject = new Money(1, 50);
        Money thirdMoneyObject = new Money(2, 0);
        // fourthMoneyObject = new Money(2, 0);
        System.out.println(firstMoneyObject.lessThan(thirdMoneyObject)); 
    }
}
