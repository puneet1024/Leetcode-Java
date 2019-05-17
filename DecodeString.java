import java.util.LinkedList;
import java.util.Stack;

//Maintain two stack, one integer to keep the number of time string is to be repeated, another one to store the characters and keep track of brackets
public class DecodeString {
    public String decodeString(String s) {
        String res = "";
        Stack<Integer> cint = new Stack<>();
        Stack<String> str = new Stack<>();
        int i = 0;

        while( i < s.length()){
            if(Character.isDigit(s.charAt(i))){
                int count = 0;
                while(Character.isDigit(s.charAt(i))){
                    count = 10 * count + (s.charAt(i) - '0');
                    i++;
                }
                cint.push(count);
            } else if(s.charAt(i) == '['){
                str.push(res);
                res = "";
                i++;

            } else if(s.charAt(i) == ']'){
                int x = cint.pop();
                StringBuilder temp = new StringBuilder(str.pop());
                for(int j=0;j<x;j++){
                    temp.append(res);
                }
                i++;
                res = temp.toString();
            } else {
                res+=s.charAt(i);
                i++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        DecodeString ds = new DecodeString();
        System.out.println(ds.decodeString("3[a2[bc]]"));

    }
}
