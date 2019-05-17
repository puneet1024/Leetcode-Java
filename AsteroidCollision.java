import java.util.Stack;

public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        int index=0;
        for(int i=0;i<asteroids.length;i++){
            if(asteroids[i] > 0){
                stack.push(asteroids[i]);
            } else {
                while(!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(asteroids[i])){       //[10,2,-5]
                    stack.pop();
                }
                if(stack.isEmpty() || stack.peek() < 0){     //[-2,-1,1,2]
                    stack.push(asteroids[i]);
                }else if(stack.peek() == Math.abs(asteroids[i])){   //[8,-8]
                    stack.pop();
                }
            }

        }

        int[] res = new int[stack.size()];
        for(int i=res.length-1;i>=0;i--){
            res[i] = stack.pop();
        }
        return res;
    }

    public static void main(String[] args) {
        AsteroidCollision ac = new AsteroidCollision();
        int[] ast = {5,10,-5};
        int [] res = ac.asteroidCollision(ast);
        for(int i:res)
            System.out.println(i);
    }
}
