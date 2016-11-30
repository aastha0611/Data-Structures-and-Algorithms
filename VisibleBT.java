import java.io.*;
import java.util.*;
/* In a binary tree, if in the path from the root to the node A, there is no
 * node with value greater than A's value, then A is a visible node. We need 
 * to count the number of visible nodes in a binary tree.
 */
public class VisibleBT {
  public static class Node{
    int data;
    Node left, right;
 
    public Node(int data)
    {
        this.data = data;
        left = right = null;
    }
  }
  public int isVisible(Node root){
    return helper(root, Integer.MIN_VALUE);
  }
  private int helper(Node root, int max){
    if(root == null) return 0;
    int num=0;
    if(root.data> max)
    {
      num=1;
      max=root.data;
    }
    return num+ helper(root.left,max)+ helper(root.right, max);
  }

  public static void main(String[] args) {
        VisibleBT s=new VisibleBT();
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(10);
        root.left.right = new Node(7);
        int n=s.isVisible(root);
        System.out.println(n);
       
  }

}
