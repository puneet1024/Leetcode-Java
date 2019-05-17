//Implement an algorithm to check if the string has all unique characters

public class CheckUniqueString {
    private boolean checkUnique(String s){
        boolean check[] = new boolean[128];
        for(char ch:s.toCharArray()){
            if(check[ch])
                return false;
            check[ch] = true;
        }
        return true;
    }

    public static void main(String[] args) {
        CheckUniqueString cus = new CheckUniqueString();
        System.out.println(cus.checkUnique("abdef"));
    }
}
