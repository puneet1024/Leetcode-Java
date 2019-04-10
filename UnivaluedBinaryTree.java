import java.util.LinkedList;
import java.util.Queue;

//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//
//    TreeNode(int x) {
//        val = x;
//    }
//}

public class UnivaluedBinaryTree {
    public boolean isUnivalTree(TreeNode root){

        /* DFS
        Check for two conditions recursively on every node:
        if the root is a leaf node, then return true
        if root.left.val == root.val && root.right.val ==root.val
        */
        return ((root.left == null || root.left.val == root.val && isUnivalTree(root.left)) && (root.right==null) || root.right.val == root.val && isUnivalTree(root.right));

    }

    public boolean isUnivalTreeBFS(TreeNode root){

        /* BFS
        Check for two conditions recursively on every node:
        if the root is a leaf node, then return true
        if root.left.val == root.val && root.right.val ==root.val
        */
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty());
        int size = queue.size();
        for (int i = 0; i < size ; i++) {
            TreeNode curr = queue.poll();
            if(curr.val!=root.val)
                return false;
            if(curr.left!=null)
                queue.offer(curr.left);
            if(curr.right!=null)
                queue.offer(curr.right);
        }
        return true;
    }

    public  void main(String[] args) {
        UnivaluedBinaryTree ubt = new UnivaluedBinaryTree();
        UnivaluedBinaryTree ubt2 = new UnivaluedBinaryTree();
        ubt.isUnivalTree(new TreeNode(5));
        ubt.isUnivalTreeBFS(new TreeNode(7));
    }
}
