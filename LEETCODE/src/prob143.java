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

// 3 steps:
// 1. xac dinh duoc diem giua cua link list
// 2. dao nguoc nua sau cua linked list
// 3. merge hai linked list lai voi nhau
class Solution {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public void reorderList(ListNode head) {

        //Find middle of list using a slow and fast pointer approach
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        //Reverse the second half of the list using a tmp variable
        ListNode second = slow.next;
        ListNode prev = slow.next = null;
        while (second != null){
            ListNode tmp = second.next;
            second.next = prev;
            prev = second;
            second = tmp;
        }

        //Re-assign the pointers to match the pattern
        ListNode first = head;
        second = prev;
        while (second != null){
            ListNode tmp1 = first.next;
            ListNode tmp2 = second.next;
            first.next = second;
            second.next = tmp1;
            first = tmp1;
            second = tmp2;
        }
    }
}

//CÁCH CỐ ĐẤM ĂN XÔI
// class prob143 {
//     public static class ListNode {
//         int val;
//         ListNode next;
//         ListNode() {}
//         ListNode(int val) { this.val = val; }
//         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//     }
//     public static void reorderList(ListNode head) {
//         if (head == null || head.next == null) {
//             return;
//         }
//         Stack<ListNode> stack = new Stack<>();
//         Queue<ListNode> queue = new LinkedList<>();
//         ListNode newList = new ListNode();
//         ListNode temp = newList;
//         ListNode temp_node = head;
//         while (temp_node != null){
//             temp.next = new ListNode(temp_node.val);
//             temp = temp.next;
//             temp_node = temp_node.next;
//         }
//         ListNode temp2 = newList;
//         while (temp2.next != null){
//             stack.push(temp2.next);
//             queue.offer(temp2.next);
//             temp2 = temp2.next;
//         }
//         queue.poll();
//         ListNode currentNode = head;
//         while (currentNode.next != null && !stack.isEmpty()){
//             currentNode.next.val = stack.pop().val;
//             currentNode = currentNode.next;
//             if(currentNode.next != null){
//                 currentNode.next.val = queue.poll().val;
//                 currentNode = currentNode.next;
//             }
//         }
//     }
// }