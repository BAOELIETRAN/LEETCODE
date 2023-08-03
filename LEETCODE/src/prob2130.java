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
class prob2130 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    int res = 0;
    public int pairSum(ListNode head) {
        //xac dinh vi tri cua node giua
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        //dao nguoc lai nua sau cua linked list
        ListNode second = slow.next;
        ListNode prev = slow.next = null;
        while (second != null){
            ListNode tmp = second.next;
            second.next = prev;
            prev = second;
            second = tmp;
        }

        //tinh tong max
        ListNode first = head;
        second = prev;
        while (second != null){
            int value = first.val + second.val;
            res = Math.max(value, res);
            first = first.next;
            second = second.next;
        }

        return res;
    }
}