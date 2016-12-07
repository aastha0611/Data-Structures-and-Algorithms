/**Given a singly linked list, group all odd nodes together followed by the even nodes. Please note here we are talking about the node number and not the value in the nodes.

You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.
*/


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class OddEvenLL {
    public ListNode oddEvenList(ListNode head) {
        if(head==null)
            return null;
        ListNode evenStart=null;
        ListNode evenEnd=null;
        ListNode oddStart=null;
        ListNode oddEnd=null;
        int k=1;
        while(head!=null)
        {   ListNode node=head;
            head=head.next;
            node.next=null;
            if(k%2==1){
                if(oddStart==null)
                {
                    oddStart=node;
                    oddEnd=oddStart;
                    k++;
                }
                else
                {
                    oddEnd.next=node;
                    oddEnd=node;
                    k++;
                }
            }
            else{
                if(evenStart==null)
                {
                    evenStart=node;
                    evenEnd=evenStart;
                    k++;
                }
                else
                {
                    evenEnd.next=node;
                    evenEnd=node;
                    k++;
                }
            }
        }
        if(oddStart==null)
            return evenStart;
        oddEnd.next=evenStart;
        return oddStart;
        
    }
}