import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MainProgram {
    
    public static void main(String[] args) {
        // write your test code here
        int[] numbers = { 3, 2, 5, 4, 8 , 1 , 6 };
        System.out.println(Arrays.toString(numbers));
        sort(numbers);
    }

    public static int smallest(int[] array) {
        int small = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < small) {
                small = array[i];

            }
        }
        return small;
    }

    public static int indexOfSmallest(int[] array) {
        // write your code here
        int small = array[0], index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < small) {
                small = array[i];
                index = i;

            }
        }
        return index;

    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int small = table[startIndex], index = startIndex;
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < small) {
                small = table[i];
                index = i;

            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        int ind = 0;
        while(ind<array.length) {
            swap(array, indexOfSmallestFrom(array, ind), ind);
            ind++;
            System.out.println(Arrays.toString(array));
        }
    }

}
