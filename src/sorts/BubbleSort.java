package sorts;

import java.util.Arrays;

import static sorts.AbstractSort.ARRAY;

/**
 * Сортировка пузырьком:
 * Сложность алгоритма O(n^2)
 */

public class BubbleSort {

    public static void main(String[] args) {
        bubbleSort();
        System.out.println(Arrays.toString(ARRAY));
    }

    private static void bubbleSort() {
        int tmp;
        for (int i = ARRAY.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (ARRAY[j] > ARRAY[j + 1]) {
                    tmp = ARRAY[j];
                    ARRAY[j] = ARRAY[j + 1];
                    ARRAY[j + 1] = tmp;
                }
            }
        }
    }
}
