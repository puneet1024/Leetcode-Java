//check if the difference between the heights of the children of each node is
//O(N) time and O(H) space


public class BalancedBinaryTree {
    public int checkHeight(TreeNode root) {
        if (root == null)
            return -1;
        int left = checkHeight(root.left);      //calculating the left height of a node
        if (left == Integer.MIN_VALUE)
            return Integer.MIN_VALUE;

        int right = checkHeight(root.right);   //calculating the right height of a node
        if (right == Integer.MIN_VALUE)
            return Integer.MIN_VALUE;

        int height = left - right;    //if diff > 1, then not heightBalanced
        if(Math.abs(height) > 1)
            return Integer.MIN_VALUE;
        else
            return Math.max(left,right) + 1; // 1 for the root
    }

    public boolean isBalanced(TreeNode root){
        return (checkHeight(root) != Integer.MIN_VALUE);
    }

    public static void main(String[] args) {
        BalancedBinaryTree bbt = new BalancedBinaryTree();
        bbt.isBalanced(new TreeNode(4));
    }

}
