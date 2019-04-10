public class BestTimeStock {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int diff = 0;
        for(int i=0;i<prices.length;i++){
            min = Math.min(min,prices[i]);
            diff = Math.max(diff,prices[i]-min);
        }
        return diff;
    }

    public static void main(String[] args) {
        BestTimeStock bst = new BestTimeStock();
        int[] a = new int[]{1,2,3,6,8};
        System.out.println(bst.maxProfit(a));
    }
}
