//find the K closest point to origin

import java.util.Comparator;
import java.util.PriorityQueue;

public class KClosestPointtoOrigin {
    public int[][] kClosest(int[][] points, int K){
        if(K == 0 || points == null || K > points.length || points.length == 0)
            return null;
        int [][] ans = new int[K][2];
        PriorityQueue<int[]> pq = new PriorityQueue<>(K, new Comparator<int []>(){
            public int compare(int[] o1,int[] o2){
                return (o1[0]*o1[0] + o1[1]*o1[1]) - (o2[0]*o2[0] + o2[1]*o2[1]);
            }
        });

        for(int[] i:points){
            pq.add(i);
        }

        for(int j=0;j<K;j++){
            ans[j] = pq.poll();
        }
        return ans;
    }

    public static void main(String[] args) {
        KClosestPointtoOrigin kcc = new KClosestPointtoOrigin();
        int[][] a = {{1,3},{-2,2}};
        int[][] results = kcc.kClosest(a,1);
        for(int[] k:results){
            for(int i:k)
                System.out.println(i);
        }
    }
}
