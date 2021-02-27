public class MergeSort {
    public static void merge(double[] arr, double[] l, double[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                arr[k++] = l[i++];
            } else {
                arr[k++] = r[j++];
            }
        }
        while (i < left) {
            arr[k++] = l[i++];
        }
        while (j < right) {
            arr[k++] = r[j++];
        }
    }

    public static void mergeSort(double[] arr, int n) {
        int len = arr.length;
        int mid = len / 2;
        if (len < 2) {
            return;
        }
        double[] l = new double[mid];
        double[] r = new double[len - mid];
        for (int i = 0; i < mid; i++) {
            l[i] = arr[i];
        }
        for (int i = mid; i < len; i++) {
            r[i - mid] = arr[i];
        }

        mergeSort(l, mid);
        mergeSort(r, len - mid);
        merge(arr, l, r, mid, len - mid);
    }
}