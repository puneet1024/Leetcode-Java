import java.util.PriorityQueue;

public class LargestSumAfterKNegations {
    private int largestSumnegation(int[] arr, int k){
        int sum=0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i:arr)
            pq.add(i);
        while(k>0){
            pq.add(-pq.poll());
            k--;
        }
        for(int i=0;i<arr.length;i++){
            sum+=pq.poll();
        }
        return sum;
    }

    public static void main(String[] args) {
        LargestSumAfterKNegations lsk = new LargestSumAfterKNegations();
        int[] arr = {4,2,5};
        System.out.println(lsk.largestSumnegation(arr,1));
    }
}
