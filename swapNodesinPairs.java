public class Solution {

    public ListNode swapPairs(ListNode head) {

        if(head==null||head.next==null)

            return head;

        ListNode newhead=new ListNode(-1);

        newhead.next=head;

        ListNode p1=newhead;

        ListNode p2=head;

        while(p2!=null&&p2.next!=null)

        {

            ListNode nextStart=p2.next.next;

            p2.next.next=p2;

            p1.next=p2.next;

            p2.next=nextStart;

            p1=p2;

            p2=p2.next;

        }

        return newhead.next;

    }

}
