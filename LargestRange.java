import java.util.*;

public class LargestRange {
    private int[] larRange(int[] arr) {
        Set<Integer> visited = new HashSet<>();
        int longestRange = 0;
        int minLeft=0,maxRight = 0;

        for (int i :arr){
            visited.add(i);
        }

        for(int i:arr){
            if(!visited.contains(i))
                continue;
            visited.remove(i);
            int currLength = 1;
            int left = i-1;
            int right = i+1;
            while(visited.contains(left)){
                visited.remove(left);
                left -=1;
                currLength+=1;
            }
            while(visited.contains(right)){
                visited.remove(right);
                right+=1;
                currLength+=1;
            }
            if (currLength > longestRange){
                longestRange = currLength;
                minLeft = left+1;
                maxRight = right-1;
                System.out.println("maxRight " + maxRight);
                System.out.println("minLeft " + minLeft);
            }
        }

        int[] res = new int[maxRight-minLeft+1];
        int count = 0;
        for(int i=minLeft;i<=maxRight;i++){
            res[count] = i;
            count++;
        }
        return res;
    }

    public static void main(String[] args) {
        LargestRange lr = new LargestRange();
        //int[] arr = {1,11,3,0,15,5,2,4,10,7,12,6};
        int[] arr = {1,5};
        int [] res;
        res = lr.larRange(arr);
        for(int i: res)
            System.out.print(i);
    }
}
