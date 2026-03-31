class Solution {
    public ListNode mergeNodes(ListNode head) {

        ListNode pointer1 = head;
        int sum = 0;
        ListNode ans = head;
        head = head.next;


        while (head != null){

            if (head.val == 0){
                pointer1.val = sum;
                sum = 0;
                if (head.next != null)
                    pointer1 = pointer1.next;
            }
            sum = sum + head.val;
            head = head.next;
        }
        pointer1.next = null;

        return ans;
        
    }
}