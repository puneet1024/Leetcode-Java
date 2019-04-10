//given two binary tree, check if they are same or not
public class SameTree {
    public boolean checkTree(TreeNode root1,TreeNode root2){
        return isHelper(root1,root2);
    }

    private boolean isHelper(TreeNode root1, TreeNode root2){
        if(root1==null && root2==null)
            return true;
        else if(root1 == null || root2 == null)
            return false;
        else if(root1.val != root2.val)
                return false;
        else
            return isHelper(root1.left,root2.left) && isHelper(root1.right,root2.right);
    }

    public static void main(String[] args) {
        SameTree st = new SameTree();

        System.out.println(st.checkTree(new TreeNode(3),new TreeNode(3)));
    }
}
