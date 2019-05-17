import java.util.PriorityQueue;

public class KthLargestElementInStream {
    final PriorityQueue<Integer> q;
    final int k;

    public KthLargestElementInStream(int k, int[] a) {
        this.k = k;
        q = new PriorityQueue<>(k);
        for (int n : a)
            add(n);
    }

    public int add(int n) {
        if (q.size() < k)
            q.offer(n);
        else if (q.peek() < n) {
            q.poll();
            q.offer(n);
        }
        return q.peek();
    }

    public static void main(String[] args) {
        int[] a = {4,5,8,2};
        KthLargestElementInStream kthLargest = new KthLargestElementInStream(3,a);
        kthLargest.add(3);   // returns 4
        kthLargest.add(5);   // returns 5
        kthLargest.add(10);  // returns 5
        kthLargest.add(9);   // returns 8
        kthLargest.add(4);   // returns 8
    }
}
