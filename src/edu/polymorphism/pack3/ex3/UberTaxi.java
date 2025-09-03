package edu.polymorphism.pack3.ex3;

class UberTaxi extends TaxiApp implements TaxiInterface {
    public UberTaxi(String userName) {
        super("우버택시", userName);
    }

    @Override
    public void callTaxi() {
        System.out.println("🔵 우버: Finding your driver...");
        System.out.println("🔵 우버: Driver will arrive in 5 minutes!");
    }

    @Override
    public int calculateFare(int distance) {
        int fare = 4000 + (distance * 120); // 기본 4000원 + 거리당 120원 (프리미엄)
        System.out.println("🔵 우버: Estimated fare $" + fare + " KRW");
        return fare;
    }

    @Override
    public void showDriverInfo() {
        System.out.println("🔵 Driver: John Kim (⭐4.9) - BMW 3 Series");
    }
}