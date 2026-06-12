class Solution {

     //  make duplicate list reverse 
     ListNode reverse(ListNode head)
     {
        ListNode pre = null;
        while(head != null)
        {   ListNode post = head.next;
            head.next = pre;
            pre = head;
            head = post;
        }
        return pre;
     }    
    public boolean isPalindrome(ListNode head) {
        // // first method
        // ListNode newhead = new ListNode(head.val);
        // ListNode currnew = newhead;
        // ListNode currold = head.next;
        // // make a duplicate list 
        // while(currold != null)
        // {
        // currnew.next = new ListNode(currold.val);
        // currnew = currnew.next;
        // currold = currold.next;
        // }

        // //  make duplicate list reverse 
        // ListNode pre = null;
        // ListNode current = head;
        // while(current != null)
        // {   ListNode post = current.next;
        //     current.next = pre;
        //     pre = current;
        //     current = post;
        // }

        // // check the list is palindrome
        // ListNode tempO = pre;
        // ListNode tempN = newhead;
        // while(tempO != null)
        // {
        //     if(tempO.val != tempN.val)  return false;
        //     tempO = tempO.next;
        //     tempN = tempN.next;
        // }
        // return true;

        // //  second mmethod 
        if (head == null || head.next == null) return true;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode midnext = reverse(slow.next);
        // slow.next = midnext;
        ListNode t1 = head;
        ListNode t2 = midnext;
        while(t2!= null)
        {
            if(t1.val != t2.val) return false;
            t1 = t1.next;
            t2 = t2.next;
        }
        return true;
    }

}
