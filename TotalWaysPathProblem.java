//Find the number of ways from the top left of the matrix to the bottom right

//DP solution

import java.util.Arrays;

public class TotalWaysPathProblem {
    private int numPaths2D(int[][] matrix) {
        int[][] res = new int[matrix.length][matrix[0].length];
        for(int m = 0;m<matrix[0].length;m++){
            res[0][m] = 1;
        }
        for(int n=0;n<matrix.length;n++){
            res[n][0] = 1;
        }
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                res[i][j] = res[i-1][j] + res[i][j-1];
            }
        }
        return res[res.length-1][res[0].length-1];
    }

    public static void main(String[] args) {
        TotalWaysPathProblem twpp = new TotalWaysPathProblem();
        int[][] r = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int ans = twpp.numPaths2D(r);
        System.out.println(ans);
    }
}
