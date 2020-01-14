package sorts;

import java.util.Arrays;

import static sorts.AbstractSort.ARRAY;

/**
 * Сортировка вставками:
 * Сложность алгоритма O(n^2)
 */

public class InsertSort {

    public static void main(String[] args) {
        insertSort();
        System.out.println(Arrays.toString(ARRAY));
    }

    private static void insertSort() {
        int tmp, j;
        for (int i = 0; i < ARRAY.length; i++) {
            tmp = ARRAY[i];
            for (j = i - 1; j >= 0 && ARRAY[j] > tmp; j--) {
                ARRAY[j + 1] = ARRAY[j];
            }
            ARRAY[j + 1] = tmp;
        }
    }
}
