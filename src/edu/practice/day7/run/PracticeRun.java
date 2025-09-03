package edu.practice.day7.run;

import edu.practice.day7.model.KakaoMap;
import edu.practice.day7.model.KakaoPay;
import edu.practice.day7.model.KakaoService;
import edu.practice.day7.model.KakaoTalk;

/**
 * Java 7일차 상속, 추상화, 다형성 실습문제 실행 클래스
 * 각 문제의 주석을 해제하고 실행하세요
 */
public class PracticeRun {
    public static void main(String[] args) {
        System.out.println("=== Java 7일차 상속, 추상화, 다형성 실습문제 실행 ===");

        // 문제 1-4: 개별 클래스 테스트
        testKakaoTalk();
        testKakaoPay();
        testKakaoMap();

        // 다형성 테스트
        testPolymorphism();

        // 추상 클래스 테스트
        testAbstractClass();
    }

    public static void testKakaoTalk() {
        System.out.println("\n=== KakaoTalk 테스트 ===");

        KakaoTalk kakaoTalk = new KakaoTalk("카카오톡", "user01", "채팅왕", 150, true);

        kakaoTalk.showUserInfo();
        kakaoTalk.login();
        kakaoTalk.startService();
        kakaoTalk.addFriend("친구1");
        kakaoTalk.sendMessage("친구1", "안녕하세요!");
        kakaoTalk.sendNotification("새로운 메시지가 도착했습니다.");
        kakaoTalk.performSpecialAction();
        kakaoTalk.changeStatus(false);
        kakaoTalk.stopService();
        kakaoTalk.logout();
    }

    public static void testKakaoPay() {
        System.out.println("\n=== KakaoPay 테스트 ===");

        KakaoPay kakaoPay = new KakaoPay("카카오페이", "user02", "페이유저", 100000, "123-456-789");

        kakaoPay.showUserInfo();
        kakaoPay.login();
        kakaoPay.startService();
        kakaoPay.chargeBalance(50000);
        System.out.println("현재 잔액: " + kakaoPay.getBalance() + "원");
        kakaoPay.processPayment(15000);
        kakaoPay.transferMoney("친구", 20000);
        kakaoPay.sendNotification("결제가 완료되었습니다.");
        kakaoPay.performSpecialAction();
        kakaoPay.stopService();
        kakaoPay.logout();
    }

    public static void testKakaoMap() {
        System.out.println("\n=== KakaoMap 테스트 ===");

        KakaoMap kakaoMap = new KakaoMap("카카오맵", "user03", "여행러", "서울시 강남구", true);

        kakaoMap.showUserInfo();
        kakaoMap.login();
        kakaoMap.startService();
        kakaoMap.enableGPS();
        kakaoMap.searchLocation("롯데월드");
        kakaoMap.findRoute("강남역", "홍대입구");
        kakaoMap.sendNotification("목적지에 도착했습니다.");
        kakaoMap.performSpecialAction();
       
        kakaoMap.stopService();
        kakaoMap.logout();
    }

    public static void testPolymorphism() {
        System.out.println("\n=== 다형성 테스트 ===");

        // 다형성 배열
        KakaoService[] services = {
                new KakaoTalk("카카오톡", "user01", "채팅왕", 150, true),
                new KakaoPay("카카오페이", "user02", "페이유저", 100000, "123-456-789"),
                new KakaoMap("카카오맵", "user03", "여행러", "서울시 강남구", true)
        };

        System.out.println("=== 모든 서비스 시작 ===");
        for (KakaoService service : services) {
            System.out.println("서비스 타입: " + service.getServiceType());
            service.login();
            service.startService();
            service.performSpecialAction(); // 각 서비스마다 다른 동작
            System.out.println("instanceof KakaoService: " + (service instanceof KakaoService));
            System.out.println("instanceof KakaoTalk: " + (service instanceof KakaoTalk));
            System.out.println("instanceof KakaoPay: " + (service instanceof KakaoPay));
            System.out.println("instanceof KakaoMap: " + (service instanceof KakaoMap));
            System.out.println("---");
        }

        System.out.println("=== 모든 서비스 종료 ===");
        for (KakaoService service : services) {
            service.stopService();
            service.logout();
            System.out.println("---");
        }
    }

    public static void testAbstractClass() {
        System.out.println("\n=== 추상 클래스 테스트 ===");

        // KakaoService service = new KakaoService(); // 컴파일 에러! 추상 클래스는 인스턴스화 불가

        KakaoService kakaoTalk = new KakaoTalk("카카오톡", "user01", "채팅왕", 50, true);
        KakaoService kakaoPay = new KakaoPay("카카오페이", "user02", "페이유저", 200000, "987-654-321");

        System.out.println("=== 다형성으로 동일한 메서드 호출, 다른 결과 ===");

        // 같은 메서드 호출이지만 각각 다른 구현체의 메서드가 실행됨
        kakaoTalk.sendNotification("테스트 메시지 1");
        kakaoPay.sendNotification("테스트 메시지 2");

        kakaoTalk.performSpecialAction();
        kakaoPay.performSpecialAction();

        System.out.println("kakaoTalk 서비스 타입: " + kakaoTalk.getServiceType());
        System.out.println("kakaoPay 서비스 타입: " + kakaoPay.getServiceType());

        // 형변환 테스트
        if (kakaoTalk instanceof KakaoTalk) {
            KakaoTalk talk = (KakaoTalk) kakaoTalk;
            talk.addFriend("새친구");
        }

        if (kakaoPay instanceof KakaoPay) {
            KakaoPay pay = (KakaoPay) kakaoPay;
            System.out.println("페이 잔액: " + pay.getBalance() + "원");
        }
    }

    public static void testAllServices() {
        System.out.println("\n=== 전체 서비스 통합 테스트 ===");

        // 사용자가 여러 카카오 서비스를 이용하는 시나리오
        KakaoService[] userServices = {
                new KakaoTalk("카카오톡", "john123", "존", 200, true),
                new KakaoPay("카카오페이", "john123", "존", 500000, "123-456-789"),
                new KakaoMap("카카오맵", "john123", "존", "서울시 종로구", true)
        };

        System.out.println("=== 사용자 'john123'의 모든 서비스 이용 ===");

        for (KakaoService service : userServices) {
            service.login();
            service.startService();

            // 각 서비스별 특별한 기능 실행
            System.out.print("핵심 기능 실행: ");
            service.performSpecialAction();

            service.sendNotification(service.getServiceType() + " 서비스를 이용해주셔서 감사합니다!");
            service.stopService();
            service.logout();
            System.out.println();
        }
    }
}