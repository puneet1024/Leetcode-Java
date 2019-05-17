import java.util.*;
//1002
//General solution to find common characters between many strings
public class FindCommonCharacters {
    public List<String> commonChars(String[] A){
        List<String> res = new ArrayList<>();
        int[] count = new int[26]; //to keep track of characters frequencies overall
        Arrays.fill(count,Integer.MAX_VALUE);   //fill everyone with maximum value
        for(String s:A){
            //to keep count of all the characters in a single string
            int[] freq = new int[26];
            for(char ch:s.toCharArray()) {
                freq[ch - 'a']++;
            }
            for(int i=0;i<26;i++)
                count[i] = Math.min(count[i],freq[i]);
        }

        //count will now contain the min frequency of each character common to all the strings

        //since we need characters, we will be looping through characters
        for(char ch = 'a';ch<='z';ch++){
            while(count[ch-'a']-- >0)
                res.add("" + ch);
        }
        return res;
    }

    public static void main(String[] args) {
        FindCommonCharacters fcc = new FindCommonCharacters();
        String[] arr = new String[] {"cool","lock","cook"};
        List<String> res = fcc.commonChars(arr);
        System.out.println(res);
    }

}
