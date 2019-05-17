public class Rotate2DMatrixBy90 {
    private int[][] rotateBy90(int[][] arr){
        int m = arr.length;
        int n = arr[0].length;
        int[][] rotatedmatrix = new int[n][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                rotatedmatrix[j][m-i-1] = arr[i][j];
            }
        }
        return rotatedmatrix;
    }

    public static void main(String[] args) {
        Rotate2DMatrixBy90 rotate = new Rotate2DMatrixBy90();
        int[][] arr = new int[][]{{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int [][] res;
        res = rotate.rotateBy90(arr);
        for(int[] ans:res){
            for(int i:ans)
            System.out.println(i);
        }
    }
}
