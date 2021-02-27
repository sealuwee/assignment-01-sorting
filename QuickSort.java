public class QuickSort {
    public int partition(double arr[], int start, int end) {
        double pivot = arr[end];
        int i = start - 1;

        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                double temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        double temp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = temp;
        return (i + 1);
    }
    public void quickSort(double arr[], int start, int end) {
        if (start < end) {
            int partitionPosition = partition(arr, start, end);
            quickSort(arr, start, partitionPosition - 1);
            quickSort(arr, partitionPosition + 1, end);
        }
    }
}