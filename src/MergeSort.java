import java.util.Scanner;

/**
 * Created by fangxu on 2017/4/23.
 */
public class MergeSort {
    public int[] mergeSort(int[] A,int n) {
        int[] tmp = new int[n];
        sort(A, tmp, 0, n-1);
        //for(int i = 0; i < A.length; i++)
          //  System.out.println(A[i]);
        return A;
    }
    public void sort(int[] A, int[] tmp,int left, int right){
        if(left < right){
            int center = (left + right) / 2;
            sort(A,tmp, left, center);
            sort(A, tmp,center+1, right);
            merge(A,tmp, left, center+1, right);
        }


    }
    public void merge(int[] A, int[] tmp,int leftPos,int rightPos, int rightEnd){
        int len = rightEnd - leftPos + 1;

        int t = leftPos;

        int leftEnd = rightPos - 1;
        while(leftPos <= leftEnd && rightPos <= rightEnd){
            if(A[leftPos] <= A[rightPos])
                tmp[t++] = A[leftPos++];
            else
                tmp[t++] = A[rightPos++];
        }
        while (leftPos <= leftEnd)
            tmp[t++] = A[leftPos++];
        while (rightPos <= rightEnd)
            tmp[t++] = A[rightPos++];
        for(int i = 0; i < len; i++, rightEnd--)
            A[rightEnd] = tmp[rightEnd];


    }
    public static void main(String[] argv){
        MergeSort m = new MergeSort();
        int[] a = {54,35,48,36,27,12,44,44,8,14,26,17,28};
         m.mergeSort(a,13);
    }
}