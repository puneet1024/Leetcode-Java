public class NumberOfIslands {

    private int numIsland(char[][] grid) {
        if(grid==null || grid.length == 0 ){
            return 0;

        }
        int res = 0;
        for (int i = 0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == '1'){
                    res+=helper(grid,i,j);
                }
            }
        }
        return res;
    }
    private int helper(char[][] grid, int i, int j){
            if(i<0 || i >= grid.length || j < 0 || j >=grid[0].length || grid[i][j] == '0'){
                return 0 ;
            }
            grid[i][j] = '0';  ///just like sinking the island
            helper(grid, i+1,j);
            helper(grid, i-1,j);
            helper(grid, i, j-1);
            helper(grid, i, j+1);
            return 1;
    }

    public static void main(String[] args) {
        NumberOfIslands nisland = new NumberOfIslands();
        char [][] arr = new char[][]{{'1','0','0'},{'1','1','0'},{'0','0','1'}};
        System.out.println(nisland.numIsland(arr));
    }
}
