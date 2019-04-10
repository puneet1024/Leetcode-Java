//819

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashSet<String> bannedWords = new HashSet<>();
        for(String word:banned) {
            bannedWords.add(word);
        }
        int max = 0;
        Map<String,Integer> map = new HashMap<>();
        for(String words : paragraph.replaceAll("[^a-zA-Z]" , " ").toLowerCase().split(" ")){
            if(!bannedWords.contains(words)){
                map.put(words,map.getOrDefault(words,0) + 1);
            }
        }

        String result="";
        for(String k:map.keySet()){
            if(map.get(k)>max && !k.equals("")){
                max = map.get(k);
                result = k;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        MostCommonWord mcw = new MostCommonWord();
        String paragraph = "Bob. hIt, baLl";
        String[] banned = {"bob","hit"};
        System.out.println(mcw.mostCommonWord(paragraph,banned));
    }
}
