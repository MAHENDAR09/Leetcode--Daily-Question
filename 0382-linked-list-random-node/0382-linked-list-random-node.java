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

    private static HashMap<Integer,Integer> nodes  = new HashMap<>();
    private static int len = 0;

    private static void computeMap(ListNode head){

        int idx = 0;

        while (head != null){
            nodes.put(idx++,head.val);
            head = head.next;
        }
    }

    public Solution(ListNode head) {
        nodes.clear();
        computeMap(head);
        this.len = nodes.size();
    }
    
    public int getRandom() {
        int key = (int) (Math.random() * len);
        System.out.println(key+"  "+nodes);
        return nodes.get(key);
    }
}

