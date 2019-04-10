import java.util.HashMap;
import java.util.Map;

public class FruitIntoBaskets {
    public int totalFruit(int[] tree) {
        if(tree == null || tree.length==0)
            return 0;
        int max = 1;
        Map<Integer,Integer> kcount = new HashMap<>();
        int i=0,j=0;
        while(j<tree.length){
            if(kcount.size() <= 2){
                kcount.put(tree[j],j++);
            }
            if(kcount.size() > 2){
                //calculate the min index of the last occurrence of the first character
                int min = tree.length-1;
                for(int value:kcount.values()){
                    min = Math.min(min,value);
                }
                i = min+1;
                //remove the first character
                kcount.remove(tree[min]);
            }
            //maximum will be max of j(last occurence of second character)-i(first occurrence of first character)
            max = Math.max(max,j-i);
        }
        return max;
    }

    public static void main(String[] args) {
        FruitIntoBaskets fib = new FruitIntoBaskets();
        int[] tree = new int[]{1,2,2,1,1,3,4,2};
        System.out.println(fib.totalFruit(tree));

    }
}
