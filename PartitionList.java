public class Solution {

    public ListNode partition(ListNode head, int x) {

        ListNode newHeadLeft=new ListNode(-1);

        ListNode newHeadRight=new ListNode(-1);

        ListNode left=newHeadLeft;

        ListNode right=newHeadRight;

        for(ListNode cur=head;cur!=null;cur=cur.next)

        {

            if(cur.val<x)

            {

                left.next=cur;

                left=cur;

            }else{

                right.next=cur;

                right=cur;

            }

        }

        left.next=newHeadRight.next;

        right.next=null;

        return newHeadLeft.next;

    }

}
