package edu.polymorphism.pack3.ex4;

public class CardRun {
    public static void main(String[] args) {
        // 삼성카드 사용
        SamsungCard samsung = new SamsungCard("김삼성", "1234-5678-9012-3456");
        samsung.showCardInfo();
        samsung.showBenefits();
        int discount1 = samsung.calculateDiscount(10000);
        samsung.makePayment(10000 - discount1);
        int pointsEarned1 = (10000 / 100) * samsung.getPointRate();
        samsung.addPoints(pointsEarned1);

        System.out.println("\\n" + "=".repeat(50) + "\\n");

        // 현대카드 사용
        HyundaiCard hyundai = new HyundaiCard("이현대", "9876-5432-1098-7654");
        hyundai.showCardInfo();
        hyundai.showBenefits();
        int discount2 = hyundai.calculateDiscount(20000);
        hyundai.makePayment(20000 - discount2);
        int pointsEarned2 = (20000 / 100) * hyundai.getPointRate();
        hyundai.addPoints(pointsEarned2);

        System.out.println("\n" + "=".repeat(50) + "\n");
        System.out.println("=".repeat(10) + "국민카드 사용하기" + "=".repeat(10));

        // KB국민카드 사용
        KBCard kb = new KBCard("박국민", "5555-4444-3333-2222");
        kb.showCardInfo();
        kb.showBenefits();
        int discount3 = kb.calculateDiscount(15000);
        kb.makePayment(15000 - discount3);
        int pointsEarned3 = (15000 / 100) * kb.getPointRate();
        kb.addPoints(pointsEarned3);
    }
}