import java.io.*;
import java.util.*;
public class LevelMaxSum{
//Level that has the maximum sum  
private static class Node 
{
    int data;
    Node left, right;
  
    Node(int item) 
    {
        data = item;
    }
}
  
    Node root;
    
public int maxSum(Node root){
        // Base Case
        if (root == null)
            return 0;
  
        // Create an empty queue for level order tarversal 
        Queue<Node> q = new LinkedList<Node>();
        q.offer(root);
        int max_sum=0;
        while(!q.isEmpty()){
          int size=q.size();
          int sum=0;
          for(int i=0; i<size;i++){
            Node n=q.poll();
            sum=sum+n.data;
            
            if(n.left!=null)
              q.offer(n.left);
            if(n.right!=null)
              q.offer(n.right);
          }
          if(max_sum<=sum)
              max_sum=sum;
            }
      return max_sum;
        }
    
    public static void main(String args[]) 
    {
       LevelMaxSum sol=new LevelMaxSum();
         
        //create a binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.println("Maximum sum is " + sol.maxSum(root));
    }
}
