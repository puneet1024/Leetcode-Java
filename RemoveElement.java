//27. Given an array and a value, remove all the instances of that value in the array, in-place and return the new length
public class RemoveElement {
    private int removeElement(int[] arr, int val){
        int nlen=0;
        for(int i:arr){
            if(i != val)
                arr[nlen++] = i;
        }
        return nlen;
    }

    public static void main(String[] args) {
        RemoveElement re = new RemoveElement();
        int[] arr = {3,2,2,3,5,6,3,4,2,6,8};
        System.out.println(re.removeElement(arr,3));
    }
}
