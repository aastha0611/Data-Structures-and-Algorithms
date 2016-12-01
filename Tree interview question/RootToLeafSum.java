import java.io.*;
import java.util.*;
/* Given a binary tree and a sum, find if there is a path from root to leaf
 * which sums to this sum.
*/
public class RootToLeafSum {
  public static class Node{
    int data;
    Node left, right;
 
    public Node(int data)
    {
        this.data = data;
        left = right = null;
    }
  }
  
 public boolean sumPath(Node root, int sum, List<Integer> res){
    if(root==null)
      return false;
    if(root.left==null && root.right==null)
    {
      if(sum==root.data)
      {
        res.add(root.data);
        return true;
      }
      return false;
    }
   if(sumPath(root.left, sum-root.data, res))
   {
     res.add(root.data);
     return true;
   }
   if(sumPath(root.right, sum-root.data, res))
   {
     res.add(root.data);
     return true;
   }
   return false;
 }

  public static void main(String[] args) {
        RootToLeafSum tree = new RootToLeafSum();
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        List<Integer> res=new ArrayList<Integer>();
        if(tree.sumPath(root,7,res))
           System.out.println("path:"+res);
        else
           System.out.println("No path for the given sum");
        
  }
}

