import java.util.List;

/**
 * Created by fangxu on 2017/5/7.
 * 有一个整数val，如何在节点值有序的环形链表中插入一个节点值为val的节点，并且保证这个环形单链表依然有序。
 * <p>
 * 给定链表的信息，及元素的值A及对应的nxt指向的元素编号同时给定val，请构造出这个环形链表，并插入该值。
 * <p>
 * 测试样例：
 * [1,3,4,5,7],[1,2,3,4,0],2
 * 返回：{1,2,3,4,5,7}
 */
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class InsertValue {
    public ListNode insert(int[] A, int[] nxt, int val) {
        // write code here
        if(A.length == 0) {
            ListNode k = new ListNode(val);
            return k;
        }
        ListNode head = new ListNode(A[0]);
        ListNode p = head;
        //build listnode
        for(int i = 0; i < A.length - 1; i++){
            ListNode c = new ListNode(A[nxt[i]]);
            p.next = c;
            p = c;
        }
        p = head;
        ListNode n = p.next;
        if(head.val >= val){
            ListNode q = new ListNode(val);
            q.next = head;
            return q;
        }
        while (n != null && val > n.val){
            p = p.next;
            n = n.next;
        }
        ListNode in = new ListNode(val);
        p.next = in;
        in.next = n;
        return head;

    }
}