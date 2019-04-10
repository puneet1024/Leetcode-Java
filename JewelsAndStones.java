//771. Count the number of jewels in the stones

import java.util.HashSet;

public class JewelsAndStones {
    private int jewels(String J, String S) {
        int count = 0;
        HashSet<Character> hash = new HashSet<>();
        for(char ch: J.toCharArray())
            hash.add(ch);
        for(int i=0;i<S.length();i++){
            if(hash.contains(S.charAt(i))){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        JewelsAndStones jws = new JewelsAndStones();
        System.out.println(jws.jewels("z", "ZZ"));
    }
}
