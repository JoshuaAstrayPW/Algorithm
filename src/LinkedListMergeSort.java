/**
 * Created by fangxu on 2017/4/21.
 */
public class LinkedListMergeSort {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode p = head;
        ListNode q = head.next;
        while (q != null && q.next != null) {
            p = p.next;
            q = q.next.next;
        }
        ListNode left = sortList(p.next);
        p.next = null;
        ListNode right = sortList(head);
        return Merge(left, right);

    }

    public ListNode Merge(ListNode left, ListNode right) {
        ListNode res = new ListNode(0);
        ListNode p = res;
        while (left != null && right != null) {
            if (left.val < right.val) {
                p.next = left;
                left = left.next;
            } else {
                p.next = right;
                right = right.next;
            }
            p = p.next;
        }
        if (left != null) {
            p.next = left;
        }
        if (right != null) {
            p.next = right;
        }
        return res.next;


    }


}
