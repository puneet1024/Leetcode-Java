import java.util.*;

public class VerticalOrderTraversal {
    class Node {
        // horizontal distance and treeNode
        int hd;
        TreeNode root;
        public Node(int hd,TreeNode root) {
            this.hd = hd;
            this.root = root;
        }
    }
    public List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null)
            return res;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        Map<Integer,List<Integer>> map = new HashMap<>();   // keep hd as keys and List as values
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(0,root));
        while(!q.isEmpty()) {
            Node curr = q.poll();
            // System.out.println(curr.hd);
            min = Math.min(min,curr.hd);
            max = Math.max(max,curr.hd);
            if (map.containsKey(curr.hd)) {
                map.get(curr.hd).add(curr.root.val);
            } else {
                map.put(curr.hd, new ArrayList<>());
                map.get(curr.hd).add(curr.root.val);
            }
            if (curr.root.left != null) {
                q.offer(new Node(curr.hd-1,curr.root.left));
            }
            if (curr.root.right != null) {
                q.offer(new Node(curr.hd+1,curr.root.right));
            }
        }
        // System.out.println("map " + map);
        for(int i=min;i<=max;i++) {
            res.add(map.get(i));
        }
        return res;
    }
}
