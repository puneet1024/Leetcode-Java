//807.
public class MaxHeightIncreaseToKeepSkyline {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n = grid.length;
        int[] row = new int[n];  //saare rows ka max track karne k liye
        int[] col = new int[n];  // saare cols ka max track akrne k liye
        int sum = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                //har row ka maximum nikalenge
                row[i] = Math.max(row[i],grid[i][j]);
                //har col ka maximum nikalenge
                col[j] = Math.max(col[j],grid[i][j]);
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sum+= Math.min(row[i],col[j]) - grid[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        MaxHeightIncreaseToKeepSkyline msk = new MaxHeightIncreaseToKeepSkyline();
        int[][] a = {{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}};
        System.out.println(msk.maxIncreaseKeepingSkyline(a));
    }
}
