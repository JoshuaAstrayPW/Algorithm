import java.util.Scanner;

/**
 * 给定两个长度为 n 的整数数列 A 和 B。再给定 q 组查询，
 * 每次查询给出两个整数 x 和 y，求满足 Ai >= x 且 Bi >= y 这样的 i 的数量。
 输入
 第一行给定两个整数 n 和 q。
 第二行给定数列 A，包含 n 个整数。
 第三行给定数列 B，包含 n 个整数。
 接下来 q 行，每行两个整数 x 和 y，意义如上所述。
 输出
 对于每组查询，输出所求的下标数量。

 样例输入
 3 2
 3 2 4
 6 5 8
 1 1
 4 8
 样例输出
 3
 1

 */
public class ArraySearchtoutiao {
    public static void main(String[] argv){
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int q = in.nextInt();
        long[] a = new long[len];
        long[] b = new long[len];
        int[] count = new int[q];
        for(int i = 0; i < len; i++)
            a[i] = in.nextInt();
        for(int i = 0; i < len; i++)
            b[i] = in.nextInt();

        for(int i = 0; i < q; i++){
            int x = in.nextInt(),y = in.nextInt();
            for(int j = 0; j < len; j++){
                if(a[j] >= x && b[j] >= y)
                    count[i]++;
            }


        }
        for(int i = 0; i < q; i++)
             System.out.println(count[i]);
    }
}
