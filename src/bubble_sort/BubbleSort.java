package bubble_sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {1, 76, 88, 33, 99, 5, 2};
        bubbleSort(array);
    }

    public static void bubbleSort(int[] array) {
//        int tmp;
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
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
    }
}
