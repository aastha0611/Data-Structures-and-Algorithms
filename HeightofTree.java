public class HeightofTree {
  
  public static class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
      this.data=data;
    }  
  }
  public int treeHeight(Node root){
    if(root==null)
      return 0;
    int leftH=treeHeight(root.left);
    int rightH=treeHeight(root.right);
    return (leftH>rightH)? 1+leftH : 1+rightH;
    
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
    HeightofTree sol=new HeightofTree();
    int height=sol.treeHeight(root);
    System.out.println("Height: "+ (height-1));
  }
}
