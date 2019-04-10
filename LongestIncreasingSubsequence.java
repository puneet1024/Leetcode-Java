import java.util.Arrays;

public class LongestIncreasingSubsequence {
    private int longestsubsequence(int[] nums){
        /*Initially, we will have an array of same length as the input having the value as 1,
        as 1 is the maximum length in worst case(all are decreasing)

        */
        int[] dp = new int[nums.length];
        Arrays.fill(dp,1);

        /*We will keep one variable to keep track of the maximum value so far and therefore the maximum value of subsequence
         */
        int maxSoFar = 1;


        for(int i=0; i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i] > nums[j])
                    dp[i] = Math.max(dp[i],dp[j]+1);
            }
            maxSoFar = Math.max(dp[i],maxSoFar);
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();
        int[] nums = {10,9,2,5,3,7,101,18};
        System.out.println(lis.longestsubsequence(nums));
    }
}
