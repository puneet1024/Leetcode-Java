import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s){
        Stack<Character> st = new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch== '{')
                st.push('}');
            if(ch=='(')
                st.push(')');
            if(ch=='[')
                st.push(']');
            else if(st.isEmpty() || st.pop()!=ch)
                return false;
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses vp = new ValidParentheses();
        System.out.println(vp.isValid("{{}}"));
    }
}
