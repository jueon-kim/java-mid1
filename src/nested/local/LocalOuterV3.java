package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV3 {

    private int outInstance = 3;

    public Printer process(int parmVar) {
        int localVar = 1; // 지역 변수는 스택 프레임이 종료되는 순간 함꼐 사라진다.

        class LocalPrinter implements Printer{
            int value = 0;

            // 복사를 미리 해둔다.
//            int localVar = 1;
//            int paramVar = 2;

            @Override
            public void print() {
                System.out.println("value " + value);

                //인스턴스는 지역 변수보다 더 오래 살아 남는다.
                System.out.println("localValue " + localVar);
                System.out.println("paramVar " + parmVar);
                System.out.println("outInstance " + outInstance);
            }
        }
        LocalPrinter printer = new LocalPrinter();
//        printer.print(); 를 여기서 실행하지 않고 Printer인스턴스만 반환 한다.
        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV3 localOuterV1 = new LocalOuterV3();
        Printer printer = localOuterV1.process(2);

        //printer.print()를 나중에 실행한다. process의 스택 페리임이 사라진 이후에 실행
        printer.print();

        //추가 자바가 내부적으로 켭처를 해둔다.
        System.out.println("필드 확인");
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field " + field);
        }
    }
}
