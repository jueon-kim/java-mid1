package exception.basic.checked.unchecked;

public class Client {

    public void call() {
        throw new MyUncheckedException("ex");
    }
}
