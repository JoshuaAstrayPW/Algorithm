/**
 * Created by fangxu on 2017/5/10.
 * 这是一个经典的LIS(即最长上升子序列)问题，请设计一个尽量优的解法求出序列的最长上升子序列的长度。
 * <p>
 * 给定一个序列A及它的长度n(长度小于等于500)，请返回LIS的长度。
 * <p>
 * 测试样例：
 * [1,4,2,5,3],5
 * 返回：3
 */
public class LongestIncreasingSubsequence {
    public int getLIS(int[] A, int n) {
        int[] res = new int[n];
        int top = 0;
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            int max = 0;
            for (int j = i - 1; j >= 0; j--)
                if (A[j] < A[i])
                    max = Math.max(res[j], max);
            res[i] = max + 1;
            if(top < res[i])
                top = res[i];

        }
        return top;

    }
}