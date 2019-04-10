//70. Calculate the distinct ways you can climb the stairs to reach a given point n, if you can either climb 1 or 2 steps
public class ClimbingStairs {
    private int stairs(int num){
        int[] dp = new int[num+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2;i<=num;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[num];
    }

    public static void main(String[] args) {
        ClimbingStairs cs = new ClimbingStairs();
        System.out.println(cs.stairs(5));
    }
}
