/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class SerializeAndDeserialize {
    
    
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        StringBuilder sb =new StringBuilder();
        q.offer(root); 
        while(!q.isEmpty())
        {
            TreeNode n=q.poll();
            if(n!=null){
                sb.append(String.valueOf(n.val)+',');
                q.offer(n.left);
                q.offer(n.right);
            }
            else
                sb.append("#,");
        }
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data==null || data.length()==0)
            return null;
        String[] ch=data.split(",");
        TreeNode root;
        if(!ch[0].equals("#"))
            root=new TreeNode(Integer.parseInt(ch[0]));
        else
            return null;
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.offer(root);
        int i=1;
        while(!q.isEmpty()){
            TreeNode node=q.poll();
            if(!ch[i].equals("#"))
            {
                node.left=new TreeNode(Integer.parseInt(ch[i]));
                q.offer(node.left);
            }
            else{
                node.left=null;
            }
            i++;
            if(!ch[i].equals("#"))
            {
                node.right=new TreeNode(Integer.parseInt(ch[i]));
                q.offer(node.right);
            }
            else{
                node.right=null;
            }
            i++;
            
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// SerializeAndDeserialize codec = new SerializeAndDeserialize();
// codec.deserialize(codec.serialize(root));