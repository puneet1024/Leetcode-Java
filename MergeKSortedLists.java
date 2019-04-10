//23. Merge K Sorted Lists

import java.util.PriorityQueue;

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

public class MergeKSortedLists {
    private ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        //Add every node of every list to the minheap(priority queue)
        for(ListNode list:lists){
            while(list!=null){
                pq.add(list.val);
                list = list.next;
            }
        }
        //Create a dummy node to add nodes to the new list
        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;
        while(!pq.isEmpty()){ //keep polling till the pq is empty
            dummy.next = new ListNode(pq.poll());
            dummy = dummy.next;
        }
        return head.next;
    }

    public static void main(String[] args) {
        MergeKSortedLists msk = new MergeKSortedLists();
    }
}
