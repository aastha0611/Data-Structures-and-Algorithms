import java.io.*;
import java.util.*;
/* Given a binary tree, return true if it is binary search tree else return false.
*/
public class IsBST {

  public static class Node{
    int data;
    Node left, right;
 
    public Node(int data)
    {
        this.data = data;
        left = right = null;
    }
  }
  public boolean isValidBST(Node root){
    return valid(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
  }
  private boolean valid(Node root, int min, int max){
    if(root == null) return true;
    if(root.data<=min || root.data>max)
      return false;
    return valid(root.left, min, root.data) && valid(root.right, root.data, max);
  }

  public static void main(String[] args) {
        IsBST tree = new IsBST();
        Node root = new Node(7);
        root.left = new Node(2);
        root.right = new Node(8);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
 
        if (tree.isValidBST(root))
            System.out.println("IS BST");
        else
            System.out.println("Not a BST");
  }
}

