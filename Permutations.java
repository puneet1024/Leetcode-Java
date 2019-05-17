import java.util.*;
public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ls = new ArrayList<>();
        helper(nums,ls,new ArrayList<>());
        return ls;
    }
    private void helper(int[] nums, List<List<Integer>> ls, List<Integer> arr) {
        if(arr.size() == nums.length){
            ls.add(new ArrayList<>(arr));
            return;
        }
        for(int i=0;i<nums.length;i++) {
            if(arr.contains(nums[i]))
                continue;
            arr.add(nums[i]);
            helper(nums,ls,arr);
            arr.remove(arr.size()-1);
        }
    }

    public static void main(String[] args) {
        Permutations pm = new Permutations();
        List<List<Integer>> res = pm.permute(new int[]{1,2,3});
        for(List<Integer> ls:res)
            for(int i:ls)
                System.out.print(i);
            System.out.println();

    }
}
