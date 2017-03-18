import java.util.ArrayList;

/**
 * Created by fangxu on 2017/3/13.
 */
public class FindNumbersWithSum {
    public ArrayList<Integer> FindNumbersWithSums(int[] array, int sum) {
        int i = 0, j = array.length - 1;
        boolean f = false;
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (array == null || array.length <= 0)
            return list;

        while (i < array.length && j > 0 ) {
            if (array[i] + array[j] > sum)
                j--;
            else if (array[i] + array[j] < sum)
                i++;
            else {
                list.add(array[i]);
                list.add(array[j]);
                break;

            }
        }


        return list;

    }

    public static void main(String[] argv) {
        FindNumbersWithSum t = new FindNumbersWithSum();
        int[] a = {
                1, 2, 4, 7, 11, 16
        };
        System.out.println(t.FindNumbersWithSums(a, 10));
    }


}
