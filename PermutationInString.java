import java.util.HashMap;

public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> hash = new HashMap<>();
        for(char ch:s1.toCharArray()){
            hash.put(ch,hash.getOrDefault(ch,0) +1);
        }
        int right = 0,left =0;
        int count = hash.size();
        while(right < s2.length()){
            char temp = s2.charAt(right);
            if(hash.containsKey(temp)) {
                hash.put(temp,hash.get(temp) -1);
                if(hash.get(temp) == 0)
                    count--;
            }
            right++;
            while(count == 0){
                char tempc = s2.charAt(left);
                if(hash.containsKey(tempc)){
                    hash.put(tempc,hash.get(tempc) +1);
                    if(hash.get(tempc) > 0)
                        count++;
                }
                if(right - left == s1.length())
                    return true;
                left++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        PermutationInString pis = new PermutationInString();
        boolean b = pis.checkInclusion("adc","dcda");
        System.out.println(b);
    }
}
