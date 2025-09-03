package edu.polymorphism.pack3.ex3;

class KakaoTaxi extends TaxiApp implements TaxiInterface {
    public KakaoTaxi(String userName) {
        super("카카오택시", userName);
    }

    @Override
    public void callTaxi() {
        System.out.println("🟡 카카오택시: 근처 택시를 찾고 있습니다...");
        System.out.println("🟡 카카오택시: 3분 후 도착 예정입니다!");
    }

    @Override
    public int calculateFare(int distance) {
        int fare = 3000 + (distance * 100); // 기본 3000원 + 거리당 100원
        System.out.println("🟡 카카오택시: 예상 요금 " + fare + "원");
        return fare;
    }

    @Override
    public void showDriverInfo() {
        System.out.println("🟡 기사님: 김택시 (⭐4.8) - 현대 아반떼");
    }
}