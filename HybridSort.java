import java.util.Arrays;

public class HybridSort {
    public void hybridSort(double arr[], int left,int right){
        if (arr.length < 500){
            ModifiedQuadraticSort sort1 = new ModifiedQuadraticSort();
            sort1.insertionSort(arr, left, right);
        }
        else {
            RandomizedQuickSort sort2 = new RandomizedQuickSort();
            sort2.quickSort(arr, left, right-1);
        }
    }

    public static void main(String[] args){
        HybridSort hsort = new HybridSort();
        Test t = new Test();
        double arr[] = t.generateDoubleArray(501);
        int l = 0;
        int r = arr.length;
        hsort.hybridSort(arr,l,r);
        System.out.println(Arrays.toString(arr));
    }
}
