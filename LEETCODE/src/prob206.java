import java.util.Stack;

class prob206 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        while (head != null){
            stack.add(head);
            head = head.next;
        }
        if (stack.isEmpty()){
            return null;
        }
        ListNode newNode = new ListNode(stack.pop().val);
        ListNode currentNode = newNode;
        while (!stack.isEmpty()){
            currentNode.next = new ListNode(stack.pop().val);
            currentNode = currentNode.next;
        }
        currentNode.next = null;
        return newNode;
    }
}