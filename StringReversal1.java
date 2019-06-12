public class StringReversal1 {
    private static void stringReversal(String a) {
        String res = "";
        for(int j=a.length()-1;j>=0;j--) {
            res+=a.charAt(j);
        }
        if (res.equals(a)) {
            System.out.println("Pallindrome");
        } else {
            System.out.println("Not Pallindrome");
        }
    }

    public static void main(String[] args) {
       StringReversal1.stringReversal("ababa");
        StringReversal1.stringReversal("abaxba");
        StringReversal1.stringReversal("xxxxaaanaba");

    }
}
