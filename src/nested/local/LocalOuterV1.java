package nested.local;

public class LocalOuterV1 {

    private int outInstance = 3;

    public void process(int parmVar) {
        int localVar = 1;

        class LocalPrinter{
            int value = 0;

            public void printDate() {
                System.out.println("value " + value);

                System.out.println("localValue " + localVar);
                System.out.println("paramVar " + parmVar);
                System.out.println("outInstance " + outInstance);
            }
        }
        LocalPrinter printer = new LocalPrinter();
        printer.printDate();
    }

    public static void main(String[] args) {
        LocalOuterV1 localOuterV1 = new LocalOuterV1();
        localOuterV1.process(2);

    }
}
