package sort.bubble_sort;

import java.util.Arrays;

/**     Сортировка пузырьком:
 *  Сложность алгоритма O(n^2)
 */

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = { 99, 5, 2};
        bubbleSort(array);
    }

    public static void bubbleSort(int[] array) {
//        int tmp;
        int counter = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                counter++;
                if (array[j] > array[j + 1]) {
//                    tmp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = tmp;
                    array[j] = array[j] + array[j + 1];
                    array[j + 1] = array[j] - array[j + 1];
                    array[j] = array[j] - array[j + 1];
                }
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(counter);
    }
}
