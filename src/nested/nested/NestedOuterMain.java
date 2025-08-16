package nested.nested;

public class NestedOuterMain {

    public static void main(String[] args) {
//        NestedOuter outer = new NestedOuter();
        NestedOuter.nested nested = new NestedOuter.nested();
        nested.print();

        System.out.println("nestedClass = " + nested.getClass());
    }
}
