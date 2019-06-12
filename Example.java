//public class Example {
//    int i[] = {0};
//    public static void main(String args[]) {
//        int i[] = {1};
//        change_i(i);
//        System.out.println(i[0]);
//        System.out.println(System.identityHashCode(i));
//    }
//    public static void change_i(int i[]) {
//        int j[] = {2};
//        System.out.println("j " + System.identityHashCode(j));
//        i = j;
//        System.out.println("i " + System.identityHashCode(i));
//
//    }
//}

public class Example {
    int i[] = {0};
    public static void main(String args[]) {
        int i[] = {1};
        change_i(i);
        System.out.println(i[0]);
    }
    public static void change_i(int i[]) {
        i[0] = 2;
        i[0] *= 2;
    }
}