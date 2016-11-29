public class DoublyLL {
  Node head, tail;
private static class Node 
{
    int data;
    Node next=null, prev=null;
    Node(int data) 
    {
        this.data = data;
    }
}
public void insertFirst(Node node)
{
    if(head!=null)
    {
      node.next=head;
      head.prev=node;
    }
  head=node;
    if(tail==null)
    {
      tail=node;
    }
      
}    

public void insertLast(Node node)
{
    if(tail!=null)
    {
      node.prev=tail;
      tail.next=node;
    }
  tail=node;
    if(head==null)
    {
      head=node;
    }
      
}    

public void printH()
{
  Node temp=head;
  while(temp!=null)
  {
    System.out.print(temp.data+" ");
    temp=temp.next;
  }
  System.out.println();
}
public void printT()
{
  Node temp=tail;
  while(temp!=null)
  {
    System.out.print(temp.data+" ");
    temp=temp.prev;
  }
  System.out.println();
}
  
public void delete(int x)
{
  Node temp=head;
  while(temp!=null)
  {
    if(temp.data==x)
    { 
      temp.next.prev=temp.prev;
      temp.prev.next=temp.next;
      temp=temp.next;
    }
    else
      temp=temp.next;
  }
}


    public static void main(String args[]) 
    {
       DoublyLL sol=new DoublyLL();
         
        Node head = new Node(1);
        sol.insertLast(head);
        sol.insertLast(new Node(2));
        sol.insertLast(new Node(3));
        sol.insertLast(new Node(4));
        sol.insertLast(new Node(5));
        sol.insertLast(new Node(6));
        System.out.println("Iterating from the head:");
        sol.printH();
        System.out.println("Iterating from the tail:");
        sol.printT();
        System.out.println("Deleting node 4");
        sol.delete(4);
        System.out.println("After deletion:");
        sol.printH();
    }

}
