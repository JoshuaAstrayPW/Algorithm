/**
 * Created by fangxu on 2017/5/10.
 * 从二叉树的节点A出发，可以向上或者向下走，但沿途的节点只能经过一次，当到达节点B时，路径上的节点数叫作A到B的距离。
 * 对于给定的一棵二叉树，求整棵树上节点间的最大距离。
 * <p>
 * 给定一个二叉树的头结点root，请返回最大距离。保证点数大于等于2小于等于500.
 */
public class LongestDistance {
    private int longest = 0; // save the longest distance;
    public int findLongest(TreeNode root) {
       int dep = findDist(root);
       return longest;
    }
    public int findDist(TreeNode root) {
        if(root == null)
            return 0;
        int left = findDist(root.left);
        int right = findDist(root.right);
        longest = Math.max(left + right + 1, longest);
        return Math.max(left, right) + 1;
    }
}