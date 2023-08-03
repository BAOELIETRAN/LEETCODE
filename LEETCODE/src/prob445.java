import java.util.Stack;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class prob445 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        while (l1 != null){
            stack1.push(l1.val);
            l1 = l1.next;
        }
        while (l2 != null){
            stack2.push(l2.val);
            l2 = l2.next;
        }
        int sum = 0;
        int carry = 0;
        ListNode ans = null;
        ListNode newNode;
        while (!stack1.isEmpty() || !stack2.isEmpty()){
            if (!stack1.isEmpty()){
                sum += stack1.pop();
            }
            if (!stack2.isEmpty()){
                sum += stack2.pop();
            }
            sum += carry;
            carry = sum / 10;
            newNode = new ListNode(sum%10);
            newNode.next = ans;
            ans = newNode;
            sum = 0;
        }
        if (carry != 0){
            newNode = new ListNode(carry);
            newNode.next = ans;
            ans = newNode;
        }
        return ans;
    }
}