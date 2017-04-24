/**
 * Created by fangxu on 2017/4/24.
 */
public class SubSequences {
    public int shortestSubsequence(int[] A, int n) {
        int max = A[0];
        int min = A[n - 1];
        int maxi = -1, minj = -1;
        for(int i = 0; i < n; i++){
            if(max < A[i])
                max = A[i];
            if(max > A[i])
                maxi = i;
        }
        for(int j = n - 1; j > 0; j--){
            if(min > A[j])
                min = A[j];
            if(min < A[j])
                minj = j;
        }
        if(maxi == -1 || minj == -1)
            return 0;
        else
            return maxi - minj + 1;

    }
}