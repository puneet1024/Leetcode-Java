/**
 * 74.
 *
 * Input:
 * matrix = [
 *   [1,   3,  5,  7],
 *   [10, 11, 16, 20],
 *   [23, 30, 34, 50]
 * ]
 * target = 3
 * Output: true
 *
 * Intuition - The matrix can be converted to a singly sorted list
 * [1,2,3,5,7,10,11,16,20,23,30,34,50]
 * Every element in the matrix can be mapped to the one in array with  ---  i * col_num + j
 * Therefore, every element in the array can be mapped in the matrix with  ---- i = mid/n  && j = mid%n
 *
 */
public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0)
            return false;
        int m = matrix.length;
        int n = matrix[0].length;

        int start = 0,end = m*n-1;

        while(start <= end){
            int mid = (start + end) / 2;
            int value = matrix[mid/n][mid%n];
            if(value == target)
                return true;
            if(target < value)
                end = mid-1;
            else
                start = mid+1;
        }
        return false;
    }

    public static void main(String[] args) {
        Search2DMatrix sdm = new Search2DMatrix();
    }
}
