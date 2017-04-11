/**
 * Created by fangxu on 2017/4/8.
 * 满二叉树的最近公共祖先
 */
public class LCA {
    public int getLCA(int a, int b) {
       while (a != b){
           if(a > b)
               a /= 2;
           else
               b /= 2;
       }
       return a;
    }
}
