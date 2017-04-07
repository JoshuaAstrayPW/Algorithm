/**
 * 请设计一个算法，寻找二叉树中指定结点的下一个结点（即中序遍历的后继）。
 给定树的根结点指针TreeNode* root和结点的值int p，
 请返回值为p的结点的后继结点的值。
 保证结点的值大于等于零小于等于100000且没有重复值，若不存在后继返回-1。
 */
public class FindNext {
    public int findSucc(TreeNode root, int p) {
       boolean f = false;
       return find(root, p, f);

    }
    public int find(TreeNode root, int p, boolean f){
        if(root == null)
            return -1;
        int left = find(root.left, p, f);
        if(left != -1)
            return left;
        if(f == true)
            return root.val;
        if(root.val == p)
            f = true;
        return find(root.right, p, f);
    }
}
