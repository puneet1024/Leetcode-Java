//792. Number of matching subsequence

//Very bad solution, too high complexity and runtime

public class NumberOfMatchingSubsequences {
    private int numMatchingSubseq(String S, String[] words) {
        if(S.length()==0)
            return 0;
        int count=0;
        for(String t:words){
            int tIndex = 0;
            int sIndex = 0;
            while(sIndex < S.length()){
                if(S.charAt(sIndex) == t.charAt(tIndex)){
                    tIndex++;
                    if(tIndex == t.length()) {
                        count++;
                        break;
                    }
                }
                sIndex++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        NumberOfMatchingSubsequences nsubs = new NumberOfMatchingSubsequences();
        String s = "abcbde";
        String[] words = {"a","bb","acd","ace"};
        int res = nsubs.numMatchingSubseq(s,words);
        System.out.println(res);
    }
}
