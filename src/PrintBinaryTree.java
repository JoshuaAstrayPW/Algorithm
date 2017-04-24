import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by fangxu on 2017/4/23.
 */
public class PrintBinaryTree {
    public static int[][] printTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        ArrayList<Integer> array = new ArrayList<>();
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
        if (root == null)
            return null;
        TreeNode last = root;
        TreeNode nlast = null;
        q.offer(root);
        while (!q.isEmpty()) {
            TreeNode cur = q.poll();
            array.add(cur.val);
            if (cur.left != null) {
                q.offer(cur.left);
                nlast = cur.left;
            }
            if (cur.right != null) {
                q.offer(cur.right);
                nlast = cur.right;
            }
            if (last == cur) {
                arrayLists.add(array);
                array = new ArrayList<Integer>();
                last = nlast;
            }


        }
        int[][] res = new int[arrayLists.size()][];
        for (int i = 0; i < arrayLists.size(); i++) {
            res[i] = new int[arrayLists.get(i).size()];
            for (int j = 0; j < res[i].length; j++)
                res[i][j] = arrayLists.get(i).get(j);
        }

        return res;


    }

}
