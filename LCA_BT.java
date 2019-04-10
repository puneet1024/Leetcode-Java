public class LCA_BT {
    private TreeNode lca_BT(TreeNode root, TreeNode p, TreeNode q){
        if(root == null)
            return null;
        if(root.val == p.val || root.val == q.val)
            return root;
        TreeNode left = lca_BT(root.left,p,q);
        TreeNode right = lca_BT(root.right,p,q);

        if(left!=null && right!=null)
            return root;

        if(left == null)
            return right;
        else
            return left;
    }

    public static void main(String[] args) {
        LCA_BT lca = new LCA_BT();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(10);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(8);
        root.left.right = new TreeNode(12);
        root.right.left = new TreeNode(22);
        root.right.right = new TreeNode(9);
        TreeNode ans = lca.lca_BT(root,root.left,root.left.right);
        System.out.println(ans.val);
    }
}
