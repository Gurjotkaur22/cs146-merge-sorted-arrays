package cs146;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

/**
 * This class contains JUnit test cases for the MergeSortedArrays class.
 * Each test checks a different scenario to ensure correctness.
 */
public class MergeSortedArraysTest {

    /**
     * Tests merging two normal sorted arrays.
     */
    @Test
    public void testMergeNormalArrays() {
        int[] a = {3, 4, 5, 8};
        int[] b = {1, 2, 6, 7};

        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] actual = MergeSortedArrays.merge(a, b);

        // Verify that the merged array matches the expected output
        assertArrayEquals(expected, actual);
    }

    /**
     * Tests merging when one array is empty.
     */
    @Test
    public void testMergeWithEmptyArray() {
        int[] a = {};
        int[] b = {1, 2, 3};

        int[] expected = {1, 2, 3};
        int[] actual = MergeSortedArrays.merge(a, b);

        assertArrayEquals(expected, actual);
    }

    /**
     * Tests merging when both arrays are empty.
     */
    @Test
    public void testMergeBothEmpty() {
        int[] a = {};
        int[] b = {};

        int[] expected = {};
        int[] actual = MergeSortedArrays.merge(a, b);

        assertArrayEquals(expected, actual);
    }

    /**
     * Tests merging arrays that contain duplicate values.
     */
    @Test
    public void testMergeWithDuplicates() {
        int[] a = {1, 2, 2, 4};
        int[] b = {2, 3, 3};

        int[] expected = {1, 2, 2, 2, 3, 3, 4};
        int[] actual = MergeSortedArrays.merge(a, b);

        assertArrayEquals(expected, actual);
    }
}