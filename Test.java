import java.lang.System.*;
import java.util.Random;
import java.util.Arrays;

public class Test {
    public static double[] generateDoubleArray(int n) {
        // n is the size of the array
        double[] arr = new double[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (new Random()).nextDouble();
        }
        return arr;
    }

    public static void main(String[] args) {
        // replace this variable with the amount of algorithms we're recording
        int[] arraySizes = {50000, 100000, 150000, 200000, 250000, 300000, 350000, 400000, 450000, 500000};
        // run the algorithm for each array of size n from arraysizes[]
        float[] selectionSortRuntimes = new float[arraySizes.length];
        float[] bubbleSortRuntimes = new float[arraySizes.length];
        float[] insertionSortRuntimes = new float[arraySizes.length];
        float[] mergeSortRuntimes = new float[arraySizes.length];
        float[] quickSortRuntimes = new float[arraySizes.length];

        SelectionSort sort1 = new SelectionSort();
        BubbleSort sort2 = new BubbleSort();
        InsertionSort sort3 = new InsertionSort();
        MergeSort sort4 = new MergeSort();
        QuickSort sort5 = new QuickSort();

        for (int i = 0; i < arraySizes.length; i++) {
            double[] arr1 = generateDoubleArray(arraySizes[i]);
            long time_start1 = System.currentTimeMillis();
            sort1.selectionSort(arr1);
            long time_end1 = System.currentTimeMillis();
            selectionSortRuntimes[i] = (time_end1 - time_start1) / 1000F;
            double[] arr2 = generateDoubleArray(arraySizes[i]);
            long time_start2 = System.currentTimeMillis();
            sort2.bubbleSort(arr2);
            long time_end2 = System.currentTimeMillis();
            bubbleSortRuntimes[i] = (time_end2 - time_start2) / 1000F;
            double[] arr3 = generateDoubleArray(arraySizes[i]);
            long time_start3 = System.currentTimeMillis();
            sort3.insertionSort(arr3);
            long time_end3 = System.currentTimeMillis();
            insertionSortRuntimes[i] = (time_end3 - time_start3) / 1000F;
            double[] arr4 = generateDoubleArray(arraySizes[i]);
            long time_start4 = System.currentTimeMillis();
            sort4.mergeSort(arr4,arr4.length);
            long time_end4 = System.currentTimeMillis();
            mergeSortRuntimes[i] = (time_end4 - time_start4) / 1000F;
            double[] arr5 = generateDoubleArray(arraySizes[i]);
            long time_start5 = System.currentTimeMillis();
            sort5.quickSort(arr5, 0, arr5.length - 1);
            long time_end5 = System.currentTimeMillis();
            quickSortRuntimes[i] = (time_end5 - time_start5) / 1000F;
        }

        System.out.println(Arrays.toString(selectionSortRuntimes));
        System.out.println(Arrays.toString(bubbleSortRuntimes));
        System.out.println(Arrays.toString(insertionSortRuntimes));
        System.out.println(Arrays.toString(mergeSortRuntimes));
        System.out.println(Arrays.toString(quickSortRuntimes));

    }
}