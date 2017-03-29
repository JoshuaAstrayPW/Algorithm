import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by fangxu on 2017/3/29.
 */
//猴吃桃问题
public class tanchi {
    public static void count(int day){
        int x1 = 0,x2 = 1;
        for(; day > 1; day--)
        {
            x1 = (x2 + 3) * 2;
            x2 = x1;
        }
        System.out.println(x1);
    }

    public static void main(String[] argv){
        Scanner in = new Scanner(System.in);
        int[] array = new int[10];
        int i = 0;
        while (in.hasNext()){

            array[i++] = in.nextInt();
        }
        for(int k : array){
            count(k);
        }


    }
}
