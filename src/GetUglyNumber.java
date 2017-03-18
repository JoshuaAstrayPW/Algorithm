import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

/**
 * Created by fangxu on 2017/3/7.
 */

public class GetUglyNumber {
    public static int GetUglyNumber_Solution(int index) {
        if (index == 0) {
            return 0;
        }

        ArrayList<Integer> al = new ArrayList<Integer>();

        int count = 1;
        al.add(1);
        int min = 0;
        int m1 = 0, m3 = 0, m5 = 0;
        while (count < index) {
            min = min(al.get(m1) * 2, al.get(m3) * 3, al.get(m5) * 5);
            count++;
            al.add(min);
            if (min == al.get(m1) * 2)
                m1++;
            if (min == al.get(m3) * 3)
                m3++;
            if (min == al.get(m5) * 5)
                m5++;
        }
        return al.get(index - 1);

    }

    public static int min(int a, int b, int c) {
        int temp = a > b ? b : a;
        return temp = temp > c ? c : temp;
    }

    public static void main(String[] argv) {
        System.out.println(GetUglyNumber_Solution(2));


    }
}