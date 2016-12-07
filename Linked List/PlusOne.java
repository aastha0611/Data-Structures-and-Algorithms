/*Given a non-negative number represented as a singly linked list of digits, plus one to the number.
Input:
1->2->3

Output:
1->2->4
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
    public ListNode plusOne(ListNode head) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode temp=head;
        ListNode lastnotnine= dummy;
        while(temp!=null)
        {
            if(temp.val!=9)
                lastnotnine=temp;
            temp=temp.next;
        }
        lastnotnine.val++;
        temp=lastnotnine.next;
        while(temp!=null)
        {
            temp.val=0;
            temp=temp.next;
        }
        return (dummy.val==0)? dummy.next : dummy;
    }
}