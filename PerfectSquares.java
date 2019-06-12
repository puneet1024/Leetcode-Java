import java.util.Arrays;

public class PerfectSquares {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i=1;i<=n;i++){
            int min = Integer.MAX_VALUE;
            int j=1;
            while(i - j*j >= 0){
                min = Math.min(dp[i-j*j] +1, min);
                j++;
            }
            dp[i] = min;
            System.out.println(dp[i]);
        }
        return dp[n];
    }

    public static void main(String[] args) {
        PerfectSquares ps = new PerfectSquares();
        ps.numSquares(12);
    }
}
