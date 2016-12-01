import java.io.*;
import java.util.*;
/* Iterative Preorder Traversal
*/
public class IterativePreOrder {

  public static class Node{
    int data;
    Node left, right;
 
    public Node(int data)
    {
        this.data = data;
        left = right = null;
    }
  }
  public void iterativePre(Node root){
    Stack<Node> s=new Stack<Node>();
    s.push(root);
    while(!s.isEmpty())
    {
      Node n=s.pop();
      
      if(n.right!=null)
        s.push(n.right);
      if(n.left!=null)
        s.push(n.left);
      System.out.print(n.data+" ");
    }
  }
 
  public static void main(String[] args) {
        IterativePreOrder pre = new IterativePreOrder();
        Node root = new Node(7);
        root.left = new Node(2);
        root.right = new Node(8);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        pre.iterativePre(root);
  }
}