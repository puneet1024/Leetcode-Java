import java.util.Stack;

public class CheckBalancedParantheses {
    private boolean checkParan(String S){
        if(S==null || S.length() == 0)
            return true;
        Stack<Character> st = new Stack<>();
        for(char ch:S.toCharArray()){
            if(ch == '{')
                st.push('}');
            else if(ch == '[')
                st.push(']');
            else if(ch == '(')
                st.push(')');
            else if(st.isEmpty() || st.pop()!=ch)
                return false;
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        CheckBalancedParantheses cbp = new CheckBalancedParantheses();
        System.out.println(cbp.checkParan("{))"));
    }
}
