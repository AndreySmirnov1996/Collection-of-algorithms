package sorts;

import java.util.Arrays;

import static sorts.AbstractSort.ARRAY;

/**
 * Быстрая сортировка:
 * Сложность алгоритма O(n*log(n))
 */

public class QuickSort {

    public static void main(String[] args) {
        quickSort();
        System.out.println(Arrays.toString(ARRAY));
    }

    private static void quickSort() {
        int startIndex = 0;
        int endIndex = ARRAY.length - 1;
        doSort(startIndex, endIndex);
    }

    private static void doSort(int start, int end) {
        if (start >= end) {
            return;
        }
        int i = start;
        int j = end;
        int cur = (i + j) / 2;

        while (i < j) {
            while (i < cur && (ARRAY[i] <= ARRAY[cur])) {
                i++;
            }
            while (j > cur && (ARRAY[cur] <= ARRAY[j])) {
                j--;
            }
            if (i < j) {
                int temp = ARRAY[i];
                ARRAY[i] = ARRAY[j];
                ARRAY[j] = temp;
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        doSort(start, cur);
        doSort(cur + 1, end);
    }
}
