public class SquaresSortedArray {
    private int[] squareSorted(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        int i=0,j=n-1,k=n-1;
        while(i<=j){
            if(arr[i]*arr[i] > arr[j]*arr[j]){
                res[k] = arr[i]*arr[i];
                i++;
                k--;
            }else {
                res[k] = arr[j]*arr[j];
                j--;
                k--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        SquaresSortedArray ssa = new SquaresSortedArray();
        int[] res = {-4,-1,0,3,10};
        int[] ans = new int[5];
        ans = ssa.squareSorted(res);
        for(int a:ans)
            System.out.println(a);
    }
}
