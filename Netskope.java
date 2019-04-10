public class Netskope {
    public static void main(String[] args) {
        call();
    }
    public static int[] multiplyEx(int[] arr){
        int mul = 1;
        int count = 0;
        int[] result = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0) {
                count += 1;
                continue;
            }
            mul = mul * arr[i];
        }

        if(count >= 2) {
            return result;
        } else if(count == 1) {
            for(int i=0;i<arr.length;i++){
                if(arr[i] == 0) {
                    result[i] = mul;
                }
            }
            return result;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0) {
                result[i] = mul/arr[i];
            }
        }
        return result;
    }

    public static void call() {
        int[] nums = {18,0,0,4};
        int [] ans = {0,0,0,0};
        int [] result = multiplyEx(nums);
        if(result.length != ans.length){
            System.out.println("Failure");
        } else {
            for(int i=0;i<ans.length;i++){


                System.out.println(result[i]);

            }
        }

    }
}
