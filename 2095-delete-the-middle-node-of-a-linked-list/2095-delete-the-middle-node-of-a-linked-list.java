class Solution {
    public ListNode deleteMiddle(ListNode head) {

        if (head.next == null)
            return null;

        ListNode ans = head;

        int len = getSize(head);
        int delNodes = len / 2;

        while (delNodes-->1)
            head = head.next;

        if (head.next != null){
            head.next = head.next.next;
        }
        else {
            head.next = null;
        }

        return ans;
    }

    private static int getSize(ListNode head){

        int len = 0;

        while (head != null){
            len++;
            head = head.next;
        }
        return len;
    }
}