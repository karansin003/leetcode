class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;
       
        ListNode t = head;
        int size = 0;
        while(t!= null)
        {
            size++;
            t =t.next;
        }
        k = k % size;
        for (int i = 0; i < k; i++) {
        ListNode slow = null;
        ListNode fast = head;
            while (fast.next != null) {
                slow = fast;
                fast = fast.next;
            }
            slow.next = null;
            fast.next = head;
            head = fast;
        }
        return head;
    }
}
