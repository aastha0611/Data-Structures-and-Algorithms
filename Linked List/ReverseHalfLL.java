import java.io.*;
import java.util.*;
/* reversing half list
*/
public class ReverseHalfLL {
  private Node head;
  public static class Node{
    int data;
    Node next;
 
    public Node(int data)
    {
        this.data = data;
        next = null;
    }
  }
  // adding new nodes to last
  public void addLast(Node node) {  
  if (head == null) {  
   head = node;  
  } else {  
   Node temp = head;  
   while (temp.next != null)  
    temp = temp.next;  
  
   temp.next = node;  
  }  
 }  
  //printing list
  public void print(Node node)
  {
    while(node!=null)
    {
      System.out.print(node.data+" ");
      node=node.next;
    }
     System.out.println();
  }
  // checking mid node for lists with odd length
  public void checkMid(){
  Node firstH=head; Node mid=null;
  Node fast = head, slow = head, prev = null;
  System.out.println("Original list");
  print(firstH);
  while (fast != null && fast.next != null) {
    prev = slow;
    slow = slow.next;
    fast = fast.next.next;
  }
    prev.next=null;
    System.out.println("First half of the list");
    print(firstH);
    Node secondH=reverse(slow);
    System.out.println("Second half of the list");
    print(secondH);
    
  }
  
  //reversing second half
  public Node reverse(Node node)
  {
    Node prev=null;
    while(node!=null)
    {Node temp=node.next;
     node.next=prev;
     prev=node;
     node=temp;
    }
    return prev;
  }
 
  public static void main(String[] args) {
        ReverseHalfLL l = new ReverseHalfLL();
        Node head=new Node(5);  
        l.addLast(head);  
        l.addLast(new Node(6));  
        l.addLast(new Node(7));  
        l.addLast(new Node(1));  
        l.addLast(new Node(2));  
        l.checkMid();
  }
}

