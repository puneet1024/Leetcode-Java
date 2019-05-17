import java.util.*;


//1019 - Next Greater Node in Linked List


public class NextGreaterNodeInLinkedList {
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
        int[] res = new int[list.size()];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<list.size();i++){
            while(!st.isEmpty() && list.get(st.peek()) < list.get(i)){
                res[st.pop()] = list.get(i);
            }
            st.push(i);
        }
        return res;
    }

    public static void main(String[] args) {
        NextGreaterNodeInLinkedList ngll = new NextGreaterNodeInLinkedList();
    }
}
