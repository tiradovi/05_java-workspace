package edu.oop.field.pack3.ex;

public class ShoppingMallTestRun {
    public static void main(String[] args) {
        ShoppingMallMember member1 = new ShoppingMallMember();
        ShoppingMallMember member2 = new ShoppingMallMember();
        ShoppingMallMember member3 = new ShoppingMallMember();

        System.out.println("회원가입 진행");
        member1.joinMember("user001", "김쇼핑", "kim@email.com");
        member2.joinMember("user002", "박구매", "park@email.com");
        member3.joinMember("user003", "이주문", "lee@email.com");

        System.out.println("----- 회원가입 후 통계 -----");
        System.out.println("전체 회원 수: " + ShoppingMallMember.totalMemberCount);
        System.out.println("일일 방문자 수: " + ShoppingMallMember.dailyVisitorCount);

        System.out.println("=== 쇼핑몰 운영 정보 ===");
        System.out.println("쇼핑몰명: " + ShoppingMallMember.SHOPPING_MALL_NAME);
        System.out.println("고객센터: " + ShoppingMallMember.SERVICE_CENTER_NUMBER);
        System.out.println("최대 장바구니 수: " + ShoppingMallMember.MAX_CART_ITEMS + "개");
        System.out.println("최소 비밀번호 길이: " + ShoppingMallMember.MIN_PASSWORD_LENGTH + "자");

        //장바구니, 회원 정보
        System.out.println("******** 장바구니 정보 **********");
        member1.addToCart(10);
        member2.addToCart(25);
        member3.addToCart(60);
        System.out.println("******** 회원 정보 **********");
        member1.printMemberInfo();
        member2.printMemberInfo();
        member3.printMemberInfo();

        /**
         * Q1. 왜 totalMemberCount에 노란 경고가 나타날까요
         * System.out.println("전체 회원 수: " + member1.totalMemberCount);
         * static 변수는 클래스명으로 접근해야 해서
         *
         * Q2. static 초기화 블록은 언제 실행될까요?
         * 클래스가 처음 로딩될 때 한 번만
         *
         * Q3. SHOPPING_MALL_NAME을 static final로 선언하는 이유는?
         * 모든 객체가 공유하는 변경 불가능한 상수이므로
         */
    }
}
