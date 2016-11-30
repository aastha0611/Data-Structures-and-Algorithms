import java.io.*;
import java.util.*;

public class IterativeHeight {

//Iterative method to find height of Binary Tree
private static class Node 
{
    int data;
    Node left, right;
  
    Node(int item) 
    {
        data = item;
        left = right;
    }
}
  
    Node root;
    
public int treeHeight(Node node){
        // Base Case
        if (node == null)
            return 0;
  
        // Create an empty queue for level order tarversal
        Queue<Node> q = new LinkedList<Node>();
  
        // Enqueue Root and initialize height
        q.add(node);
        int height = 0;
  
        while (!q.isEmpty()) 
        {
          int size=q.size();
          height++;
          for(int i=0;i<size;i++){
            Node n=q.poll();
            if(n.left!=null)
              q.offer(n.left);
            if(n.right!=null)
              q.offer(n.right);
          }
            
            }
      return height;
        }
    
    public static void main(String args[]) 
    {
       IterativeHeight sol=new IterativeHeight();
         
        //create a binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.println("Height of tree is " + sol.treeHeight(root));
    }

}
