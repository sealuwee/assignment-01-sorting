public class InsertionSort {
    public static void insertionSort(double[] arr) {
        for (int i = 1; i < arr.length; i++) {
            double idx = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > idx) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = idx;
        }
    }
}