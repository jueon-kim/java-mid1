package nested.inner;

public class InnerOuterMain {

    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();
        InnerOuter.Inner Inner = outer.new Inner();


        System.out.println("InnerClass =  " + Inner.getClass());
    }
}
