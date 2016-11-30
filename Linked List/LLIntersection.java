import java.io.*;
import java.util.*;

//Program to get the intersection point of two Linked Lists
public class LLIntersection {
  private Node head1, head2;
  public static class Node{
    int data;
    Node next;
    Node(int data){
      this.data=data;
      next=null;
    }  
  }
  //find length of the linked list
  public int length(Node node){
    int len=0;
    while(node!=null){
      len++;
      node=node.next;
    }
    return len;
  }
  
  public Node moveforward(Node node, int diff){
    int c=0;
    while (c<diff && node.next!=null){
    node=node.next;
    c++;
    }
    return node;
  }
  
  public int checkIntersection(Node l1, Node l2){
   
    int len1=length(l1);
    int len2=length(l2);
    if(len1>len2)
      l1=moveforward(l1, len1-len2);
    else
      l2=moveforward(l2, len2-len1);
    while(l1.data!=l2.data){
      l1=l1.next;
      l2=l2.next;
    }
      return l1.data; 
  }
  
  public static void main(String[] args) {
    LLIntersection sol=new LLIntersection();
    Node head1 = new Node(3);
    head1.next = new Node(6);
    head1.next.next = new Node(15);
    head1.next.next.next = new Node(15);
    head1.next.next.next.next = new Node(30);
 
        // creating second linked list
    Node head2 = new Node(10);
    head2.next = new Node(15);
    head2.next.next = new Node(30);
    int x=sol.checkIntersection(head1, head2);
    System.out.println(x); 
  }
}
