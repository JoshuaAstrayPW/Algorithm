import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by fangxu on 2017/3/12.
 */
public class GetNumberOfK {
    public int GetNumberOfKs(int[] array, int k) {
        int index = Arrays.binarySearch(array,k);
        if (array.length <= 0 || array == null)
            return 0;
        if(index < 0)
            return 0;
        int cnt = 0;
        for(int i = index + 1; i < array.length; i++){
            if(array[i] != k )
                break;
            cnt++;
        }
        for(int i = index ;i >= 0; i--){
            if(array[i] != k )
                break;
            cnt++;
        }
        return cnt;




    }

    public int get(int[] array, int k, int left, int right) {

        while (left < right) {
            int mid = (left + right) / 2;
            if (array[mid] < k)
                left = mid + 1;
            else if (array[mid] > k)
                right = mid - 1;
            else
                return mid;

        }
        return -1;

    }
    public static void main(String[] argv){
        GetNumberOfK g = new GetNumberOfK();
        int[] array = {2,2,2,2,2,2,9,4};

        System.out.println(g.GetNumberOfKs(array,2));
    }

}
