package sorts;

import java.util.Arrays;

/**
 * Сортировка пузырьком:
 * Сложность алгоритма O(n^2)
 */

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 55, 40, 33, 5, 66,};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] array) {
        int tmp;
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }
}
