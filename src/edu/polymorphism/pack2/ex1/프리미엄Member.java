package edu.polymorphism.pack2.ex1;

public class 프리미엄Member extends Member {
    private String 쿠폰;

    public 프리미엄Member() {
    }

    public 프리미엄Member(String 쿠폰) {
        this.쿠폰 = 쿠폰;
    }

    public 프리미엄Member(String memberId, String memberName, String memberEmail) {
        super(memberId, memberName, memberEmail);
    }

    public 프리미엄Member(String memberId, String memberName, String memberEmail, String 쿠폰) {
        super(memberId, memberName, memberEmail);
        this.쿠폰 = 쿠폰;
    }

    public String get쿠폰() {
        return 쿠폰;
    }

    public void set쿠폰(String 쿠폰) {
        this.쿠폰 = 쿠폰;
    }

    @Override
    public double 할인율() {
        return 0.15;
    }

    @Override
    public void 쿠폰과혜택() {
        System.out.println("현재 " + get쿠폰() + "을 보유하고 있습니다.");
        System.out.println("아쉽게도 혜택은 존재하지 않습니다.");
        System.out.println("VIP로 구독 업그레이드하기\n");
    }
}
