package edu.polymorphism.pack2.ex1;

public class MemberService {
    // public static void main(){} 이외에 객체생성은 모두 class 아래에 바로 작성
    일반Member 일반회원 = new 일반Member("M001", "김일반", "kim@email.com");
    프리미엄Member 프리미엄회원 = new 프리미엄Member("P001", "이프리미엄", "lee@email.com", "배송비할인쿠폰");
    VIPMember VIP회원 = new VIPMember("V001", "박브이아이피", "bark@email.com", "배송비무료쿠폰", "무료반품");


    public void display() {
        System.out.println("=== 회원 시스템 ===");
        System.out.println("프리미엄 회원은 [배송비 할인 쿠폰]과 [반품비 할인 쿠폰]중 선택할 수 있습니다.");
        System.out.println("VIP 회원은 [배송비 할인 쿠폰]과 [반품비 할인 쿠폰]중 선택할 수 있으며,\n" +
                "혜택으로는 [무료 반품]과 [포인트 10000 적립]이 존재합니다.");
        System.out.println();

        Member[] 회원들 = {일반회원, 프리미엄회원, VIP회원};
        for (Member 회원 : 회원들) {
            회원.login();
            double 물건원가 = 10000;
            double 할인가 = 물건원가 * (1 - 회원.할인율());

            System.out.println("원가 : " + 물건원가 + "원");
            System.out.println("할인가 : " + 할인가 + "원");
            회원.쿠폰과혜택();
            회원.logout();
            System.out.println();
        }
    }
}
