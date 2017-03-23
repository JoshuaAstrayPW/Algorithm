import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by fangxu on 2017/3/16.
 */
public class TreePrint {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(pRoot == null)
            return result;
        Queue<TreeNode> layer = new LinkedList<TreeNode>();
        ArrayList<Integer> layerList = new ArrayList<>();
        int start = 0,end = 1;
        layer.add(pRoot);
        while (!layer.isEmpty()){
            TreeNode cur = layer.remove();
            layerList.add(cur.val);
            start++;
            if(cur.left != null)
                layer.add(cur.left);
            if(cur.right != null)
                layer.add(cur.right);
            if(start == end){
                start = 0;
                end = layer.size();
                result.add(layerList);
                layerList = new ArrayList<Integer>();

            }
        }
        return result;



    }
}
