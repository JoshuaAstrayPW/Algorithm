import java.util.Stack;

/**
 * Created by fangxu on 2017/3/13.
 */
public class LeftRotateString {
    public String LeftRotateStrings(String str, int n) {
        if(str.length() <= 0 || str == null)
            return null;
        char[] a = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        Stack stack1 = new Stack();
        Stack stack2 = new Stack();
        for (int i = a.length - 1; i >= 0; i--)
            stack1.push(a[i]);
        for (int i = 0; i < n; i++)
            stack2.push(stack1.pop());
        while(!stack1.isEmpty()){
            sb.append(stack1.pop());
        }
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        while(!stack1.isEmpty()){
            sb.append(stack1.pop());
        }
        return sb.toString();


    }
}
