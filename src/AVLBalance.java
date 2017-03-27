/**
 * 实现一个函数，检查二叉树是否平衡，
 * 平衡的定义如下，对于树中的任意一个结点，其两颗子树的高度差不超过1。
 *给定指向树根结点的指针TreeNode* root，请返回一个bool，代表这棵树是否平衡。
 */
public class AVLBalance {
    private boolean isBalanced = true;
    public boolean isBalance(TreeNode root) {
       getDeoth(root);
       return isBalanced;
    }
    public int getDeoth(TreeNode root){
        if(root == null)
            return 0;
        int left = getDeoth(root.left);
        int right = getDeoth(root.right);
        if(Math.abs(left - right) > 1)
            isBalanced = false;
        return right > left ? right+1 : left+1;

    }
}
