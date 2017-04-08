import java.util.Stack;

/**
 * 请设计一个算法，寻找二叉树中指定结点的下一个结点（即中序遍历的后继）。
 给定树的根结点指针TreeNode* root和结点的值int p，
 请返回值为p的结点的后继结点的值。
 保证结点的值大于等于零小于等于100000且没有重复值，若不存在后继返回-1。
 */
public class FindNext {
    private TreeNode pre = new TreeNode(-1);
        public int findSucc(TreeNode root, int p) {
           if(root == null)
               return  -1;
           int left = findSucc(root.left, p);
           if(left == -1){
               if(pre.val == p)
                   return root.val;
               pre = root;
               return findSucc(root.right, p);
           }
           return left;//如果找不到则返回上一层的根节点，方向为 左→根
        }

}
