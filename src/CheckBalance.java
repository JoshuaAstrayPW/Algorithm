/**
 * Created by fangxu on 2017/5/9.
 * 有一棵二叉树，请设计一个算法判断这棵二叉树是否为平衡二叉树。
 * <p>
 * 给定二叉树的根结点root，请返回一个bool值，代表这棵树是否为平衡二叉树。
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
public class CheckBalance {
    public boolean check(TreeNode root) {
        return checkByHighth(root) >= 0;
    }

    public int checkByHighth(TreeNode root) {
        if (root == null)
            return 1;
        int lh = checkByHighth(root.left);
        int rh = checkByHighth(root.right);
        if (lh < 0 || rh < 0)
            return -1;
        if (Math.abs(lh - rh) > 1)
            return -1;
        return lh > rh ? lh + 1 : rh + 1;
    }

}