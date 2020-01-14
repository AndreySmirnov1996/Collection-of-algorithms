package sorts;

import java.util.Arrays;

import static sorts.AbstractSort.ARRAY;

/**
 * Сортировка вставками
 * Сложность O(n^2)
 */

public class SelectionSort {

    public static void main(String[] args) {
        selectionSort();
        System.out.println(Arrays.toString(ARRAY));
    }

    private static void selectionSort() {
        for (int i = 0; i < ARRAY.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < ARRAY.length; j++) {
                if (ARRAY[j] < ARRAY[index]) {
                    index = j;
                }
            }
            int smallerNumber = ARRAY[index];
            ARRAY[index] = ARRAY[i];
            ARRAY[i] = smallerNumber;
        }
    }
}
