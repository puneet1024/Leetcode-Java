import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Output the number of substring with K-1 distinct characters

//This is an n^2 solution though
public class SubstringDistinct {
    private List<String> disSubsK(String s, int k){
        Map<Character,Integer> hash = new HashMap<>();
        List<String> res = new ArrayList<>();
        for(int i=0;i<s.length()-k;i++) {
            String sstr = s.substring(i,i+k);
            int dupcount = 0;
            hash.clear();
            for(char ch:sstr.toCharArray()){
                hash.put(ch, hash.getOrDefault(ch,0) + 1);
                if(hash.get(ch) > 1 )
                    dupcount ++;
            }
            if(dupcount == 1){
                res.add(sstr);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        SubstringDistinct sd = new SubstringDistinct();
        System.out.println(sd.disSubsK("awaglk",4));
    }
}
