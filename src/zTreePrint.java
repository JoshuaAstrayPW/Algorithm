/**
 * Created by fangxu on 2017/3/16.
 */
import java.util.ArrayList;
import java.util.Stack;




public class zTreePrint {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> zTreeList = new ArrayList<ArrayList<Integer>>();
        if (pRoot == null)
            return null;
        Stack<TreeNode> oddStack = new Stack<>();
        Stack<TreeNode> evenStack = new Stack<>();
        boolean isOdd = true;
        oddStack.add(pRoot);
        while (!(oddStack.isEmpty() && evenStack.isEmpty()))
        {
            ArrayList<Integer> currentList = new ArrayList<>();
            if (isOdd == true)
            {
                while (!oddStack.isEmpty())
                {
                    TreeNode currentNode = oddStack.peek();
                    currentList.add(currentNode.val);
                    if (currentNode.left != null)
                        evenStack.push(currentNode.left);
                    if (currentNode.right != null)
                        evenStack.push(currentNode.right);
                    oddStack.pop();

                }
                zTreeList.add(currentList);
                isOdd = false;
            } else
            {
                while (!evenStack.isEmpty())
                {

                    TreeNode currentNode = evenStack.peek();
                    currentList.add(currentNode.val);
                    if (currentNode.right != null)
                        oddStack.push(currentNode.right);
                    if (currentNode.left != null)
                        oddStack.push(currentNode.left);
                    evenStack.pop();

                }
                zTreeList.add(currentList);
                isOdd = true;

            }

        }
        return zTreeList;
    }
}