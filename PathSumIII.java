
public class PathSumIII {
    private int res=0;
    private int pathSum(TreeNode root, int sum) {
        if(root == null)
            return 0;
        helper(root,sum);
        pathSum(root.left,sum);
        pathSum(root.right,sum);
        return res;
    }
    private void helper(TreeNode root, int target){
        if(root == null)
            return;
        if(target-root.val == 0)
            res++;
        helper(root.left,target - root.val);
        helper(root.right,target - root.val);
    }

    public static void main(String[] args) {
        PathSumIII ps3 = new PathSumIII();
        System.out.println(ps3.pathSum(new TreeNode(5),5));

    }
}
