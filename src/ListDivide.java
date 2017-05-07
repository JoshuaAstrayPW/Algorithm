/**
 * Created by fangxu on 2017/5/7.
 * 对于一个链表，我们需要用一个特定阈值完成对它的分化，使得小于等于这个值的结点移到前面，大于该值的结点在后面，同时保证两类结点内部的位置关系不变。
 * <p>
 * 给定一个链表的头结点head，同时给定阈值val，请返回一个链表，使小于等于它的结点在前，大于等于它的在后，保证结点值不重复。
 * <p>
 * 测试样例：
 * {1,4,2,5},3
 * {1,2,4,5}
 */
public class ListDivide {
    public ListNode listDivide(ListNode head, int val) {
        if (head == null || head.next == null) return head;

        ListNode node = head, smallerList = null, biggerList = null;
        ListNode tmp = null, smallerListTail = null, biggerListTail = null;
        while (node != null) {
            tmp = node;
            node = node.next;

            tmp.next = null;
            int value = tmp.val;
            if (value <= val) {
                if (smallerList == null)
                    smallerList = tmp;
                else
                    smallerListTail.next = tmp;
                smallerListTail = tmp;
            } else {
                if (biggerList == null)
                    biggerList = tmp;
                else
                    biggerListTail.next = tmp;
                biggerListTail = tmp;
            }
        }
        if (smallerListTail == null)
            return biggerList;
        else if (biggerList == null)
            return smallerList;
        smallerListTail.next = biggerList;
        return smallerList;

    }
}
