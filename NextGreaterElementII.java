import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementII {
    public int[] nextGreaterElements(int[] nums) {
        int len = nums.length;
        int[] res = new int[nums.length];
        Arrays.fill(res,-1);
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<len * 2;i++){
            while(!st.isEmpty() && nums[st.peek()] < nums[i%len]){
                res[st.pop()] = nums[i%len];
            }
            st.push(i%len);
        }
        return res;
    }

    public static void main(String[] args) {
        NextGreaterElementII nx2 = new NextGreaterElementII();
        int[] arr = {1,2,1};
        int []res = nx2.nextGreaterElements(arr);
        for(int i:res)
        System.out.println(i);
    }
}
