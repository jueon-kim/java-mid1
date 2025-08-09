package Enumeration.ex1;


public class StringGradeEx1_2 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        //존재 하지 않는 등급
        int vip = discountService.discount("VIP", price);
        System.out.println("VIP 등급의 할인 금액" + vip);

        int diamondd = discountService.discount("DIAMONDd", price);
        System.out.println("DIAMONDD 등급의 할인 금액 " + vip);

        //소문자 입력
        int gold = discountService.discount("gold", price);
        System.out.println("gold등급의 할인 금액 " + gold);

    }
}
