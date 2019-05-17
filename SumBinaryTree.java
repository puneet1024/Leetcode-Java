//1022
public class SumBinaryTree {
    public int sumRootToLeaf(TreeNode root) {
        int sum = 0;
         sum =  helper(root,sum);
         return sum;

    }
    private int helper(TreeNode root, int sum) {
        if (root == null)
            return 0;
        sum = sum*2 + root.val;
        if (root.left == null && root.right == null)
            return sum;
        return helper(root.left,sum) + helper(root.right,sum);
    }

    public static void main(String[] args) {
        SumBinaryTree sbt = new SumBinaryTree();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(1);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(1);
        System.out.println(sbt.sumRootToLeaf(root));
    }
}
