public class Solution {

    public ListNode reverseKGroup(ListNode head, int k) {

        if(head==null||head.next==null||k<2)

            return head;

        ListNode next_group=head;

        int cnt=0;

        for(int i=0;i<k;i++)

        {

            if(next_group!=null)

            {

                next_group=next_group.next;

                cnt++;

            }

        }

        if(cnt==k) 

        {

            ListNode cur=reverseKGroup(next_group,k);

            while(0<=--cnt)

            {

                ListNode tmp=head.next;

                head.next=cur;

                cur=head;

                head=tmp;

            }

            head=cur;

        }

        return head;

    }

}
