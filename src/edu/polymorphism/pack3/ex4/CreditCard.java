package edu.polymorphism.pack3.ex4;

// 신용카드의 기본 틀
class CreditCard {
    protected String cardName;
    protected String holderName;
    protected String cardNumber;
    protected int availableLimit;
    protected int points;

    public CreditCard(String cardName, String holderName, String cardNumber) {
        this.cardName = cardName;
        this.holderName = holderName;
        this.cardNumber = cardNumber;
        this.availableLimit = 1000000; // 기본 한도 100만원
        this.points = 0;
    }

    public void showCardInfo() {
        System.out.println("[" + cardName + "] " + holderName + "님의 카드");
        System.out.println("카드번호: " + cardNumber.substring(0, 4) + "-****-****-****");
        System.out.println("사용가능한도: " + availableLimit + "원");
        System.out.println("포인트: " + points + "P");
    }

    public void makePayment(int amount) {
        if (amount <= availableLimit) {
            availableLimit -= amount;
            System.out.println(amount + "원 결제 완료");
            System.out.println("남은 한도: " + availableLimit + "원");
        } else {
            System.out.println("한도 부족 결제 불가능합니다.");
        }
    }

    public void addPoints(int newPoints) {
        points += newPoints;
        System.out.println(newPoints + "P 적립 (총 " + points + "P)");
    }

    // 포인트 적립률
}