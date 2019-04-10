import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> hash = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        int l1 = nums1.length;
        int l2 = nums2.length;
        for(int num:nums1){
            hash.put(num, hash.getOrDefault(num,0)+1);
        }
        for(int num2:nums2){
            if(hash.containsKey(num2)){
                result.add(num2);
                hash.put(num2,hash.get(num2)-1);
                if(hash.get(num2) == 0)
                    hash.remove(num2);
            }
        }
        int n = result.size();
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            res[i] = result.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        IntersectionArraysII ins = new IntersectionArraysII();
        int[] nums1 = new int[] {1,2,2,1};
        int[] nums2 = new int[] {2,2};
        ins.intersect(nums1,nums2);
    }
}
