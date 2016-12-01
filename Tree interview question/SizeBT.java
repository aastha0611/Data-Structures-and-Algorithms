public class SizeBT {
// Find Size of tree
   public static class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
      this.data=data;
    }  
  }
  public int treeSize(Node root){
    if(root==null)
      return 0;
    int leftS=treeSize(root.left);
    int rightS=treeSize(root.right);
    return 1+leftS+rightS;
    
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
    SizeBT sol=new SizeBT();
    int size=sol.treeSize(root);
    System.out.println("Size: "+ (size));
  }
}
