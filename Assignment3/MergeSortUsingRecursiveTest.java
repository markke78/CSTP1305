import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MergeSortUsingRecursiveTest {
    @Test
    public void testMergeSort() {
        int[] inputArray = { 88, 43, 23, 21, 1 };
        MergeSortUsingRecursive m = new MergeSortUsingRecursive();
        m.mergeSort(inputArray);
        assertArrayEquals(new int[] { 1, 21, 23, 43, 88 }, inputArray);
    }
}
