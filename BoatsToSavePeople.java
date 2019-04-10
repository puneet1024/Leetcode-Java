//881
import java.util.Arrays;


public class BoatsToSavePeople {
    private int boats(int[] people, int limit){
        Arrays.sort(people);
        int numBoats=0;
        int i=0,j=people.length-1;
        while(i<=j){
            if(people[i]+people[j] <=limit){
                numBoats++;
                i++;
                j--;
            }
            else {
                numBoats++;
                j--;
            }
        }
        return numBoats;
    }

    public static void main(String[] args) {
        BoatsToSavePeople bts = new BoatsToSavePeople();
        int[] people = {3,5,3,4};
        int limit = 5;
        System.out.println(bts.boats(people,limit));
    }
}
