import java.util.Stack;

/**
 *请编写一个函数，检查链表是否为回文。
 给定一个链表ListNode* pHead，请返回一个bool，代表链表是否为回文。
 测试样例：
 {1,2,3,2,1}
 返回：true
 {1,2,3,2,3}
 返回：false
 */
public class Palindrome {
    public boolean isPalindrome(ListNode pHead) {
        Stack<ListNode> stack = new Stack<>();
        ListNode fast = pHead;
        ListNode slow = pHead;
        while(fast != null && fast.next != null){
            stack.push(slow);
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast != null)
            slow = slow.next;
        while (slow != null){
            if(slow.val != stack.pop().val)
                return false;
            slow = slow.next;

        }
        return true;

    }

}
