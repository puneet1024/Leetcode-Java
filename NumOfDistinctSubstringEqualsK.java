import java.util.*;


///NOT WORKING -INCORRECT
//Given aaaabcd, k = 4 should return 1 <abcd>
//If you have forgotten asshole, this was asked in your Amazon interview and you fucking couldn't solve it
public class NumOfDistinctSubstringEqualsK {
//    private List<String> disSubs(String s, int k){
//        int start=0,end = 0;
//        int[] arr = new int[26];
//        Arrays.fill(arr,-1);
//        HashSet<String> visited = new HashSet<>();
//        List<String> res = new ArrayList<>();
//        int len = s.length();
//        while(end < len){
//            while(end <len && end -start <= k && arr[s.charAt(end) - 'a'] == -1){
//                arr[s.charAt(end) - 'a'] = end;
//
//                if(end-start+1 == k){
//                    visited.add(s.substring(start,end+1));
//                    if(!visited.contains(s.substring(start,end+1)) && end-start+1 == k){
//                        res.add(s.substring(start,end+1));
//                    }
//                    start++;
//                }
//                end++;
//            }
//            start ++;
//            end ++;
//        }
//        return res;
//        }
    private List<String> disSubs(String s, int k){
        int start = 0, end = 0;
        Map<Character,Integer> hash = new HashMap<>();
        ArrayList<String> res = new ArrayList<>();
        HashSet<String> visited = new HashSet<>();
        while(end < s.length()){
            if (hash.size() < k) {
                hash.put(s.charAt(end), end++);
            }
            if(hash.size() == k){
//                System.out.println("end " + end );
//                System.out.println(hash.keySet());
                int max = 0;
                for(int value:hash.values()){
                    max = Math.max(max,value);
                }
                start= max-k+1;
                hash.remove(s.charAt(start));
                if(!visited.contains(s.substring(start,end))){
                    visited.add(s.substring(start,end));
                    res.add(s.substring(start,end));
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        NumOfDistinctSubstringEqualsK nds = new NumOfDistinctSubstringEqualsK();
        System.out.println(nds.disSubs("kawaglknagawaglnkhf",4));
    }
}
