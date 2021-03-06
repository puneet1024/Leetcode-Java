
public class MergeBinaryTrees {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {

        if(t1 == null && t2 == null)
            return null;
        else if(t1 == null)
            return t2;
        else if(t2 == null)
            return t1;
        else {
            TreeNode node = new TreeNode(t1.val + t2.val);
            System.out.println(node.val);
            node.left= mergeTrees(t1.left,t2.left);
            node.right = mergeTrees(t1.right,t2.right);
            return node;
        }
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(3);
        t1.left.left = new TreeNode(5);
        t1.right = new TreeNode(2);

        TreeNode t2 = new TreeNode(2);
        t2.left = new TreeNode(1);
        t2.left.right = new TreeNode(4);
        t2.right = new TreeNode(3);
        t2.right.right = new TreeNode(7);
        MergeBinaryTrees mbt = new MergeBinaryTrees();
        mbt.mergeTrees(t1,t2);

    }
}
