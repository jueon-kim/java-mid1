package lang.string.test;

public class TestString11 {
    public static void main(String[] args) {

        String str = "hello java";
        String revered = new StringBuffer(str).reverse().toString();
        System.out.println(revered);
    }
}
