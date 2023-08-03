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
class prob148 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    //bai se duoc chia lam 3 phan:
    //p1: tim diem o giua
    //p2: merge
    //p3: sort

    private ListNode findMidNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow.next;
        slow.next = null;
        return mid;
    }

    private ListNode merge(ListNode left, ListNode right){
        ListNode list3 = new ListNode(0);
        ListNode l3 = list3;
        while (left != null && right != null){
            if (left.val <= right.val){
                l3.next = left;
                left = left.next;
            }
            else{
                l3.next = right;
                right = right.next;
            }
            l3 = l3.next;
        }
        if (left != null){
            l3.next = left;
        }
        if (right != null){
            l3.next = right;
        }
        return list3.next;
    }

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode mid = findMidNode(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        return merge(left, right);
    }
}