import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by fangxu on 2017/5/9.
 * 有一棵二叉树,请设计一个算法判断它是否是完全二叉树。
 * 给定二叉树的根结点root，请返回一个bool值代表它是否为完全二叉树。树的结点个数小于等于500。
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
public class CheckCompletion {
    public boolean chk(TreeNode root) {
        if(root == null)
            return true;
        boolean leaf = false;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()){
            TreeNode pollNode = q.poll();
            if(pollNode.right != null && pollNode.left == null)
                return false;
            if(leaf && (pollNode.left != null || pollNode.right != null))
                return false;
            if(pollNode.left != null)
                q.offer(pollNode.left);
            else
                leaf = true;
            if (pollNode.right != null)
                    q.offer(pollNode.right);
            else
                leaf = true;

        }
        return true;
    }
}
