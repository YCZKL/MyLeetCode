/**

 * Definition for singly-linked list.

 * struct ListNode {

 *     int val;

 *     ListNode *next;

 *     ListNode(int x) : val(x), next(NULL) {}

 * };

 */

class Solution {

public:

    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {

    if(headA==NULL || headB==NULL)

        return NULL;

        int lena=1;

        ListNode* a=headA;

        while(a!=NULL)

        {

            lena++;

            a=a->next;

        }

        int lenb=1;

        ListNode * b=headB;

        while(b!=NULL)

        {

            lenb++;

            b=b->next;

        }

        

                int diff=lena-lenb;

                if(diff>0)

                {

                    while(diff)

                    {

                        headA=headA->next;

                        diff--;

                    }

                }

                else

                {

                    while(diff)

                    {

                        headB=headB->next;

                        diff++;

                    }

                }

                while(headA&&headB&&headA!=headB)

                {

                    

                            headA=headA->next;

                            headB=headB->next;

                        

                }

                return (headA==headB)?headA:NULL;

            

        

        

    }

};
