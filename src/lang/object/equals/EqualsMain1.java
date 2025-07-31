package lang.object.equals;

public class EqualsMain1 {
    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id-100");
        UserV1 userV2 = new UserV1("id_100");

        System.out.println("identity = " + (user1 == userV2));
        System.out.println("equals = " + (userV2.equals(user1)));
    }
}
