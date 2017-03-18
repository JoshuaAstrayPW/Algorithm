import java.util.ArrayList;

/**
 * Created by fangxu on 2017/3/12.
 */
public class FindContinuousSequence {
    public ArrayList<ArrayList<Integer>> FindContinuousSequences(int sum) {
        int low = 1,high = 2;
        ArrayList<ArrayList<Integer>> allRes = new ArrayList<ArrayList<Integer>>();
        while(high > low){
            int cur = (high + low) * (high - low + 1) / 2;
            if(cur < sum)
                high ++;
            if(cur == sum){
                ArrayList<Integer> list = new ArrayList<>();
                for(int i = low; i <= high; i++)
                    list.add(i);
                allRes.add(list);
                low++;

            }
            if(cur > sum)
                low++;

        }
        return allRes;

    }

    public static void main(String[] argv){
        FindContinuousSequence t = new FindContinuousSequence();
        System.out.println(t.FindContinuousSequences(20));

    }

}
