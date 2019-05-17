import java.util.ArrayList;
import java.util.List;

public class Sublists106B {
    private void sublists(List<String> str) {
        ArrayList<ArrayList<String>> res = new ArrayList<>();
        ArrayList<String> chosen = new ArrayList<>();
        sublistsHelper(str, chosen,res);
        System.out.println(res);
    }
    private void sublistsHelper(List<String> str, List<String> chosen, ArrayList<ArrayList<String>> res){
        if(str.isEmpty()) {
            //base case
            res.add(new ArrayList<>(chosen));
//            System.out.println(new ArrayList<>(chosen));
        } else {
            //recursive case
            // for each possible choice :
            String s = str.get(0);
            str.remove(0);

            //choose/ explore without s
            sublistsHelper(str,chosen,res);
            System.out.println("chosen " + chosen);

            //choose/ explore with s
            chosen.add(s);
            sublistsHelper(str,chosen,res);

            // -unchoose
            str.add(0,s);
            chosen.remove(chosen.size()-1);
        }
    }

    public static void main(String[] args) {
        Sublists106B sb = new Sublists106B();
        List<String> arr = new ArrayList<>();
        arr.add("Jane");
        arr.add("Marty");
        arr.add("Bob");
        arr.add("Chotu");
        sb.sublists(arr);
    }
}
