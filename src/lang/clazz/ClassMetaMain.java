package lang.clazz;

import java.io.FilterOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {
    public static void main(String[] args) throws Exception{
        //Class 조회
        Class clazz = String.class; // 1. 클래스에서 조회
//        Class clazz = new String().getClass();
//        Class clazz2 = Class.forName("java.lang.String");

        //모든 필드를 출력
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field.getType() + "  " + field.getName());
        }

        //모든 메서드 출력
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("method " + method);
        }

        //상위 클래스 정보 입력
        System.out.println("Superclass: " + clazz.getSuperclass().getName());

        Class[] interfaces = clazz.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println("interface " + interfaces);
        }
    }
}
