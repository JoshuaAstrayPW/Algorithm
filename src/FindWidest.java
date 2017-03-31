import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by fangxu on 2017/3/30.
 */
public class FindWidest {
    public static void main(String[] argv){
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int[] a = new int[len];
        int first = 0;
        int last = 0;
        int max = 0;
        int f = 0;
        for(int i = 0; i < len - 1; i++)
            a[i] = in.nextInt();
        map.put(0,0);
        for(int i = 0; i < len - 1; i++){
            if (a[i] < a[i + 1]){
                if(f != 1)
                    last++;
                else {
                    if(max < (last - first)) {
                        max = last - first;
                        map.put(max, last);
                    }
                    f = 0;
                    first = i;
                    last++;


                }
            }else if (a[i] > a[i + 1]){
                if(last != 0){
                    f = 1;
                    last++;
                }else {
                    first = i + 1;
                }
            }


        }
        System.out.println(last - max  +" "+map.get(max));

    }
}
