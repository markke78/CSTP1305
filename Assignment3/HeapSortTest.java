import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class HeapSortTest {
    @Test
    public void testHeapSort() {
        int[] inputArray = { 88, 43, 23, 21, 1 };
        HeapSort h = new HeapSort();
        h.heap_sort(inputArray);
        assertArrayEquals(new int[] { 1, 21, 23, 43, 88 }, inputArray);
    }
    
}
