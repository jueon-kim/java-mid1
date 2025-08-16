package nested.local;

public class LocalOuterV2 {

    private int outInstance = 3;

    public void process(int parmVar) {
        int localVar = 1;

        class LocalPrinter implements Printer{
            int value = 0;

            @Override
            public void print() {
                System.out.println("value " + value);

                System.out.println("localValue " + localVar);
                System.out.println("paramVar " + parmVar);
                System.out.println("outInstance " + outInstance);
            }
        }
        LocalPrinter printer = new LocalPrinter();
        printer.print();
    }

    public static void main(String[] args) {
        LocalOuterV2 localOuterV1 = new LocalOuterV2();
        localOuterV1.process(2);

    }
}
