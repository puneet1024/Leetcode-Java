import java.util.*;

public class TopKFrequentWords {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> hash = new HashMap<>();
        for (String word: words) {
            hash.put(word,hash.getOrDefault(word,0) + 1);
        }
        PriorityQueue<Map.Entry<String,Integer>> pq = new PriorityQueue<>((a, b) -> a.getValue()==b.getValue() ? a.getKey().compareTo (b.getKey()) : b.getValue() - a.getValue());
        for(Map.Entry<String,Integer> entry : hash.entrySet())
            pq.add(entry);

        List<String> result = new ArrayList<>();
        while(result.size() < k){
            Map.Entry<String,Integer> node = pq.poll();
            result.add(node.getKey());
        }
        return result;
    }
    public static void main(String[] args) {
        TopKFrequentWords mcw = new TopKFrequentWords();
        int k =4;
        String[] words = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
        System.out.println(mcw.topKFrequent(words,k));
    }
}
