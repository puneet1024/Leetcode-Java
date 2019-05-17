public class ReverseStringRecursion {
    void stringRecusrion(String s){
        if(s.length() == 0)
            return;
        stringRecursionHelper(s,"");
    }
    void stringRecursionHelper(String s, String ans){
        if(s.length()==0) {
            System.out.println(ans);
            return;
        }

        stringRecursionHelper(s.substring(0,s.length()-1),ans +s.charAt(s.length()-1));
    }

    public static void main(String[] args) {
        ReverseStringRecursion rsf = new ReverseStringRecursion();
        rsf.stringRecusrion("puneet");
    }
}
