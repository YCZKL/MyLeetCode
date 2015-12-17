c class Solution {

    public ListNode insertionSortList(ListNode head) {

        if(head==null||head.next==null)

            return head;

        ListNode newhead=new ListNode(0);

        newhead.next=head;

        ListNode p=head.next;

        head.next=null;

        while(p!=null)

        {

            ListNode cur=p;

            p=p.next;

            ListNode node=newhead.next;

            ListNode pre=newhead;

            while(true)

            {

                if(cur.val<node.val)

                {

                    pre.next=cur;

                    cur.next=node;

                    break;

                }

                else{

                    pre=node;

                    node=node.next;

                }

                if(node==null)

                {

                    pre.next=cur;

                    cur.next=null;

                    break;

                }

            }

            

        }

        return newhead.next;

    }

}
