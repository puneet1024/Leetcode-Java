import java.util.ArrayList;
import java.util.List;

/**
 * Search in a sorted array of unknown size
 * Leetcode 702 - Locked
 *
 *
 * Since we need to know the size of the array to perform binary search, The basic thought is to assume that the high is at Integer.MAX_VALUE and
 * all the remianing spot in the array is filled with 
 */
public class SearchSortedUnknownSize {
    public int search(ArrayReader reader, int target) {
        int i=0,j=Integer.MAX_VALUE;
        while(i<=j) {
            int mid = i + (j-i)/2;
            int x = reader.get(mid);
            if(x == target) {
                return mid;
            } else if (target > x) {
                i = mid+1;
            } else {
                j = mid-1;
            }
        }
        return -1;
    }
}

interface ArrayReader{
    List<Integer> list = new ArrayList<>();
    public abstract int get(int num);
}
