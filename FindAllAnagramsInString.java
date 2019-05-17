import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllAnagramsInString {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        Map<Character,Integer> map = new HashMap<>();
        for(char ch:p.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0) +1);
        }
        int right = 0;
        int count = map.size();
        int left = 0;
        while(right < s.length()) {
            char ch =s.charAt(right);
            if(map.containsKey(ch)) {
                map.put(ch, map.getOrDefault(ch, 0) - 1);
                if (map.get(ch) == 0)
                    count--;
            }
            right++;

            while(count == 0) {
                char tempc = s.charAt(left);
                if (map.containsKey(tempc)) {
                    map.put(tempc, map.get(tempc) + 1);
                    if (map.get(tempc) > 0)
                        count++;
                }
                if (right - left == p.length()) {
                    res.add(left);
                }
                left++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        FindAllAnagramsInString fs = new FindAllAnagramsInString();
        List<Integer> res = fs.findAnagrams("cbaebabacd","abc");
        System.out.println(res);

    }
}
