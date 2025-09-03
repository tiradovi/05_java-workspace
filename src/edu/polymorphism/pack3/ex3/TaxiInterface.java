package edu.polymorphism.pack3.ex3;

public interface TaxiInterface {
    // 추상클래스 내부에 작성된 추상메서드를 interface로 기능만 분리
    void callTaxi();

    int calculateFare(int distance);

    void showDriverInfo();
}
