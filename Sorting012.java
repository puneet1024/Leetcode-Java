//given an array containing only 0,1,2 , sort them in O(n)
public class Sorting012 {
    public void sort(int[] arr) {
        int i = 0, j = 0, k = arr.length - 1;
        while (i <= k) {
            if (arr[i] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            } else if (arr[i] == 2) {
                int temp2 = arr[k];
                arr[k] = arr[i];
                arr[i] = temp2;
                k--;
            } else {
                i++;
            }
        }
        for (int m = 0; m < arr.length; m++) {
            System.out.println(arr[m]);
        }
    }

    public static void main(String[] args) {
        Sorting012 s = new Sorting012();
        //int[] a = new int[]{1,0,1,2,1,1,0,2,1};
        int[] a = new int[]{1, 1, 0, 0, 2, 0, 0, 2, 0};
        s.sort(a);
    }
}
