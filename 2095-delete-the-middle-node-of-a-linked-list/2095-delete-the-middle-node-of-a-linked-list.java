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
class Solution {
    public ListNode deleteMiddle(ListNode head) {

        if (head.next == null)
            return null;

        ListNode ans = head;
        
        int size = getSize(head);
        int delPos = size / 2;

        while (delPos-->1)
            head = head.next;

        
        System.out.println(head.val);

        if (head.next != null)
            head.next = head.next.next;
        else 
            head.next = null;

        return ans;
    }
    private static int getSize(ListNode head){

        int length = 0;

        while (head != null){
            head = head.next;
            length++;
        }

        return length; 
    }
}