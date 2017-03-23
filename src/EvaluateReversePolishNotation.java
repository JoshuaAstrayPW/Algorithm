import java.util.Stack;

/**
 * Created by fangxu on 2017/3/23.
 */
//后缀求和
public class EvaluateReversePolishNotation {
    public int evaRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            try {
                int num = Integer.parseInt(tokens[i]);
                stack.add(num);
            } catch (Exception e) {
                int a = stack.pop();
                int b = stack.pop();
                stack.add(get(a, b, tokens[i]));
            }
        }
        return stack.pop();
    }

    private int get(int a, int b, String operater) {
        switch (operater) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                return 0;
        }
    }
}
