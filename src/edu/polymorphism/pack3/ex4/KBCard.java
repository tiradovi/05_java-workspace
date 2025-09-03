package edu.polymorphism.pack3.ex4;

// KB국민카드
class KBCard extends CreditCard implements CardMethods {
    public KBCard(String holderName, String cardNumber) {
        super("KB국민카드", holderName, cardNumber);
    }

    @Override
    public void showBenefits() {
        System.out.println("🟡 KB국민카드 혜택:");
        System.out.println("   - 주유소 리터당 100원 할인");
        System.out.println("   - 대중교통 30% 할인");
        System.out.println("   - 온라인쇼핑 5% 적립");
    }

    @Override
    public int calculateDiscount(int amount) {
        int discount = (int) (amount * 0.03); // 3% 할인
        System.out.println("🟡 KB국민카드: " + discount + "원 할인");
        return discount;
    }

    @Override
    public int getPointRate() {
        return 1; // 100원당 1포인트
    }
}