import java.util.ArrayList;
import java.util.Scanner;

/**
 * 用英文字母a-z来分别表示数值0-25,
 * 形成一个26进制的数值表示法。需要你写一个方法，
 * 将用a-z表示的26进制数值的字符串，转化为对应的10进制数值。
 * 样例输入：
 * ba
 *bcd
 *gibbon
 *goodboy

 *样例输出
 *26
 *731
 *74962693
 *2026285376
 **/
public class jinzhizhuanhuan {
    public static void main(String[] argv){
        Scanner in = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int q = 0;
        while(in.hasNext())
            list.add(in.next());
        for(int i = 0; i < list.size(); i++){
            char[] c = list.get(i).toCharArray();
            change(c);
        }
    }
    public static int change(char[] a){
        int i, j;
        int temp = 0;
        int op = 1;
        int len = a.length;
        if(len == 0)
            System.out.println(0);
        for(char c : a)
            if(a[c] > 'z' || a[c] < 'a')
                System.out.println(0);

        if (len == 1 && a[0] == 'a') {
            System.out.println("0");
            return 0;
        }
        for (i = len - 1; i >= 0; i--) {
            temp += ((a[i] - 'a') * op);
            op *= 26;
        }
        System.out.println(temp);

        return 0;


    }
}
