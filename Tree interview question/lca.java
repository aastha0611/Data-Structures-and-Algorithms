/**
 * Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class lca {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root.val> Math.max(p.val, q.val))
            return lowestCommonAncestor(root.left, p,q);
        if(root.val<Math.min(p.val, q.val))
            return lowestCommonAncestor(root.right, p,q);
         return root;
        
    }
}