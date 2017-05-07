/**
 * Created by fangxu on 2017/5/3.
 */
import java.util.*;

/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}*/
public class IdenticalTree {
    public boolean chkIdentical(TreeNode A, TreeNode B) {
       String strA = serialByPre(A);
       String strB = serialByPre(B);
       if(strA.contains(strB))
           return true;
       return false;


    }



    private String serialByPre(TreeNode head) {
       if(head == null)
           return "#!";
       String res =""+ head.val;
       res +=  serialByPre(head.left);
        res +=  serialByPre(head.right);
        return res;


    }
}