public class PlusOne {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n-1; i >=0 ; i--) {
            if(digits[i] < 9){
                digits[i]+=1;
                return digits;
            }
            digits[i] = 0;
        }
        int[] results = new int[n+1];
        results[0] = 1;
        return results;
    }

    public static void main(String[] args) {
        PlusOne plusOne = new PlusOne();
        int[] digits = new int[]{1,2,3};
        plusOne.plusOne(digits);
    }
}
