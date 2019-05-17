import java.util.LinkedList;
import java.util.Queue;
//116
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val,Node _left,Node _right,Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
public class PopulatingNextRightPointersEachNode {
    public Node connect(Node root) {
        if(root == null)
            return null;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            Node prev = null;
            Node curr = null;
            int size = queue.size();
            for(int i=0;i<size;i++){
                curr = queue.poll();
                if(prev!=null)
                    prev.next = curr;
                if(curr.left!=null)
                    queue.offer(curr.left);
                if(curr.right!=null)
                    queue.offer(curr.right);
                prev = curr;
            }
            curr.next = null;
        }
        return root;
    }
}
