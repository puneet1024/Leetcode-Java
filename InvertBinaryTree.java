import com.sun.source.tree.Tree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {

        if (root == null) {
            return null;
        }
//  ONE WAY
//        final TreeNode left = root.left,
//                right = root.right;
//        root.left = invertTree(right);
//        root.right = invertTree(left);
//        return root;

        //ANOTHER WAY

        //swap one element
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        //recurse it on every element
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    public static void main(String[] args) {
        InvertBinaryTree ibt = new InvertBinaryTree();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(6);
        root.left.left = new TreeNode(7);
        root.left.right = new TreeNode(8);
        root.right = new TreeNode(1);
        root.right.left = new TreeNode(2);
        root.right.right = new TreeNode(3);

        System.out.println(ibt.invertTree(root));
    }
}
