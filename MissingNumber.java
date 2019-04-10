//268. Given an array to n distinct number from 0,1,2....n, find the one that is missing from the array.

import java.util.HashSet;

public class MissingNumber {
    private int missing(int[] arr) {
        HashSet<Integer> hash = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hash.add(arr[i]);
        }
        for(int i=1;i<=arr.length;i++){
            if(!hash.contains(i))
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        MissingNumber mn = new MissingNumber();
        int[] arr = new int[]{1,4,5,9,2,3,6,7};
        System.out.println(mn.missing(arr));

    }
}
