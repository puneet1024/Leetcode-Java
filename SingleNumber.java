//given a non-empty array of integers, every element occurs twice except for one, return that one in O(n) time complexity


public class SingleNumber {
    public int singleNumber(int[] nums) {
        int num=0;
        for(int i=0;i<nums.length;i++) {
            num = num ^ nums[i];
        }
        return num;
    }

    public static void main(String[] args) {
        SingleNumber sn = new SingleNumber();
        int[] nums = new int[]{1,3,4,5,1,3,4};
        System.out.println(sn.singleNumber(nums));
    }
}
