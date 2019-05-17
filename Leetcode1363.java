public class Leetcode1363 {
    public int maxSumAfterPartitioning(int[] A, int K) {
        int left = 0, right = 0;
        int sum=0;
        while(right < A.length){
            int count = 0;
            int max = Integer.MIN_VALUE;
            while(right < A.length && count < K) {
                max = Math.max(A[right], max);
                right++;
                count++;
                System.out.println("max "  + max);
            }
            for(int i=left;i<right;i++){
                A[i] = max;
                System.out.println(A[i]);
            }

            sum +=max*K;
            left++;
        }
        return sum;
    }

    public static void main(String[] args) {
        Leetcode1363 ls = new Leetcode1363();
        ls.maxSumAfterPartitioning(new int[]{1,15,7,9,2,5,10}, 3);
    }
}
