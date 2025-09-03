package edu.polymorphism.pack3.ex3;

public class TaxiRun {
    public static void main(String[] args) {
// 카카오택시 사용
        KakaoTaxi kakao = new KakaoTaxi("김승객");
        kakao.showUserInfo();           // 공통 메서드
        kakao.setLocation("강남역");     // 공통 메서드

        kakao.callTaxi();               // 추상 메서드 구현
        kakao.showDriverInfo();         // 추상 메서드 구현
        int fare1 = kakao.calculateFare(5);  // 추상 메서드 구현
        kakao.payFare(fare1);           // 공통 메서드
        System.out.println();

        // 우버택시 사용
        UberTaxi uber = new UberTaxi("이고객");
        uber.showUserInfo();            // 공통 메서드
        uber.setLocation("홍대입구");    // 공통 메서드
        uber.callTaxi();                // 추상 메서드 구현
        uber.showDriverInfo();          // 추상 메서드 구현
        int fare2 = uber.calculateFare(5);   // 추상 메서드 구현
        uber.payFare(fare2);            // 공통 메서드

        System.out.println();

        // 타다 사용
        ImTada tada = new ImTada("박손님");
        tada.showUserInfo();            // 공통 메서드
        tada.setLocation("여의도역");    // 공통 메서드
        tada.callTaxi();                // 추상 메서드 구현
        tada.showDriverInfo();          // 추상 메서드 구현
        int fare3 = tada.calculateFare(5);   // 추상 메서드 구현
        tada.payFare(fare3);            // 공통 메서드
    }
}
