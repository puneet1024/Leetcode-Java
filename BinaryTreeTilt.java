public class BinaryTreeTilt {

    //to return the tilt of binary tree
    int result = 0;


    public int findTilt(TreeNode root) {
        helper(root);
        return result;
    }
    private int helper(TreeNode root){
        if(root==null)
            return 0;

        //find the left and right
        int left = helper(root.left);
        int right = helper(root.right);

        //keep adding the difference of the left and right subtree
        result+= Math.abs(left-right);

        //return the tilt of the subtree
        return left + right + root.val;
    }

    public static void main(String[] args) {
        BinaryTreeTilt btt = new BinaryTreeTilt();
        btt.findTilt(new TreeNode(5));
    }
}
