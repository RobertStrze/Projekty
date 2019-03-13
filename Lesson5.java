public class Lesson5 {
    private static int[] array = {10, 2, 5, 4, 7, 8, 6, 11, 2, 3, 9, 5};

    public static void main(String[] args) {
        printArray();
        findDuplicates();
        sortArray();
    }

    private static void findDuplicates() {
        System.out.print("Duplicates: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.print(array[i] + " ");
                }
            }
        }
        System.out.println();
    }

    private static void printArray() {
        System.out.print("Array: ");
        for (int array : array) {
            System.out.print(array + " ");
        }
        System.out.println();
    }

    private static void sortArray() {
        boolean isSorted = false;
        int lastUnsorted = array.length - 1;
        int temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < lastUnsorted; i++) {
                if (array[i] >= array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    isSorted = false;
                }
            }
            lastUnsorted--;
        }
        System.out.print("Sorted array: ");
        for (int array : array) {
            System.out.print(array + " ");
        }
        System.out.println();
    }
}
