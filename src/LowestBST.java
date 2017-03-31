import java.util.Arrays;

/**
 * Created by fangxu on 2017/3/31.
 * <p>
 * 对于一个元素各不相同且按升序排列的有序序列，请编写一个算法，创建一棵高度最小的二叉查找树。
 * 给定一个有序序列int[] vals,请返回创建的二叉查找树的高度。
 */
//思路：
//取数组的中间元素作为根，这样数组又分为两部分，又可以递归调用。
//临界点是当数组被分割的只有2个或者1个时，那么无论怎么构造高度最低都为数
//组的长度，我们再取左子树的高度和右子树的高度最大值，再加上根的高度，就
//是最低高度，其实就就是构造平衡二叉树
public class LowestBST {
    public int buildMinimalBST(int[] vals) {

        if (vals.length <= 2)
            return vals.length;
        int len = vals.length;
        int left = buildMinimalBST(Arrays.copyOfRange(vals, 0, len / 2));
        int right = buildMinimalBST(Arrays.copyOfRange(vals, len / 2 + 1, len));
        return (left >= right) ? (left + 1) : (right + 1);
    }
}

