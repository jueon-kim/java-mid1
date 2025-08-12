package Enumeration.ref3;

public class EnumRefMain3_2 {

    public static void main(String[] args) {
        int price = 10000;

        printdDiscount(Grade.BASIC, price);
        printdDiscount(Grade.GOLD, price);
        printdDiscount(Grade.DIAMOND, price);

    }

    private static void printdDiscount(Grade grade, int price) {
        System.out.println(grade.name() + "등급의 할인금액: " + grade.discount(price));
    }
}
