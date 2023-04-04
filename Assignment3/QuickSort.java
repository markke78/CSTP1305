public class QuickSort {
    void quickSort(int[] inputArray, int left, int right) {
        if (left >= right) {
            return;
        }
        int i = left, j = right;
        int standard = inputArray[left];

        while (i != j) {
            while (inputArray[j] >= standard && i < j) {
                j--;
            }
            while (inputArray[i] <= standard && i < j) {
                i++;
            }
            if (i < j) {
                int temp = inputArray[i];
                inputArray[i] = inputArray[j];
                inputArray[j] = temp;
            }
        }
        inputArray[left] = inputArray[i];
        inputArray[i] = standard;

        quickSort(inputArray, left, i - 1);
        quickSort(inputArray, i + 1, right);
    }

    public static void main(String[] args) {
        int[] arr = { 98, 86, 81, 13, 65, 32, 41, 9, 10, 44, 23, 21, 17, 29 };
        QuickSort q = new QuickSort();
        q.quickSort(arr, 0, 4);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
