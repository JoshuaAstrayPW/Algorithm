import java.util.ArrayList;
import java.util.Stack;

/**
 * 请编写一个程序，按升序对栈进行排序（即最大元素位于栈顶），
 * 要求最多只能使用一个额外的栈存放临时数据，但不得将元素复制到别的数据结构中。
 * 给定一个int[] numbers(C++中为vector&ltint>)，
 * 其中第一个元素为栈顶，请返回排序后的栈。
 * 请注意这是一个栈，意味着排序过程中你只能访问到第一个元素。
 * 测试样例：
 * [1,2,3,4,5]
 * 返回：[5,4,3,2,1]
 */
//stack1弹出一个tmp，循环判断是stack2的栈顶是否大于tmp，大于就弹入stack1，
//再将tmp压入是stack2，此时tmp是最小元素。……^_^
public class TwoStacksSort {
    public ArrayList<Integer> twoStacksSort(int[] numbers) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++)
            stack1.push(numbers[i]);
        while (!stack1.isEmpty()) {
            int tmp = stack1.pop();
            //一定要先判断栈空
            while (!stack2.isEmpty() && stack2.peek() > tmp  ){
                stack1.push(stack2.pop());
            }
            stack2.push(tmp);

        }
        while (!stack2.isEmpty())
            res.add(stack2.pop());
        return res;


    }
    public static  void main(String[] args){
        TwoStacksSort t = new TwoStacksSort();
        int[] a =  {1,2,3,4,5};
        System.out.println(t.twoStacksSort(a));
    }
}

