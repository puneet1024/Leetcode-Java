//451. Sort Characters By Frequency
//Input -> "tree"
//Output -> "eert" or "eetr"


import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;


public class SortCharactersByFrequency {
    private String sortByFreq(String s){
        StringBuilder sb = new StringBuilder();  //to keep building the return string
        Map<Character,Integer> count = new HashMap<>(); //to record the frequency of each character
        for(char ch:s.toCharArray()){
            count.put(ch,count.getOrDefault(ch,0)+1);
        }

        //Throw each character into the priority queue and compare them according tot he count(frequency) of each character
        PriorityQueue<Character> pq = new PriorityQueue<>((a,b) -> count.get(b) - count.get(a));
        pq.addAll(count.keySet());  //adding character set to the priority queue, therefore, each element just get in the queue once ranked according to their counts

        while(!pq.isEmpty()){
            char c = pq.remove();  //remove each character from the queue
            for(int i= 0;i<count.get(c);i++)   //count the frequency of each character in the original string
                sb.append(c);        //and append that character the those many number of times
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        SortCharactersByFrequency scf = new SortCharactersByFrequency();
        System.out.println(scf.sortByFreq("cccaaa"));
    }
}
