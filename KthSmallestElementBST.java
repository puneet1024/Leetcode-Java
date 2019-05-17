//230. Find the Kth smallest element in a BST

//Doing preorder DFS - traverse left recursively, when you are at root, decrement the counter, check if the counter value is 0(i.e. found the element), we return
//the number, otherwise, traverse the right.
public class KthSmallestElementBST {
    private int count =0;
    private int number = 0;
    private int kthSmallest(TreeNode root, int k) {
        count = k;
        helper(root);
        return number;
    }
    private void helper(TreeNode root){
        if(root.left!=null)
            helper(root.left);
        count--;
        if(count == 0){
            number = root.val;
            return;
        }
        if(root.right!=null)
            helper(root.right);
    }

    public static void main(String[] args) {
        KthSmallestElementBST ksmall = new KthSmallestElementBST();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.left.right = new TreeNode(2);
        root.right = new TreeNode(4);
        System.out.println(ksmall.kthSmallest(root,2));
    }
}
