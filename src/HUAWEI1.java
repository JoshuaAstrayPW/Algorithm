import java.util.Scanner;

/**
 * Created by fangxu on 2017/3/23.
 */
public class HUAWEI1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int stNum = in.nextInt();
        int opNum = in.nextInt();
        int[] a = new int[stNum];
        for(int k = 0; k < stNum; k++)
            a[k] = in.nextInt();
        for(int i = 0; i < opNum; i++){
            if(in.next().equals("Q") ){
                int m = in.nextInt();
                int n = in.nextInt();
                int max = 0;
                if(m > n){
                    int temp = m;
                    m = n;
                    n = temp;
                }


                for(int q = m - 1; q <= n - 1 && q <= stNum; q++ )
                    if(a[q] >= max)
                        max = a[q];
                System.out.println(max);
            }else
                a[in.nextInt()-1] = in.nextInt();


        }




    }
}
