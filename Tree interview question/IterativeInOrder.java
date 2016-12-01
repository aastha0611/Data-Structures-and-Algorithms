import java.io.*;
import java.util.*;

public class IterativeInOrder {
  
/* Iterative Inorder Traversal
*/
  public static class Node{
    int data;
    Node left, right;
 
    public Node(int data)
    {
        this.data = data;
        left = right = null;
    }
  }
  public void iterativeIn(Node root){
    Stack<Node> s=new Stack<Node>();
    Node currentNode=root;
    boolean b=false;
    while(!b)
    {
      if(currentNode!=null)
      { s.push(currentNode);
        currentNode=currentNode.left;   
      }
      else{
        if(s.isEmpty())
          b=true;
        else
        {
          currentNode=s.pop();
          System.out.print(currentNode.data+" ");
         currentNode=currentNode.right;
        }
      } 
    }
  }
 
  public static void main(String[] args) {
        IterativeInOrder in = new IterativeInOrder();
        Node root = new Node(7);
        root.left = new Node(2);
        root.right = new Node(8);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        in.iterativeIn(root);
  }
}
