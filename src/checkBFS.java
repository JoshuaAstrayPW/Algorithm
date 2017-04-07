import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

/**
 * Created by fangxu on 2017/4/6.
 */
/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}*/
public class checkBFS {
    public boolean checkBST(TreeNode root) {
      int min = MIN_VALUE;
      int max = MAX_VALUE;
      return method(root, min, max);

    }
    public boolean method(TreeNode root, int min, int max){
        if(root == null)
            return true;
       if(root.val < min || root.val > max)
           return false;
        return method(root.left, min, root.val ) && method(root.right, root.val, max);

    }
}
