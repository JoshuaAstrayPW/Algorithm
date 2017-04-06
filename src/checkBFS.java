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
      return method(root, min);

    }
    public boolean method(TreeNode root, int last){
        if(root == null)
            return true;
        if(!method(root.left, last))
            return false;
        if(root.val < last)
            return false;
        last = root.val;
        if(!method(root.right, last))
            return false;
        return true;

    }
}
