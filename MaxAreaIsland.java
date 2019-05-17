public class MaxAreaIsland {

    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        int m = grid.length;
        int n = grid[0].length;
        if(grid == null || grid.length == 0)
            return 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 1){
                    max = Math.max(max, dfsHelper(grid,i,j));
                }
            }
        }
        return max;
    }
    private int dfsHelper(int[][] grid, int i, int j){
        if(i<0 || i>=grid.length  || j<0 || j>=grid[0].length || grid[i][j] == 0){
            return 0;
        }

        int count = 1;
        grid[i][j] = 0;
        count+=dfsHelper(grid,i-1,j);
        count+=dfsHelper(grid,i+1,j);
        count+=dfsHelper(grid,i,j-1);
        count+=dfsHelper(grid,i,j+1);
        return count;
    }

    public static void main(String[] args) {

    }
}
