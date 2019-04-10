//112. Given a binary tree and a sum, check if the root to leaf sum of any path of the binary tree equals the given sum

public class PathSum {
    private boolean pathSum(TreeNode root, int sum){
        return helper(root,sum);
    }
    private boolean helper(TreeNode root, int sum){
        if(root == null)
            return false;
        else if(root.left == null && root.right == null && sum-root.val==0) //check if leaf node and if the sum-value of leaf node is equal to 0
            return true;
        else
            //check the left node and the right node recursively
            return helper(root.left,sum-root.val) || helper(root.right,sum-root.val);
    }

    public static void main(String[] args) {
        PathSum ps = new PathSum();
        TreeNode root  = new TreeNode(5);
        root.left = new TreeNode(6);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(20);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(8);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(16);
        System.out.println(ps.pathSum(root,36));
    }
}
