import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by fangxu on 2017/4/1.
 */

public class PrintTree {
    ArrayList<Integer> res = new ArrayList<>();
    public static void main(String[] argv){
        ArrayList<Integer> res = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] pre = new int[n];
        int[] middle = new int[n];
        for(int i = 0; i < n; i++)
            pre[i] = in.nextInt();
        for(int i = 0; i < n; i++)
            middle[i] = in.nextInt();
        PrintTree p = new PrintTree();
        for(int k : p.PrintFromTopToBottom(p.count(pre, middle)))
            System.out.print(k + " ");


    }
    public  TreeNode count(int [] pre,int [] in){
        if(pre.length == 0||in.length == 0){
            return null;
        }
        TreeNode node = new TreeNode(pre[0]);
        for(int i = 0; i < in.length; i++){
            if(pre[0] == in[i]){
                node.left = count(Arrays.copyOfRange(pre, 1, i+1), Arrays.copyOfRange(in, 0, i));
                node.right = count(Arrays.copyOfRange(pre, i+1, pre.length), Arrays.copyOfRange(in, i+1,in.length));
            }
        }

        return node;
    }
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<TreeNode> listNode = new ArrayList<TreeNode>();
        ArrayList<Integer> listVal = new ArrayList<Integer>();

        if(root == null)
            return listVal;
        listNode.add(root);
        listVal.add(root.val);
        for(int i = 0; i < listNode.size(); i++){
            TreeNode node = listNode.get(i);
            if(node.left != null){
                listNode.add(node.left);
                listVal.add(node.left.val);
            }
            if(node.right != null){
                listNode.add(node.right);
                listVal.add(node.right.val);
            }



        }

        return listVal;

}}
