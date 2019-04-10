import java.util.Arrays;

public class Candy {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] results = new int[n];
        int sum = 0;
        Arrays.fill(results,1);
        for(int i=1;i<ratings.length;i++){
            if(ratings[i] > ratings[i-1]){
                results[i] = results[i-1] + 1;
            }
        }
        for(int j=ratings.length-2;j>=0;j--){
            if(ratings[j] > ratings[j+1]){
                results[j] = Math.max(results[j], results[j+1] +1);
            }
        }
        for(int i=0;i<results.length;i++){
            sum+=results[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Candy candy = new Candy();
        int[] ratings = new int[]{1,4,6,3,2,1,9};
        System.out.println(candy.candy(ratings));
    }
}
