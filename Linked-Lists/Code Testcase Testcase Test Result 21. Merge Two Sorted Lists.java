class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = null;
        if (list1.val < list2.val)
            head = list1;
        else
            head = list2;
        ListNode t = list1;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                list1.next = list2;
                t = list2;
                list1 = list1.next;
            } else {
                list2.next = list1;
                t = list1;
                list2 = list2.next;
            }
        }
        if (list2 == null) {
            t.next = list1;
        } else {
            t.next = list2;
        }
        return head ;
    }
}
