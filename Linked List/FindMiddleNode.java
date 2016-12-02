import java.io.*;
import java.util.*;
/*Find middle element of a linked list in java
*/
public class FindMiddleNode{  
  
 private Node head;  
  
 private static class Node {  
  private int value;  
  private Node next;  
  
  Node(int value) {  
   this.value = value;  
  
  }  
 }  
  
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
  
  
 public void printList() {  
  Node temp = head;  
  while (temp != null) {  
   System.out.format("%d ", temp.value);  
   temp = temp.next;  
  }  
  System.out.println();  
 }  
  
// This function will find middle element in linkedlist  
 public Node find(Node head)  
 {  
 Node slowPointer, fastPointer;   
  slowPointer = fastPointer = head;   
  
  while(fastPointer !=null && fastPointer.next != null) {   
     
    slowPointer = slowPointer.next;   
    fastPointer = fastPointer.next.next;   
  }   
  
  return slowPointer;   
  
 }  
  
 public static void main(String[] args) {  
  FindMiddleNode list = new FindMiddleNode();  
  // Creating a linked list  
  Node head=new Node(5);  
  list.addLast(head);  
  list.addLast(new Node(6));  
  list.addLast(new Node(8));  
  list.addLast(new Node(9));  
  list.addLast(new Node(12));  
   
  list.printList();  
  // finding middle element  
  Node mid= list.find(head);  
  System.out.println("Middle node will be: "+ mid.value);  
  
 }  
  
}
