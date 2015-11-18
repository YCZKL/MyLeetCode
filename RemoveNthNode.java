/**

 * Definition for singly-linked list.

 * public class ListNode {

 *     int val;

 *     ListNode next;

 *     ListNode(int x) { val = x; }

 * }

 */

public class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head == null ) return head;  

        if(head.next == null) return head.next;  

              

        ListNode slow = head;  

        ListNode fast=head;  

          

        //keep distance of slow and fast node in n  

        while(n>0){  

            fast = fast.next;  

            n--;  

        }  

        //check for case of removing beginning node of head  

        if(fast==null) return head.next;  

        //locate slow node prior of removing node  

        while (fast.next != null) {  

            slow = slow.next;  

            fast = fast.next;  

        }  

        slow.next=slow.next.next;  

        return head;  



    }

}
