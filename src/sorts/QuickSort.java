package sorts;

import java.util.Arrays;

/**
 * Быстрая сортировка:
 * Сложность алгоритма O(n*log(n))
 */

public class QuickSort {
    private static int[] array = {1, 76, 88, 33, 99, 5, 2};

    public static void main(String[] args) {
        quickSort();
        System.out.println(Arrays.toString(array));
    }

    private static void quickSort() {
        int startIndex = 0;
        int endIndex = array.length - 1;
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
            while (i < cur && (array[i] <= array[cur])) {
                i++;
            }
            while (j > cur && (array[cur] <= array[j])) {
                j--;
            }
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
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
