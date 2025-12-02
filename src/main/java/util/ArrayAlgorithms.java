package util;

/**
 * Array utility class. Provides utility methods for array-related operations.
 *
 */
public class ArrayAlgorithms {

    /**
     * Sorts an array of integers.
     * @param array is the array to be sorted
     */
    public static void sort(int[] array) {
        insertSortDivideConquer(array, 0, array.length - 1);
    }

    /**
     * Helper method that uses decrease and conquer to perform insertion sort recursively.
     * @param array is the array to be sorted
     * @param p is the starting index
     * @param r is the ending index
     */
    private static void insertSortDivideConquer(int[] array, int p, int r) {
        if(p < r) {
            insertSortDivideConquer(array, p, r-1);
            insert(array, r-1, array[r-1] );
        }
    }

    /**
     * Helper method that inserts a key into its correct position in a sorted subarray.
     * @param array is the array containing the sorted subarray
     * @param i is the index of the last element in the sorted subarray
     * @param key is the element to be inserted in a sorted manner
     */
    private static void insert(int[] array, int i, int key) {
        while (i >= 0 && array[i] > key) {
            array[i + 1] = array[i];
            i--;
        }
        array[i + 1] = key;
    }

    /**
     * Checks if an array is sorted in non-decreasing order.
     * @param array is the array to be checked
     * @return true iff the array is sorted in non-decreasing order
     */
    private boolean isSorted(int[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i+1])
                return false;
        }
        return true;
    }

}
