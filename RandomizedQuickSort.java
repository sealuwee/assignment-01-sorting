import java.util.Random;
import java.util.Arrays;

public class RandomizedQuickSort {
    public static void getRandom(double arr[], int start, int end){
        Random r = new Random();
        int pivot = r.nextInt(end-start)+start;
        double temp = arr[pivot];
        arr[pivot] = arr[end];
        arr[end] = temp;
    }
    public int partition(double arr[], int start, int end){
        getRandom(arr,start,end);
        double pivot = arr[end];
        int i = (start-1);
        for (int j=start;j<end;j++){
            if (arr[j]<=pivot) {
                i++;
                double temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        double temp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = temp;
        return i+1;
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
