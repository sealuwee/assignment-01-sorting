import java.util.Random;
import java.util.Arrays;

public class RandomizedQuickSort {
    public int partition(double arr[], int start, int end){
    int pivot = (new Random()).nextInt(end);
        int i = start-1;

        for (int j=start;j<end;j++){
            if (arr[j]<=pivot) {
                i++;
                double temp = arr[i];
                arr[i] = arr[j];
                arr[i] = temp;
            }
        }
        double temp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = temp;
        return (i+1);
    }
    public void quickSort(double arr[], int start, int end){
        if (start<end){
            int pivot = partition(arr,start,end);
            quickSort(arr,start,pivot-1);
            quickSort(arr,pivot+1,end);
        }
    }
    public static void main(String[] args){
        RandomizedQuickSort obj = new RandomizedQuickSort();
        Test t = new Test();
        double[] arr = t.generateDoubleArray(10);
        obj.quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
