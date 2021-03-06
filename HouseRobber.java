public class HouseRobber {
    public int rob(int[] arr) {
        if (arr == null || arr.length == 0)
            return 0;
//        if (arr.length == 1)
////            return arr[0];
////        if (arr.length == 2)
////            return Math.max(arr[0], arr[1]);
////        int[] dp = new int[arr.length];
////        dp[0] = arr[0];
////        dp[1] = Math.max(arr[0], arr[1]);
////        for (int i = 2; i < arr.length; i++) {
////            dp[i] = Math.max(dp[i - 2] + arr[i], dp[i - 1]);
////        }
////        return  dp[dp.length - 1];

        int a = 0; // f(i-2)
        int b=0; // f(i-1)
        for (int i=0;i<arr.length;i++){
            b = Math.max(a+arr[i],b);
            a = b;
        }
        return a;
    }

    public static void main(String[] args) {
        HouseRobber hr=new HouseRobber();
        int[] ap = new int[]{1,2,3,8};
        System.out.println(hr.rob(ap));
    }
}
