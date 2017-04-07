import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by fangxu on 2017/4/7.
 */
public class NumberSort {
    public static void main(String[] argv){
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> res = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();

        int[] array = new int[3];
        for(int i = 0; i < 3; i++){

            array[i] = in.nextInt();
        }
        int n = array[2];
        Arrays.sort(array);
        for(int i = 0; i < 3; i++){
            res.add(array[i]);
            if(array[i] == 2 && !res.contains(5))
                res.add(5);
            if(array[i] == 5 && !res.contains(2))
                res.add(2);
            if(array[i] == 6 && !res.contains(9))
                res.add(9);
            if(array[i] == 9 && !res.contains(6))
                res.add(6);

        }
        Arrays.sort(res.toArray());

        for(int i = 0; i < res.size(); i++){
         list.add(res.get(i));
        }

        for(int i = 0; i < res.size(); i++){
            res.remove(i);
            for(int j = 0 ; j < 2 ; j++)
                if(!list.contains(res.get(i) * 10 + res.get(j)))
                     list.add(res.get(i) * 10 + res.get(j));
            res.add(array[i]);
        }
        for(int i = 0; i < res.size(); i++){
            res.remove(i);
                for(int j = 0; j < res.size(); j++){

                    res.remove(j);
                    for(int k = 0; k < res.size(); k++)
                        list.add(res.get(i) * 100 + res.get(j) *10 + res.get(k));
                }
        }
        if(n <= list.size() && n > 0)
            System.out.println(list.get(n));


    }
}

