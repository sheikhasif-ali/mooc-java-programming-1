
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        int i = 0;
        // Write some code in here
        while(i < array.length) {
            for(int j = 0; j < array[i]; j++) {
                System.out.print("*");
            }
            i++;
            System.out.println("");
        }
    }

}
