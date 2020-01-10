package sorts;

import java.util.Arrays;

/**
 *      Сортировка вставками
 *  Сложность O(n^2)
 */

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = new int[]{1, 4, 55, 2, 33, 45, 4, 9};

        for (int i = 0; i < array.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++){
                if(array[j] < array[index]){
                    index = j;
                }
            }
            int smallerNumber = array[index];
            array[index] = array[i];
            array[i] = smallerNumber;
        }
        System.out.println(Arrays.toString(array));
    }
}
