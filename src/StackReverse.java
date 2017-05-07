import java.util.Stack;

/**
 * Created by fangxu on 2017/5/5.
 * 实现一个栈的逆序，但是只能用递归函数和这个栈本身的pop操作来实现，而不能自己申请另外的数据结构。
 * <p>
 * 给定一个整数数组A即为给定的栈，同时给定它的大小n，请返回逆序后的栈。
 * <p>
 * 测试样例：
 * [4,3,2,1],4
 * 返回：[1,2,3,4]
 */
public class StackReverse {
    public int[] reverseStack(int[] A, int n) {
        Stack<Integer> stack = new Stack<>();
        for (int i = n - 1; i >= 0; i--)
            stack.push(A[i]);
        reverse(stack);
        for(int i = 0; i < n; i++)
            A[i] = stack.pop();
        return A;
    }

    public void reverse(Stack<Integer> s) {
        if (s.isEmpty())
            return;
        int i = get(s);
        reverse(s);
        s.push(i);

    }

    public int get(Stack<Integer> s) {
        int res = s.pop();
        if (s.isEmpty())
            return res;
        else {
            int last = get(s);
            s.push(res);
            return last;
        }

    }

}
