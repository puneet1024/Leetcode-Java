//Given a binary tree sum

import java.util.ArrayList;
import java.util.List;


public class PathSumII {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum){
        List<Integer> path = new ArrayList<>();
        isHelper(root,sum,path);
        return result;
    }
    public void isHelper(TreeNode root, int sum, List<Integer> path){
        if(root==null)
            return;
        path.add(root.val);
        if(root.left == null && root.right == null && sum - root.val ==0)
            result.add(path);
        isHelper(root.left,sum-root.val,new ArrayList<>(path));
        isHelper(root.right,sum-root.val,new ArrayList<>(path));
    }

    public static void main(String[] args) {
        PathSumII psum = new PathSumII();
        TreeNode root  = new TreeNode(5);
        root.left = new TreeNode(6);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(20);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(8);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(16);
        System.out.println(psum.pathSum(root,31));
    }
}
