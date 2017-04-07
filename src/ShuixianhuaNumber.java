import java.util.Scanner;

/**
 * Created by fangxu on 2017/4/7.
 */
public class ShuixianhuaNumber {
    public static void main(String[] argv){
        Scanner in = new Scanner(System.in);
        int cnt = 1;
        int sum = 0;
        for(int i = 100; i <= 1000; i++){
            int g = i % 10;
            int s = i / 10 % 10;
            int b = i /100 % 10;
            if(i == Math.pow(g, 3) + Math.pow(s, 3) + Math.pow(b, 3)){
                System.out.println("第" + cnt +"个水仙花数: " + i);
                sum += i;
                cnt++;
            }


        }
        System.out.println("水仙花数总和为: " +  sum);
    }
}
