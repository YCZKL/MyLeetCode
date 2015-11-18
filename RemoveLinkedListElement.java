/**

 * Definition for singly-linked list.

 * public class ListNode {

 *     int val;

 *     ListNode next;

 *     ListNode(int x) { val = x; }

 * }

 */

public class Solution {

    public ListNode removeElements(ListNode head, int val) {

        ListNode preNode = null;

        ListNode curNode = head;

        ListNode temp = head;

        

        while(curNode != null){

        	if(curNode.val == val){

        		if(preNode!=null){

        			preNode.next = curNode.next;

        			curNode = curNode.next;

        		}else{

        			curNode = curNode.next;

        			temp = curNode;

        		}

        	}else{

        		preNode = curNode;

        		curNode = curNode.next;

        	}

        }

        

        return temp;



    }

}
