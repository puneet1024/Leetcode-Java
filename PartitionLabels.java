//763. Partition Labels :

//CAUTION: Not complete

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {
    public List<Integer> partitionLabels(String S) {
        ArrayList<Integer> ans = new ArrayList<>();
        int[] res = new int[26];
        int start = 0, end = S.length()-1;
        while(end > 0){
            if(res[S.charAt(end) - 'a'] == 0){
                res[S.charAt(end) - 'a'] = end;
            }
            end--;
        }
        int maxlen=S.length();
        while(start < S.length()){
            while(start < res[S.charAt(start) - 'a']) {
                int len = res[S.charAt(start) - 'a'] - start;
                maxlen = Math.min(maxlen, len);
                start ++;
            }
            ans.add(maxlen);
            maxlen = S.length();
            start++;
        }
        return ans;
    }

    public static void main(String[] args) {
        PartitionLabels plabels = new PartitionLabels();
        List<Integer> res  = plabels.partitionLabels("ababcbacadefegdehijhklij");
    }
}
