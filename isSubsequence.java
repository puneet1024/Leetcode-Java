public class isSubsequence {
    public boolean checkSubsequence(String s, String t) {
        if(s.length() == 0)
            return true;
        int sIndex = 0, tIndex = 0;
        while(tIndex < t.length()){
            if(s.charAt(sIndex) == t.charAt(tIndex)){
                sIndex++;
                if(sIndex == s.length())
                    return true;
            }
            tIndex++;
        }
        return false;
    }

    public static void main(String[] args) {
        isSubsequence iss = new isSubsequence();
        boolean result = iss.checkSubsequence("axc", "ahbgdc");
        System.out.println(result);
    }
}
