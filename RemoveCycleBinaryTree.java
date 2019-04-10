import java.util.HashSet;

public class RemoveCycleBinaryTree {
    private void removeCycle(TreeNode root) {
        HashSet<Integer> hash = new HashSet<>();
        helper(root,hash);
    }
    private void helper(TreeNode root, HashSet<Integer> hash) {
        if (root==null)
            return;
        hash.add(root.val);

        if(root.left!=null && hash.contains(root.left.val)) {
            root.left = null;
        }
        else if(root.right!=null && hash.contains(root.right.val)) {
            root.right = null;
        }
        else{
            helper(root.left, hash);
            helper(root.right, hash);
        }
    }

    public static void main(String[] args) {
        RemoveCycleBinaryTree rcbt = new RemoveCycleBinaryTree();
        TreeNode root  = new TreeNode(5);
        root.left = new TreeNode(6);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(20);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(8);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(16);
        rcbt.removeCycle(root);
    }
}
