import java.util.Arrays;

public class ModifiedQuadraticSort {
    public void insertionSort(double arr[],int left, int right) {
        for (int i=left;i<right;i++){
            double index = arr[i];
            int j = i-1;
            while (j>=0 && arr[j] > index){
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = index;
        }
    }

    public static void main(String[] args){
        ModifiedQuadraticSort is = new ModifiedQuadraticSort();
        Test t = new Test();
        double[] arr = t.generateDoubleArray(10);
        int l = 0;
        int r = arr.length;
        is.insertionSort(arr,l,r);
        System.out.println(Arrays.toString(arr));
    }
}
