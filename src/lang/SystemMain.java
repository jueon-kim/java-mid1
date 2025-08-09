package lang;

import java.util.Arrays;

public class SystemMain {
    public static void main(String[] args) {
        //현재 시간(밀리초)를 가저온다.
        long currentTimerMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimerMillis);

        //현재 시간(나노초)를 가져온다
        long currentNano = System.nanoTime();
        System.out.println("currentNano = " + currentNano);

        //환경 변수를 읽는다.
        System.out.println("getenv = " + System.getenv());

        //시스템 속성을 읽는다.
        System.out.println("properties = " + System.getProperties());
        System.out.println("Java version = " + System.getProperty("java.version"));

        char[] originalArray = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];
        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);
        System.out.println("copiedArray=" + originalArray);
        System.out.println("copiedArray=" + Arrays.toString(originalArray));

        //프로그램 종료
        System.exit(0);
        System.out.println("hello");
    }
}
