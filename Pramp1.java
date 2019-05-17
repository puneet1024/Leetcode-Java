public class Pramp1 {
    static double root(double x, int n) {
        // your code goes here
        double i =0,j=x/n;
        double ans = 0.0;
        while(i<=j){
            double mid = i+(j-i)/2;
            double p = Math.pow(mid,n);
            if(p == x)
                ans = mid;
            if(p > x)
                j -= mid;
            else
                i += mid;

        }
        return ans;
    }

    public static void main(String[] args) {
        Pramp1 s = new Pramp1();
        System.out.println(s.root(7.0,3));
    }
}
