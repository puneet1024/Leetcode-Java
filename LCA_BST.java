//25. Given a BST and two values, find the LCA of them.


public class LCA_BST {
    private TreeNode lcaBST(TreeNode root, TreeNode val1, TreeNode val2) {
        if(root == null )
            return null;
        if(root.val < val1.val && root.val < val2.val)
            return lcaBST(root.right,val1,val2);
        else if(root.val > val1.val && root.val > val2.val)
            return lcaBST(root.left,val1,val2);
        else
            return root;
    }

    public static void main(String[] args) {
        LCA_BST lca = new LCA_BST();
        TreeNode root = new TreeNode(20);
        root.left = new TreeNode(10);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(8);
        root.left.right = new TreeNode(12);
        root.right.left = new TreeNode(22);
        root.right.right = new TreeNode(32);
        TreeNode result = lca.lcaBST(root,root.left.left,root.right.left);
        System.out.println(result.val);

    }
}
