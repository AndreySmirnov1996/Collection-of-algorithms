package sorts;

import java.util.Arrays;

/**
 * Сортировка вставками:
 * Сложность алгоритма O(n^2)
 */

public class InsertSort {

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 55, 40, 33, 5, 66,};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertSort(int[] array) {
        int tmp, j;
        for (int i = 0; i < array.length; i++) {
            tmp = array[i];
            for (j = i - 1; j >= 0 && array[j] > tmp; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = tmp;
        }
    }
}
