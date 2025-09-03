package edu.polymorphism.pack2.ex1;

/*
부모클래스인 Member 상속받을 자식 클래스
 */
public class 일반Member extends Member {
    // 자식클래스에서 부모클래스에 작성된 필드만 사용하고, 자식클래스는 메서드만 사용 가능
    public 일반Member() {
    }

    public 일반Member(String memberId, String memberName, String memberEmail) {
        super(memberId, memberName, memberEmail);
    }

    // Member를 부모로 하는 경우 다른건 몰라도 할인율()기능은 필수
    @Override
    public double 할인율() {
        return 0.05;
    }

    @Override
    public void 쿠폰과혜택() {
        System.out.println("보유하고있는 쿠폰과 혜택이 존재하지 않습니다.");
        System.out.println("구독 서비스에 따라 쿠폰과 혜택을 받으실 수 있습니다.\n");
    }
}
