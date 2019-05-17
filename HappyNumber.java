import java.util.*;

public class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> visited = new HashSet<>();
        while(n!=1){
            if(visited.contains(n))
                return false;
            int curr = n;
            int sum = 0;
            while(curr!=0){
                sum += (curr%10) * (curr%10);
                curr = curr/10;
            }
            visited.add(n);
            n = sum;
        }
        return true;
    }
}
