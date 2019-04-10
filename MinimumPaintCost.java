//given a 2d matrix with house and cost to paint them, calculate the min cost to paint all the houses if no two adjacent house has the same color

public class MinimumPaintCost {
    public int miniCostPaintHouse(int[][] costs){
        int cost = 0;
        if(costs == null || costs.length==0)
            return 0;
        int n = costs.length-1;
        for(int i=1;i<costs.length;i++){
            costs[i][0] += Math.min(costs[i-1][1], costs[i-1][2]);
            costs[i][1] += Math.min(costs[i-1][0], costs[i-1][2]);
            costs[i][2] += Math.min(costs[i-1][0], costs[i-1][1]);
        }
        cost = Math.min(Math.min(costs[n][0],costs[n][1]),costs[n][2]);
        return cost;
    }

    public static void main(String[] args) {
        MinimumPaintCost mpc = new MinimumPaintCost();
        int[][] arr = {{17,2,17}, {16,16,5}, {14,3,19}};
        System.out.println(mpc.miniCostPaintHouse(arr));

    }

}
