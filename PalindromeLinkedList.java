public class Solution {

    public boolean isPalindrome(ListNode head) {

        if(head==null||head.next==null)

            return true;

        //fast,slow pointer

        ListNode slow=head;

        ListNode fast=head;

        while(fast!=null&&fast.next!=null)

        {

            fast=fast.next.next;

            slow=slow.next;

        }

        if(fast!=null)

        {//List is unique number

            slow.next=reverseList(slow.next);

            slow=slow.next;

        }

        else{

            slow=reverseList(slow);

            

        }

        while(slow!=null)

        {

            if(head.val!=slow.val)

                return false;

            slow=slow.next;

            head=head.next;

        }

        return true;

        

    }

    public ListNode reverseList(ListNode head)

    {

        ListNode p=head;

        ListNode q=head.next;

        while(q!=null)

        {

            ListNode r=q.next;

            q.next=p;

            p=q;

            q=r;

            

        }

        head.next=null;

        return p;

    }

}
