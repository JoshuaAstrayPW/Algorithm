import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by fangxu on 2017/5/8.
 * 如果更快的求一个整数k的n次方。如果两个整数相乘并得到结果的时间复杂度为O(1)，得到整数k的N次方的过程请实现时间复杂度为O(logN)的方法。
 * <p>
 * 给定k和n，请返回k的n次方，为了防止溢出，请返回结果Mod 1000000007的值。
 * <p>
 * 测试样例：
 * 2,3
 * 返回：8
 */
public class QuickPower {
    public int getPower(int k, int N) {
        if(N == 0)
            return 1;
        if(N == 1)
            return k;
        if(N % 2 == 0){
            long tmp = getPower(k, N / 2);
            tmp = (tmp * tmp) % 1000000007;
            return (int)tmp;
        }else {
            long tmp = getPower(k, (N - 1)/ 2);
            tmp = (tmp * tmp) % 1000000007;
            return (int)((tmp * k) % 1000000007);
        }
    }
}
