import java.io.*;
import java.util.*;
//Given a node, can you find the next highest node in O(log(n))
public class  NextHighest{
  public static class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
      this.data=data;
    }  
  }
  public Node next(Node node){
    if(node.right==null)
      return null;
    Node temp=node.right;
    while(temp.left!=null)
      temp=temp.left;
    return temp;
  }
  public static void main(String[] args) {
    Node root=new Node(8);
    Node n5=new Node(5);
    Node n12=new Node(12);
    Node n11=new Node(11);
    Node n9=new Node(9);
    Node n10=new Node(10);
    root.left=n5;
    root.right=n12;
    n12.left=n11;
    n11.left=n9;
    n11.right=n10;
    Solution sol=new Solution();
    Node x=sol.next(root);
    System.out.println("The next highest node is "+x.data);
    
   
  }
}
