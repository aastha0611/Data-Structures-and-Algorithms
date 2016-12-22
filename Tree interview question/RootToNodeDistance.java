public class RootToNodeDistance{
  //Find The Distance From Root To Given Node of a Binary Tree.
  public int Pathlength(Node root, int n1) {
      if(root==null)
        return 0;
      int x=0;
      if ((root.data == n1) || (x = Pathlength(root.left, n1)) > 0
          || (x = Pathlength(root.right, n1)) > 0) {
        x=x+ 1;

      }
      return x;
  }

  public static void main(String[] args) throws java.lang.Exception {
    Node root = new Node(5);
    root.left = new Node(10);
    root.right = new Node(15);
    root.left.left = new Node(20);
    root.left.right = new Node(25);
    root.right.left = new Node(30);
    root.right.right = new Node(35);
    root.left.right.right = new Node(45);
    RootToNodeDistance i = new RootToNodeDistance();
    System.out.println("Distance from root to 45 is : "
        + (i.Pathlength(root, 45)-1));
  }
}
class Node {
  int data;
  Node left;
  Node right;

  public Node(int data) {
    this.data = data;
    this.left = null;
    this.right = null;
  }
}
