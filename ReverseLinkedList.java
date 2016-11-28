public class ReverseLinkedList{  
  
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
  
  
 public void print(Node head) {  
  Node temp = head;  
  while (temp != null) {  
   System.out.format("%d ", temp.value);  
   temp = temp.next;  
  }  
  System.out.println();  
 }  
  
 // Reverse Linked List  
public static Node reverse(Node currentNode)  
 {  
Node previousNode=null;  
  Node nextNode;  
  while(currentNode!=null)  
  {  
   nextNode=currentNode.next;  
  // reversing the link  
   currentNode.next=previousNode;  
  // moving currentNode and previousNode by 1 node  
   previousNode=currentNode;  
   currentNode=nextNode;  
  }  
  return previousNode;  
 }  
  
 public static void main(String[] args) {  
  ReverseLinkedList l = new ReverseLinkedList();  
  // Creating a linked list  
  Node head=new Node(5);  
  l.addLast(head);  
  l.addLast(new Node(6));  
  l.addLast(new Node(7));  
  l.addLast(new Node(1));  
  l.addLast(new Node(2));  
   
  l.print(head);  
  
  Node reverseHead=reverse(head);  
  System.out.println("After reversing");  
  l.print(reverseHead);  
   
 }  
  
}  