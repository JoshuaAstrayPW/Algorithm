/**
 * Created by fangxu on 2017/5/10.
 * 有n级台阶，一个人每次上一级或者两级，问有多少种走完n级台阶的方法。为了防止溢出，请将结果Mod 1000000007
 * <p>
 * 给定一个正整数int n，请返回一个数，代表上楼的方式数。保证n小于等于100000。
 * <p>
 * 测试样例：
 * 1
 * 返回：1
 */
public class GoUpstairs {
    public int countWays(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        int res = 0, f1 = 2, f2 = 1;
        for (int i = 3; i <= n; i++) {
            res = (f1 + f2) % 1000000007;
            f2 = f1;
            f1 = res;
        }
        return res;
    }
}