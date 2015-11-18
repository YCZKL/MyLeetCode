public class Solution {

    public ListNode rotateRight(ListNode head, int k) {

        if(head==null||k==0)

            return head;

        int len=1;

        ListNode p=head;

        while(p.next!=null)

        {

            len++;

            p=p.next;

        }

        k=len-k%len;

        p.next=head;//首尾相连，形成环

        for(int i=0;i<k;i++)

        {

            p=p.next;

        }

        head=p.next;//新的头节点

        p.next=null;//断开环

        return head;

    }

}
