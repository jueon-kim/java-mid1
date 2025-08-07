package lang.string.test;

public class TestString1 {
    public static void main(String[] args) {
        String url1 = "https://www.example.com";
//        boolean result = url1.startsWith("https://")
        String startWith = "https://";

        System.out.println(url1.startsWith(startWith));
    }
}
