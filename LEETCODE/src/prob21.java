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
class prob21 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list3 = new ListNode(0);
        ListNode l3 = list3;
        while (list1 != null && list2 != null){
            if (list1.val < list2.val){
                l3.next = list1;
                list1 = list1.next;
            }
            else{
                l3.next = list2;
                list2 = list2.next;
            }
            l3 = l3.next;
        }
        if (list1 != null){
            l3.next = list1;
        }
        if (list2 != null){
            l3.next = list2;
        }
        return list3.next;
    }
}