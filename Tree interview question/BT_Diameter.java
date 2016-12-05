import java.io.*;
import java.util.*;
/*The diameter of a tree (sometimes called the width) is the number of nodes on the longest path between two leaves in the tree
*/
public class BT_Diameter{
 public static class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
      this.data=data;
    }  
  }
  public int height(Node root){
    if(root==null)
      return 0;
    int left=1+height(root.left);
    int right=1+height(root.right);

    return Math.max(left,right);
    
  }
  public int diameter(Node root){
    if(root==null)
      return 0;
    int left=diameter(root.left);
    int right=diameter(root.right);
    int h=height(root.left)+height(root.right);
    return Math.max(Math.max(left,right), h+1);
    
    
  }
  public static void main(String[] args) {
    Node root=new Node(8);
    Node n5=new Node(5);
    Node n12=new Node(12);
    Node n11=new Node(11);
    Node n9=new Node(9);
    Node n10=new Node(10);
    root.left=n5;
    root.right=n12;
    n12.left=n11;
    n11.left=n9;
    n11.right=n10;
    BT_Diameter sol=new BT_Diameter();
    int d=sol.diameter(root);
    System.out.println("Diameter: "+ (d));
  }
}
