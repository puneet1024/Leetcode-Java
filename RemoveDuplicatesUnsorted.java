import java.util.*;
public class RemoveDuplicatesUnsorted {
    private static int[] remDup(int[] arr) {
        HashMap<Integer,Boolean> hash = new HashMap<>();
        for(int ele:arr) {
            hash.put(ele,false);
        }
        int[] res = new int[hash.size()];
        int j=0;
        for(int ele:arr) {
            if(!hash.get(ele)) {
                res[j] = ele;
                j++;
            }
            hash.put(ele,true);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] dup = {1,2,5,1,7,2,4,2};
        int[] res = RemoveDuplicatesUnsorted.remDup(dup);
        for(int ele:res)
            System.out.println(ele);
    }
}