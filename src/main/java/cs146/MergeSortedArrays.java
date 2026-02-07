package cs146;

/**
 * This class contains a method to merge two sorted integer arrays
 * into a single sorted array.
 *
 * This logic represents the "merge" step of Merge Sort.
 */
public class MergeSortedArrays {

    /**
     * Merges two sorted arrays into one sorted array.
     *
     * @param a the first sorted array
     * @param b the second sorted array
     * @return a new sorted array containing all elements from a and b
     */
    public static int[] merge(int[] a, int[] b) {

        // Create a result array large enough to hold both arrays
        int[] result = new int[a.length + b.length];

        // i -> index for array a
        // j -> index for array b
        // k -> index for result array
        int i = 0;
        int j = 0;
        int k = 0;

        /*
         * Compare elements from both arrays one by one.
         * Copy the smaller element into the result array.
         * Move the pointer of the array from which the element was taken.
         */
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                result[k] = a[i];
                i++;          // move pointer in array a
            } else {
                result[k] = b[j];
                j++;          // move pointer in array b
            }
            k++;              // move pointer in result array
        }

        /*
         * If there are remaining elements in array a,
         * copy them directly into the result array.
         */
        while (i < a.length) {
            result[k] = a[i];
            i++;
            k++;
        }

        /*
         * If there are remaining elements in array b,
         * copy them directly into the result array.
         */
        while (j < b.length) {
            result[k] = b[j];
            j++;
            k++;
        }

        // Return the fully merged and sorted array
        return result;
    }
}