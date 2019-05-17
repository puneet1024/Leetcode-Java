//Leetcode 938. Range Sum of BST

public class RangeSumOfBST {
    int sum=0;
    public int rangeSumBST(TreeNode root, int L, int R) {
        if(root == null)
            return 0;
        if(root.val >= L && root.val <= R){
            sum+=root.val;
        }
        rangeSumBST(root.left,L,R);
        rangeSumBST(root.right,L,R);
        return sum;

    }

    public static void main(String[] args) {
        RangeSumOfBST rbst = new RangeSumOfBST();
    }
}
