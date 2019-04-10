//4. Median of Two Sorted Arrays

public class MedianofTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] answer = new int[nums1.length + nums2.length];
        double median = 0.0;
        int i=0,j=0,k=0;
        while(i<nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                answer[k++] = nums1[i++];
            }else if(nums1[i] > nums2[j]){
                answer[k++] = nums2[j++];
            } else {
                answer[k++] = nums1[i++];
                answer[k++] = nums2[j++];
            }
        }
        while(i<nums1.length){
            answer[k++] = nums1[i++];
        }
        while(j < nums2.length) {
            answer[k++] = nums2[j++];
        }
        if(answer.length%2!=0){
            median = answer[answer.length/2];
        }else {
            median = (double) (answer[(int)answer.length/2-1] + answer[(int) answer.length/2])/2;
        }
        return median;
    }

    public static void main(String[] args) {
        MedianofTwoSortedArrays mst = new MedianofTwoSortedArrays();
        int[] nums1 = new int[]{1,2};
        int[] nums2 = new int[]{3,4};
        System.out.println(mst.findMedianSortedArrays(nums1,nums2));
    }
}
