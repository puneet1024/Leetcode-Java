//76.

//Sliding window approach taking two pointers, left and right
import java.util.HashMap;

public class MinimumWindowSubstring {
    public String minWinSubs(String s, String t){
        HashMap<Character,Integer> hash = new HashMap<>();

        //Put the string to be searched(t in this case) in a hash map
        for(char ch:t.toCharArray()){
            hash.put(ch,hash.getOrDefault(ch,0)+1);
        }
        //We need following variables to keep track:
        // left and right pointer to maintain the sliding window
        // minValue is the minimum value of sufficient window
        // minLeft is the minimum starting point of the sufficient window
        // minRight is the minimum ending point of that sufficient window
        int minValue = s.length()+1,count = 0;
        int left = 0, minLeft = 0;
        int minRight = 0;
        //We will increase the right pointer till we found all characters of t in s, and we use counter variable count to keep track of that
        for (int right = 0;right < s.length();right++){
            char c = s.charAt(right);
            if(hash.containsKey(c)){
                hash.put(c,hash.get(c)-1);
                if(hash.get(c) >= 0)
                    count++;
                while(count==t.length()){   //right is at the index where my count matches the length and now i need to move my left pointer to find the min
                    if(right-left+1 < minValue){ //since we have our required window, we will check if this is the minimum window or not
                        minValue = right-left+1;
                        minLeft = left;            // we store the starting point of that minimum window
                        minRight = right;           // we store the ending point of that minimum window
                    }
                    char cur = s.charAt(left);     //We move the left pointer till the count is not equal to length, basically to the next instance of any character of t in s
                    if(hash.containsKey(cur)) {
                        hash.put(cur, hash.get(cur) + 1);
                        if(hash.get(cur) > 0)
                            count--;
                    }
                    left++;
                }
            }
        }
        return s.substring(minLeft, minRight+1);
    }

    public static void main(String[] args) {
        MinimumWindowSubstring mws = new MinimumWindowSubstring();
        System.out.println(mws.minWinSubs("AABDBCC","ABC"));
    }
}
