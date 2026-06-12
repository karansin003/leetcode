class Solution {
    public ListNode reverseList(ListNode head) {
        // // throw recursion method 
        // if(head == null || head.next == null) return head;
        // ListNode newhead = reverseList(head.next);
        // head.next.next = head;
        // head.next = null;
        // return newhead;
        ListNode curr = head;
        ListNode pre = null;
        while(curr!= null){
            ListNode post = curr.next;
            curr.next = pre;
            pre = curr;
            curr= post;
        }
        return pre;
    }
}
