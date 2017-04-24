/**
 * Created by fangxu on 2017/4/23.
 */
import java.util.*;

public class QuickSort {
    public int[] quickSort(int[] A,int n){
        quickSort(A,0,n-1);
        return A;
    }
    public void quickSort(int[] A, int start, int end){
        if(start < end){
            int index = partition(A, start, end);
            if(start < index - 1){
                quickSort(A, start,index-1);
            }
            if(index < end){
                quickSort(A, index, end);
            }
        }
    }
    public int partition(int[] A,int start,int end){
        int pivot = A[(start + end) / 2];
        while(start <= end){
            while(A[start] < pivot)
                start++;
            while(pivot < A[end])
                end--;
            if(start <= end){
                int tmp = A[end];
                A[end] = A[start];
                A[start] = tmp;
                start++;
                end--;
            }
        }
        return start;
    }



    public static void main(String[] argv) {
        QuickSort q = new QuickSort();
        int[] a = {54, 35, 48, 36, 27, 12, 44, 44, 8, 14, 26, 17, 28};
        q.quickSort(a, 13);
        for(int k = 0; k < a.length; k++)
        System.out.print(a[k]+" ");

    }

}