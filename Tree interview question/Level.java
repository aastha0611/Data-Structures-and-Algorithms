import java.io.*;
import java.util.*;

public class Level {
  public static class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
      this.data=data;
    }  
  }
  public void levelOrder(Node node){
    Queue<Node> q=new LinkedList<Node>();
    q.offer(node);
    while(!q.isEmpty()){
      Node n=q.poll();
      System.out.print(n.data+" ");
      if(n.left!=null)
        q.offer(n.left);
      if(n.right!=null)
        q.offer(n.right);
        
    }
  }
  
  public static void main(String[] args) {
    Node root=new Node(8);
    Node n5=new Node(5);
    Node n12=new Node(12);
    Node n11=new Node(11);
    Node n9=new Node(9);
    Node n10=new Node(10);
    Node n14=new Node(14);
    root.left=n5;
    root.right=n12;
    n12.left=n11;
    n12.right=n14;
    n11.left=n9;
    n11.right=n10;
    Level s=new Level();
    s.levelOrder(root);
    
  }
}
