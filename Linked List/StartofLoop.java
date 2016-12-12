/*Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
*/
public class StartofLoop {
 //Definition for singly-linked list.
 private static class ListNode {
   int val;
   ListNode next;
   ListNode(int x) {
     val = x;
     next = null;
   }
 }

    public ListNode detectCycle(ListNode head) {
        if(head==null)
            return null;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
            }
        }
        if(fast==null || fast.next==null)
            return null;
        slow=head;
        while(slow!=fast)
        {
            slow=slow.next;
            fast=fast.next;
        }
        return fast;
        
    }
    public static void main(String[] args)
    {
      StartofLoop sol=new StartofLoop();
      
      ListNode head=new ListNode(6);
      ListNode n7=new ListNode(7);
      ListNode n8=new ListNode(8);
      ListNode n9=new ListNode(9);
      ListNode n1=new ListNode(1);
      head.next=n7;
      n7.next=n8;
      n8.next=n9;
      n9.next=n1;
      n1.next=n8;
      
      System.out.print("Node where the cycle begins is:"+ sol.detectCycle(head).val);
      
    }
}