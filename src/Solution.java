import java.util.ArrayList;


public class Solution {
    public static int minNumberInRotateArray(int [] array) {
        int low = 0 ; int high = array.length - 1;
        while(low < high){
            int mid = low + (high - low) / 2;
            if(array[mid] > array[high]){
                low = mid + 1;
            }else if(array[mid] == array[high]){
                high = high - 1;
            }else{
                high = mid;
            }
        }
        return array[low];
    }
    public static void main(String[] argv){
        int[] a = {4,5,1,2, 3};
        System.out.println(minNumberInRotateArray(a));
    }
}