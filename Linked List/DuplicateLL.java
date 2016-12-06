import java.io.*;
import java.util.*;

class DuplicateLL {
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
  
// This function will find the duplicare 
 public Node find()  
 {  
 Node current=head;
   while(current!=null)
   {Node runner=current.next;
     while(runner!=null)
     {
       if(current.value==runner.value)
         return runner;
       else
         runner=runner.next;
     }
    current=current.next;
   }
   return null;
  
 }  
  
 public static void main(String[] args) {  
  DuplicateLL list = new DuplicateLL();  
  // Creating a linked list  
  Node head=new Node(5);  
  list.addLast(head);  
  list.addLast(new Node(6));  
  list.addLast(new Node(8));  
  list.addLast(new Node(5));  
  list.addLast(new Node(12));  
   
  list.printList();  
  // finding middle element  
  Node dup= list.find();  
  System.out.println("Middle node will be: "+ dup.value);  
  
 }  
  
}