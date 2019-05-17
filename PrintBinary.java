public class PrintBinary {
    public void printBinary(int digits){

        printBinaryHelper(digits,"");
    }

    void printBinaryHelper(int digits, String output) {
        if(digits == 0 ) {
            System.out.print("   ");
            System.out.println(output);
        }
        else {
            printBinaryHelper(digits - 1,output+"0");
            printBinaryHelper(digits - 1,output+"1");
        }
    }

    public static void main(String[] args) {
        PrintBinary pb = new PrintBinary();
        pb.printBinary(3);
    }
}
