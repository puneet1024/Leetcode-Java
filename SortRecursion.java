//Given a stack, sort it using recursion

import java.util.Stack;

public class SortRecursion {

    private static void sortedStack(Stack<Integer> st, int temp){
        if(st.isEmpty() || temp < st.peek()){
            st.push(temp);
            return;
        }
        int x = st.pop();
        sortedStack(st,temp);
        st.push(x);

    }
    private static void reverseStack(Stack<Integer> st) {
        if(!st.isEmpty()) {
            int temp = st.pop();
            reverseStack(st);
            sortedStack(st, temp);
        }

    }

    public static void main(String[] args) {
        SortRecursion sr = new SortRecursion();
        Stack<Integer> stack = new Stack<>();
        stack.push(-5);
        stack.push(5);
        stack.push(-3);
        stack.push(18);
        stack.push(30);
        sr.reverseStack(stack);
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
