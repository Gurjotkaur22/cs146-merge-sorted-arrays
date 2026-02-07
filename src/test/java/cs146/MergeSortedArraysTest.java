package cs146;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

/**
 * JUnit tests for MergeSortedArrays
 */
public class MergeSortedArraysTest {

    @Test
    public void testMergeNormalArrays() {
        int[] a = {3, 4, 5, 8};
        int[] b = {1, 2, 6, 7};

        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] actual = MergeSortedArrays.merge(a, b);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testMergeWithEmptyArray() {
        int[] a = {};
        int[] b = {1, 2, 3};

        int[] expected = {1, 2, 3};
        int[] actual = MergeSortedArrays.merge(a, b);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testMergeBothEmpty() {
        int[] a = {};
        int[] b = {};

        int[] expected = {};
        int[] actual = MergeSortedArrays.merge(a, b);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testMergeWithDuplicates() {
        int[] a = {1, 2, 2, 4};
        int[] b = {2, 3, 3};

        int[] expected = {1, 2, 2, 2, 3, 3, 4};
        int[] actual = MergeSortedArrays.merge(a, b);

        assertArrayEquals(expected, actual);
    }
}