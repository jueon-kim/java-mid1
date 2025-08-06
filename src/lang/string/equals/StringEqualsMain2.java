package lang.string.equals;

public class StringEqualsMain2 {
<<<<<<< HEAD

    public static void main(String[] args) {
=======
    public static void main(String[] args) {

>>>>>>> immutable
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("메서드 호출 비교1: " + isSame(str1, str2));

        String str3 = "hello";
        String str4 = "hello";
<<<<<<< HEAD
        System.out.println("메서드 호출 비교2: " + isSame(str3, str4));
    }

    private static boolean isSame(String x, String y) {
        //return x == y;
=======
        System.out.println("메서드 호출 비교1: " + isSame(str3, str4));
    }

    private static boolean isSame(String x, String y) {
//        return x == y;
>>>>>>> immutable
        return x.equals(y);
    }
}
