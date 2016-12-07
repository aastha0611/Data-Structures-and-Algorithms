/*Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.
You should preserve the original relative order of the nodes in each of the two partitions.
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head==null)
            return null;
        ListNode beforeStart=null;
        ListNode beforeEnd=null;
        ListNode afterStart=null;
        ListNode afterEnd=null;
        
        while(head!=null){
            ListNode node=head;
            head=head.next;
            node.next=null;
            
            if(node.val<x)
            {
                if(beforeStart==null)
                {
                    beforeStart=node;
                    beforeEnd=beforeStart;
                }
                else
                {
                    beforeEnd.next=node;
                    beforeEnd=node;
                }
            }
            else{
                if(afterStart==null)
                {
                    afterStart=node;
                    afterEnd=afterStart;
                }
                else
                {
                    afterEnd.next=node;
                    afterEnd=node;
                }
            }
        }
        if(beforeStart==null)
            return afterStart;
        beforeEnd.next=afterStart;
        return beforeStart;
    }
}