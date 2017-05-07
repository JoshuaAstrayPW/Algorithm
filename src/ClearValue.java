/**
 * Created by fangxu on 2017/5/7.
 * 现在有一个单链表。链表中每个节点保存一个整数，再给定一个值val，把所有等于val的节点删掉。
 * <p>
 * 给定一个单链表的头结点head，同时给定一个值val，请返回清除后的链表的头结点，保证链表中有不等于该值的其它值。请保证其他元素的相对顺序。
 * <p>
 * 测试样例：
 * {1,2,3,4,3,2,1},2
 * {1,3,4,3,1}
 */
public class ClearValue {
    public ListNode clear(ListNode head, int val) {
       ListNode cu = head;
       ListNode pre = cu;
       if(cu.val == val){
           head = head.next;
           cu = head;
           pre = cu;
       }
       while (cu.next != null){
           cu = cu.next;
           if(cu.val == val){
               if(cu.next == null){
                   pre.next = null;
               }
               else {
                   pre.next = cu.next;
                   cu = pre;
               }

           }
           pre = cu;
       }
       return head;
    }
}