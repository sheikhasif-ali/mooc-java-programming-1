
public class Smallest {

    public static int smallest(int number1, int number2) {
        int num = 0;
        if(number1 > number2) {
            num = number2;
        } else {
            num = number1;
        }
        return num;
    }

    public static void main(String[] args) {
        int result = smallest(2, 7);
        System.out.println("Smallest: " + result);
    }
}
