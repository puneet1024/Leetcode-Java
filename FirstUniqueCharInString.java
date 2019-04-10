public class FirstUniqueCharInString {
    private int firstUnique(String s) {
        int index = -1;
        int[] arr = new int[26];
        for(char ch: s.toCharArray()){
            arr[ch-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if (arr[s.charAt(i)-'a'] == 1){
                index = i;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        FirstUniqueCharInString fuq = new FirstUniqueCharInString();
        System.out.println(fuq.firstUnique("loveleetcode"));
    }
}
