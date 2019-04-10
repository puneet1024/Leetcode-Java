public class LongestUnivaluePath {
        int len = 0; // global variable
        public int longestUnivaluePath(TreeNode root) {
            if (root == null) return 0;
            len = 0;
            getLen(root, root.val);
            return len;
        }

        private int getLen(TreeNode node, int val) {
            if (node == null) return 0;
            int left = getLen(node.left, node.val);
            int right = getLen(node.right, node.val);
            len = Math.max(len, left + right);
            if (val == node.val)  return Math.max(left, right) + 1;
            return 0;
        }

    public static void main(String[] args) {
        LongestUnivaluePath lup = new LongestUnivaluePath();
        TreeNode root = new TreeNode(5);
        root.right = new TreeNode(5);
        root.right.right = new TreeNode(5);
        root.left = new TreeNode(4);
        root.left.right = new TreeNode(1);
        root.left.left = new TreeNode(1);
        System.out.println(lup.longestUnivaluePath(root));
    }
}
