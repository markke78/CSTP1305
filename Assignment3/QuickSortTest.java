

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class QuickSortTest {
    @Test
    public void testQuickSort() {
        
        int[] inputArray = { 88, 43, 23, 21, 1 };
        QuickSort q = new QuickSort();
        q.quickSort(inputArray, 0, 4);
        assertArrayEquals(new int[] { 1, 21, 23, 43, 88 }, inputArray);        
    }
}
