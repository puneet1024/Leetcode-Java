public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int i=0;
        int j=0;
        while(i<nums.length){
            int temp = 0;
            if(nums[i]!=0){
                temp = nums[i];
                nums[i] = 0;
                nums[j] = temp;
                j++;
            }
            i++;
        }
    }
}
