package search.binary_searching;

/**
 *      Бинарный поиск
 *  Сложность алгоритма O(log(n))
 */

public class BinarySearching {

    private static final int[] SORTED_LIST = {11, 22, 33, 44, 55, 66, 77, 88, 99};

    public static void main(String[] args) {
        System.out.println(binarySearching(SORTED_LIST,12));
    }

    private static boolean binarySearching(int[] array, int search) {
        int first = 0;
        int last = array.length - 1;
        int middle = (first + last) / 2;

        while (first <= last) {
            if (array[middle] < search) {
                first = middle + 1;
            } else if (array[middle] == search) {
                return true;
            } else {
                last = middle - 1;
            }
            middle = (first + last) / 2;
        }
        return false;
    }
}
