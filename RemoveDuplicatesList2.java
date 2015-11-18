/**

 * Definition for singly-linked list.

 * public class ListNode {

 *     int val;

 *     ListNode next;

 *     ListNode(int x) { val = x; }

 * }

 */

public class Solution {

    public ListNode deleteDuplicates(ListNode head) {

        if(head==null||head.next==null)

            return head;

        ListNode newHead=new ListNode(-1);

        newHead.next=head;

        ListNode p1=newHead;

        ListNode p2=head;

        while(p2!=null)

        {

            boolean b=false;

            while(p2.next!=null&&p2.next.val==p2.val)

            {

                b=true;

                p2=p2.next;

            }

            if(b)

            {

                p2=p2.next;

                continue;

            }

            p1.next=p2;

            p1=p1.next;

            p2=p2.next;

        }

        p1.next=p2;

        return newHead.next;

    }

}
