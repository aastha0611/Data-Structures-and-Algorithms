import java.io.*;
import java.util.*;
/*Given a binary tree, find its minimum depth.
*/
public class MinDepth{  
  
public static class Node{
    int data;
    Node left, right;
 
    public Node(int data)
    {
        this.data = data;
        left = right = null;
    }
  }
  
 public int findMinDepth(Node root){
   LinkedList<Node> list=new LinkedList<Node>();
   LinkedList<Integer> count=new LinkedList<Integer>();
   list.add(root);
   count.add(1);
   while(list!=null)
   { Node n=list.remove();
     int c=count.remove();
     if(n.left==null && n.right==null)
       return c;
    if(n.left!=null)
    {
      list.add(n.left);
      count.add(c+1);
    }
    if(n.right!=null)
    {
      list.add(n.right);
      count.add(c+1);
    }
     
   }
   return 0; 

 }
  public static void main(String[] args) {
        MinDepth tree = new MinDepth();
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        
        System.out.println("Minimum depth:"+ tree.findMinDepth(root));
        
  }
  
}
