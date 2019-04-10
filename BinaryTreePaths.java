import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    List<String> results = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        if(root == null){
            return results;
        }
        treePaths(root,"");
        return results;
    }
    private void treePaths(TreeNode root, String path) {
        if(root.left==null && root.right ==null){
            results.add(path + root.val+ "");
            return;
        }
        if(root.left!=null){
            treePaths(root.left,path + root.val + "->");
        }
        if(root.right!=null){
            treePaths(root.right,path + root.val + "->");
        }
    }

    public static void main(String[] args) {
        BinaryTreePaths btp = new BinaryTreePaths();
        System.out.println(btp.binaryTreePaths(new TreeNode(5)));
    }
}
