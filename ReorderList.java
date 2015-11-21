public class Solution {

    public void reorderList(ListNode head) {

        if(head==null||head.next==null)

            return;

         // find the second half head    

        ListNode fast = head.next;    

        ListNode slow = head;    

        while (fast != null && fast.next != null) {    

            fast = fast.next.next;    

            slow = slow.next;    

        }    

    

        // reverse the second half    

        ListNode p = slow.next;    

        slow.next = null; // cut the first half    

        ListNode pPre = null;    

        ListNode pSuf = p.next;    

        while (p != null) {    

            pSuf = p.next;    

            p.next = pPre;    

            pPre = p;    

            p = pSuf;    

        }    

    

        // combine two halves    

        ListNode l1 = head;    

        ListNode l2 = pPre;    

        while (l1 != null && l2 != null) {    

            ListNode l1Next=l1.next;

            ListNode l2Next=l2.next;

            l1.next = l2;    

            l2.next = l1Next;    

            l1 = l1Next;    

            l2 = l2Next;    

        }    

    }    

}    


