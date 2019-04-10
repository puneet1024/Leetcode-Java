import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    private int[] twoSum(int[] arr, int target){
        if(arr == null || arr.length==0)
            return null;
        int[] ans = new int[2];
        Map<Integer,Integer> hash = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hash.containsKey(target - arr[i])){
                ans[0] = hash.get(target - arr[i]);
                ans[1] = i;
            }else {
                hash.put(arr[i],i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] res = ts.twoSum(nums,target);
        for(int i:res)
            System.out.println(i);
    }
}
