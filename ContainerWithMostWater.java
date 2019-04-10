//11. given n non negative vertical lines on the x-axis, find the container with most water
public class ContainerWithMostWater {
    private int containerWater(int[] arr) {
        int maxArea=-1;
        int start = 0, end = arr.length-1;
        while(start < end){
            if (arr[start] <= arr[end]){
                maxArea = Math.max(maxArea,arr[start] *(end-start));
                start++;
            } else if(arr[end] <arr[start]){
                maxArea = Math.max(maxArea,arr[end] *(end-start));
                end--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        ContainerWithMostWater cmw = new ContainerWithMostWater();
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(cmw.containerWater(arr));

    }
}
