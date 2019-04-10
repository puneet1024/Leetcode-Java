import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

//class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;
//    TreeNode(int x) { val = x; }
//}

public class Maximum_Binary_Tree {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        Deque<TreeNode> stack =  new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            TreeNode current = new TreeNode(nums[i]);
            while(!stack.isEmpty() && stack.peek().val< current.val){
                current.left = stack.pop();
            }
            if(!stack.isEmpty()){
                stack.peek().right = current;
            }
            stack.push(current);
        }

        return stack.isEmpty() ? null:stack.removeLast();
    }

//    public TreeNode constructMaximumBinaryTree(int[] nums) {
//        if(nums == null)
//            return null;
//        return helper(nums,0,nums.length-1);
//    }
//
//    private TreeNode helper(int[] nums, int start, int end) {
//        if(start > end)
//            return null;
//        if(start == end)
//            return new TreeNode(nums[start]);
//        int maxid = -1;
//        int max = 0;
//        for (int i=start;i<=end;i++){
//            if(nums[i] > max) {
//                maxid = i;
//                max = nums[i];
//            }
//        }
//        TreeNode root = new TreeNode(max);
//        root.left = helper(nums,0,maxid-1);
//        root.right = helper(nums, maxid+1,nums.length-1);
//        return root;
//    }

    public static void main(String[] args) {
        Maximum_Binary_Tree mbt = new Maximum_Binary_Tree();
        int[] max = new int[]{3,2,1,6,0,5};
        System.out.println(mbt.constructMaximumBinaryTree(max).val);
    }

}
