public class PowerOf2 {
    private void calPow2(int input) {
        int count = 0;
        while (input >1) {
            input = input/2;
            count++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        PowerOf2 p2 = new PowerOf2();
        p2.calPow2(16);
        p2.calPow2(2);
    }
}
