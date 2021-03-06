import java.util.ArrayList;

/**
 * Created by fangxu on 2017/5/7.
 * 现有两个升序链表，且链表中均无重复元素。请设计一个高效的算法，打印两个链表的公共值部分。
 * <p>
 * 给定两个链表的头指针headA和headB，请返回一个vector，元素为两个链表的公共部分。请保证返回数组的升序。两个链表的元素个数均小于等于500。保证一定有公共值
 * <p>
 * 测试样例：
 * {1,2,3,4,5,6,7},{2,4,6,8,10}
 * 返回：[2.4.6]
 */
public class FindCommonParts {
    public int[] findCommonParts(ListNode headA, ListNode headB) {
        ArrayList<Integer> res = new ArrayList<>();
        ListNode a = headA;
        ListNode b = headB;
        while (a != null && b != null){
            if(a.val == b.val){
                res.add(a.val);
                a = a.next;
                b = b.next;
            }
            else if(a.val < b.val)
                a = a.next;
            else
                b = b.next;
        }
        int[] r = new int[res.size()];
        for(int i = 0; i < res.size(); i++)
            r[i] = res.get(i);
        return r;
    }
}
