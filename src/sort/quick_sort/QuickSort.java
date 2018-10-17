package sort.quick_sort;

public class QuickSort {
    static int[] array = {1, 76, 88, 33, 99, 5, 2};


    public static final void main(String[] args) {
        printArray();
        quickSort();
        printArray();
    }

    public static void printArray() {
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1]);
    }

    public static void quickSort() {
        int startIndex = 0;
        int endIndex = array.length - 1;
        doSort(startIndex, endIndex);
    }

    public static void doSort(int start, int end) {
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
