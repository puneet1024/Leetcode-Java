//Find the number of subarray whose product is less than K


import java.util.ArrayList;

public class SubArrayProductLessThanK {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int i=0,j=0,count=0;
        int res=1;
        for (i=0;i<nums.length;i++) {
            res = res * nums[i];
            if (res >= k) {
                while(j <= i && res >= k) {
                    res = res/nums[j];
                    j+=1;
                }
            }
            count+=i-j+1;
        }
        return count;
    }

    public static void main(String[] args) {
        SubArrayProductLessThanK sk = new SubArrayProductLessThanK();
        int[] nums = {1,10, 5, 2, 6,1};
        int k = 100;
        System.out.println(sk.numSubarrayProductLessThanK(nums,k));

    }
}
