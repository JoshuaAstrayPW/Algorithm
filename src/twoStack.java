import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by fangxu on 2017/5/6.
 */
public class twoStack {
    public ArrayList<Integer> twoStacksSort(int[] numbers) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = numbers.length - 1; i > 0; i--)
            stack1.push(numbers[i]);
        while (!stack1.isEmpty()){
            int tmp = stack1.pop();
            while (!stack2.isEmpty() && tmp < stack2.peek())
                stack1.push(stack2.pop());
            stack2.push(tmp);
        }
        ArrayList<Integer> list =  new ArrayList<>();
        while (!stack2.isEmpty())
            list.add(stack2.pop());
        return list;


    }
}
