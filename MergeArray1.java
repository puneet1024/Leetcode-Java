public class MergeArray1 {
    private static void merge(int []a1, int[] a2) {
        int n1 = a1.length;
        int n2 = a2.length;
        int[] a3 = new int[n1+n2];
        for(int i=0;i<n1;i++) {
            a3[i] = a1[i];
        }
        int k = 0;
        for(int j=n1; j<n1+n2;j++)
        {
            a3[j] = a2[k];
            k++;
        }
        for (int num:a3){
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        int[] a1 = {1,2,3,4,5};
        int[] a2 = {6,7,8,9};
        MergeArray1.merge(a1,a2);

    }
}
