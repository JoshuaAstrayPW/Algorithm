import apple.laf.JRSUIUtils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by fangxu on 2017/5/9.
 * 有一棵二叉树，请设计一个算法，按照层次打印这棵二叉树。
 * 给定二叉树的根结点root，请返回打印结果，结果按照每一层一个数组进行储存，
 * 所有数组的顺序按照层数从上往下，且每一层的数组内元素按照从左往右排列。保证结点数小于等于500。
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
public class TreePrinter {
    public int[][] printTree(TreeNode root) {
        if (root == null)
            return null;
        Queue<TreeNode> q = new LinkedList();
        ArrayList<Integer> rList = new ArrayList<>();
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();

        q.offer(root);
        TreeNode last = root, nlast = null;
        while (!q.isEmpty()) {
            TreeNode popNode = q.poll();
            rList.add(popNode.val);
            if (popNode.left != null) {
                q.offer(popNode.left);
                nlast = popNode.left;
            }
            if (popNode.right != null) {
                q.offer(popNode.right);
                nlast = popNode.right;
            }
            if (popNode == last) {
                last = nlast;
                lists.add(rList);
                rList = new ArrayList<Integer>();
            }


        }
        int[][] result = new int[lists.size()][];
        for (int i = 0; i < lists.size(); i++) {
            result[i] = new int[lists.get(i).size()];
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = lists.get(i).get(j);
            }
        }
        return result;

    }
}