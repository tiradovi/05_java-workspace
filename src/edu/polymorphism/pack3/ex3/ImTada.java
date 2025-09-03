package edu.polymorphism.pack3.ex3;

class ImTada extends TaxiApp implements TaxiInterface {
    public ImTada(String userName) {
        super("타다", userName);
    }

    @Override
    public void callTaxi() {
        System.out.println("🔴 타다: 깔끔한 차량을 준비하고 있어요");
        System.out.println("🔴 타다: 2분 후 도착합니다. 정장 입은 기사님이에요!");
    }

    @Override
    public int calculateFare(int distance) {
        int fare = 5000 + (distance * 150); // 기본 5000원 + 거리당 150원 (고급 서비스)
        System.out.println("🔴 타다: 예상 요금 " + fare + "원 (고급 서비스)");
        return fare;
    }

    @Override
    public void showDriverInfo() {
        System.out.println("🔴 기사님: 박프로 (⭐5.0) - 제네시스 G90 (정장 착용)");
    }
}