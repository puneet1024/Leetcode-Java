public class RotateArray {
    public void rotate(int[] nums, int k) {
        int j=k;
        int i=0;
        int m = k+1;
        int n = nums.length-1;
        while(j>=i){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            j--;
            i++;
        }
        System.out.println(i);

        while(m<n){
            int temp = nums[m];
            nums[m] = nums[n];
            nums[n] = temp;
            n--;
            m++;
        }
        i=0;
        j=nums.length-1;
        while(j>=i){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            j--;
            i++;
        }
        for(int l=0;l<nums.length;l++){
            System.out.print(nums[l]);
        }
    }

    public static void main(String[] args) {
        RotateArray rt = new RotateArray();
        int[] nums = new int[] {1,2,3,4,5,6,7};
        rt.rotate(nums,3);
    }
}
