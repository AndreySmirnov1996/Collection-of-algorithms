package search.binary_searching;

/**
 *  Бинарный поиск
 *  Сложность алгоритма O(log(n))
 */

public class BinarySearching {

    private static final int[] SORTED_LIST = {11, 22, 33, 44, 55, 66, 77, 88, 99};

    public static void main(String[] args) {
        System.out.println(binarySearching(SORTED_LIST,99));
    }

    private static int binarySearching(int[] sortedArray, int seekElement) {

        int startIndex = 0;
        int endIndex = sortedArray.length - 1;

        while (startIndex <= endIndex) {
            final int middleIndex = (startIndex + endIndex) / 2;

            // Если мы нашли искомый элемент, просто возвращаем его индекс.
            if (sortedArray[middleIndex] == seekElement) {
                return middleIndex;
            }

            // Решаем, какую половину исследовать дальше:
            // правую (если искомый элемент БОЛЬШЕ выбранного среднего) или
            // левую (если искомый элемент МЕНЬШЕ выбранного среднего).
            if (sortedArray[middleIndex] < seekElement) {
                startIndex = middleIndex + 1;
            }  else {
                endIndex = middleIndex - 1;
            }
        }
        return -1;
    }
}
