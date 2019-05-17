import java.util.HashMap;
import java.util.Map;

public class LongestSubstringwithKUniqueChar {
    private String longestSubsKUnique(String s,int k){
        Map<Character,Integer> hash = new HashMap<>();
        int max = 1;
        int left = 0,right = 0;
        int mLeft = 0,mRight = 0;
        while(right<s.length()){
            if(hash.size() <=k){
                hash.put(s.charAt(right),right++);
            }
            if(hash.size() > k){
                int min = s.length() - 1;
                for(int value:hash.values()){
                    min = Math.min(min,value);
                }
                left= min+1;
                hash.remove(s.charAt(min));
            }
            if(right-left > max){
                max = right - left;
                mLeft = left;
                mRight = right;
            }
        }
        return s.substring(mLeft,mRight);
    }

    public static void main(String[] args) {
        LongestSubstringwithKUniqueChar lsk = new LongestSubstringwithKUniqueChar();
        String ans = lsk.longestSubsKUnique("aababceghghghghghghg",2);
        System.out.println(ans);
    }
}
