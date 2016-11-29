import java.io.*;
import java.util.*;

public class BinaryTree {
  public static class Node{
    int val;
    Node left, right;
 
    public Node(int item)
    {
        val = item;
        left = right = null;
    }
  }
  public boolean isValidBST(Node root){
    return valid(root, null, null);
  }
  private boolean valid(Node root, Integer low, Integer high){
    if(root == null) return true;
      return (low == null || root.val > low) && (high == null || root.val < high) 
      && valid(root.left, low, root.val) && valid(root.right, root.val, high);
  }

  public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
 
        if (tree.isValidBST(root))
            System.out.println("IS BST");
        else
            System.out.println("Not a BST");
  }
}
