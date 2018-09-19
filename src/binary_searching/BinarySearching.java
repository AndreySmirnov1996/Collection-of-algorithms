package binary_searching;

public class BinarySearching {

    private static int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static void main(String[] args) {
        System.out.println(binarySearching(list,12));
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
