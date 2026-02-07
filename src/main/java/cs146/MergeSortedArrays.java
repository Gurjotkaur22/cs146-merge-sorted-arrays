package cs146;

/**
 * Merge two sorted arrays into one sorted array.
 *
 * Time:  O(n + m)
 * Space: O(n + m)
 */
public class MergeSortedArrays {

    /**
     * Merges two sorted integer arrays into one sorted array.
     *
     * @param a first sorted array (non-decreasing)
     * @param b second sorted array (non-decreasing)
     * @return merged sorted array
     */
    public static int[] merge(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];

        int i = 0; // pointer for a
        int j = 0; // pointer for b
        int k = 0; // pointer for result

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                result[k++] = a[i++];
            } else {
                result[k++] = b[j++];
            }
        }

        while (i < a.length) {
            result[k++] = a[i++];
        }

        while (j < b.length) {
            result[k++] = b[j++];
        }

        return result;
    }
}