/**
 * Created by fangxu on 2017/5/8.
 * 对于一个有序循环数组arr，返回arr中的最小值。有序循环数组是指，有序数组左边任意长度的部分放到右边去，右边的部分拿到左边来。
 * 比如数组[1,2,3,3,4]，是有序循环数组，[4,1,2,3,3]也是。
 * <p>
 * 给定数组arr及它的大小n，请返回最小值。
 * <p>
 * 测试样例：
 * [4,1,2,3,3],5
 * 返回：1
 */
public class MinValue {
    public int getMin(int[] arr, int n) {
        int left = 0, right = n - 1, mid = 0;
        if (arr[left] < arr[right])
            return arr[left];
        while (left < right) {
            mid = (left + right) / 2;
            if (arr[mid] < arr[right])
                right = mid - 1;
            else if (mid > right)
                left = mid + 1;
            else {
                mid++;
                break;
            }

        }
        return arr[mid];
    }
}
