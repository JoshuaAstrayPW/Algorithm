/**
 * Created by fangxu on 2017/3/23.
 */
import java.util.Scanner;



public class AVInteger {


        public static void main(String[] args) {
            boolean f = false;
            Scanner in = new Scanner(System.in);
            long a = in.nextInt();
            if(a > 0 && (a % 10) >= 1){
            String b = Long.toString(a);
            char[] c = b.toCharArray();
            int len = c.length;
            int s = 0;
            for(int i = 1; i <= c.length; i++){
                s *= a % (10 * i);

            }
            int current = 0;

            for(int i = 1; i <= c.length; i++){
                current *= a % (10*i);
                if(current * current == s) {
                    System.out.println("YES");
                    f = true;
                    break;
                }

            }
            }
            if(f == false)
                System.out.println("NO");



            }
        }


