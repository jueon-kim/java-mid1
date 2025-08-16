package nested.anoymous;

import nested.local.Printer;

public class AnonymousOuter {

    private int outInstance = 3;

    public void process(int parmVar) {
        int localVar = 1;

        Printer printer = new Printer() {
            int value = 0;

            @Override
            public void print () {
                System.out.println("value " + value);

                System.out.println("localValue " + localVar);
                System.out.println("paramVar " + parmVar);
                System.out.println("outInstance " + outInstance);
                }
    };
        printer.print();
        System.out.println(printer.getClass());

    }

    public static void main(String[] args) {
        AnonymousOuter localOuterV1 = new AnonymousOuter();
        localOuterV1.process(2);

    }
}
