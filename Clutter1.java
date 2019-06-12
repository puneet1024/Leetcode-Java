import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Clutter1 {
    public static List<String> generate_phrases(List<String> phrases) {
        List<String> res = new ArrayList<>();
        if(phrases == null || phrases.size() == 0)
            return res;
        HashMap<String,String> hash = new HashMap<>();
        for(String phrase:phrases) {
            String[] words = phrase.split(" ");
            String last = words[words.length-1];
            hash.put(last,phrase);
        }

        for(int i=0;i<phrases.size();i++) {
            String[] words = phrases.get(i).split(" ");
            String abc = phrases.get(i);
            if(hash.containsKey(words[0])) {
                StringBuilder str = new StringBuilder();
                str.append(hash.get(words[0]) + " " + abc.substring(abc.indexOf(" ") + 1));
                res.add(str.toString().trim());
            }
        }
            return res;
    }

    public static void main(String[] args) {
        List<String> phrases = new ArrayList<>();
        phrases.add("mission statement");
        phrases.add("a quick bite to eat");
        phrases.add("a chip off the old block");
        phrases.add("chocolate bar");
        phrases.add("mission impossible");
        phrases.add("a man on a mission");
        phrases.add("block party");
        phrases.add("eat my words");
        phrases.add("bar of soap");
        phrases.add("fresh old block");
        List<String> res = Clutter1.generate_phrases(phrases);
        System.out.println(res);
    }
}
