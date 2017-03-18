/**
 * Created by fangxu on 2017/3/4.
 * O(logn)
 */
public class BinaryResearch {
    public static boolean binarySearch(int[] array, int k){
        boolean f = false;
        int left = 0;
        int right = array.length - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(array[mid] < k) {
                left = mid + 1;
            }else if(array[mid] > k) {
                right = mid - 1;
            }else {
                f = true;
               break;
            }
        }
       return f;
    }
    public static void main(String[] args){
        int[] a = {1,2,3,4,5,6,7,8,9};
        System.out.println(binarySearch(a,9));
        System.out.println(binarySearch(a,4));
        System.out.println(binarySearch(a,11));
        System.out.println(binarySearch(a,-1));
    }
}
