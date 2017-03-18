import java.util.Arrays;

/**
 * Created by fangxu on 2017/3/13.
 */
public class isContinuous {
    public boolean isContinuouss(int[] numbers) {
        int jokers = 0;
        if(numbers == null || numbers.length != 5)
            return false;
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++)
            if (numbers[i] == 0)
                jokers++;
        if (jokers > 4)
            return false;
        for (int i = jokers + 1; i < 5; i++)
            if (numbers[i] == numbers[i - 1])
                return false;
        if(numbers[4] - numbers[jokers] <= 4)
            return true;
        return false;
    }
    public static void main(String[] argv){
        isContinuous s = new isContinuous();
        int[] a = {1,3,2,5,4};
        System.out.println(s.isContinuouss(a));
    }
}
