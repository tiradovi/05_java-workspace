package edu.practice.day6;

/**
 * PracticeRun 클래스 수정 X
 * Java 6일차 상속 실습문제 실행 클래스
 * 각 문제의 주석을 해제하고 실행하세요
 */
public class PracticeRun {
    public static void main(String[] args) {
        System.out.println("=== Java 6일차 상속 실습문제 실행 ===");

        // 문제 1: NaverService 부모 클래스
        testPractice1();

        // 문제 2: NaverShopping 자식 클래스
        testPractice2();

        // 문제 3: NaverBlog 자식 클래스
        testPractice3();

        // 문제 4: NaverCafe 자식 클래스
        testPractice4();
    }

    public static void testPractice1() {
        System.out.println("\n=== 문제 1: NaverService 부모 클래스 테스트 ===");

        // 기본생성자로 생성
        NaverService service1 = new NaverService();
        service1.setServiceName("네이버");
        service1.setUserId("user01");
        service1.setUserNickname("테스트유저");
        service1.setUserLevel(1);

        // 매개변수생성자로 생성
        NaverService service2 = new NaverService("네이버기본", "user02", "기본유저", 5);

        service1.showUserInfo();
        System.out.println();
        service2.showUserInfo();

        service1.login();
        service1.logout();
    }

    public static void testPractice2() {
        System.out.println("\n=== 문제 2: NaverShopping 자식 클래스 테스트 ===");

        NaverShopping shopping = new NaverShopping("네이버쇼핑", "shopper01", "쇼핑러버", 5, 50000, 3);

        shopping.showUserInfo();
        shopping.login();
        shopping.search();
        shopping.writeContent();
        shopping.addToCart();
        shopping.buyProduct();
        shopping.logout();
    }

    public static void testPractice3() {
        System.out.println("\n=== 문제 3: NaverBlog 자식 클래스 테스트 ===");

        NaverBlog blog = new NaverBlog("네이버블로그", "blogger01", "일상기록가", 8, 150, 5000);

        blog.showUserInfo();
        blog.login();
        blog.search();
        blog.writeContent();
        blog.addNeighbor();
        blog.customizeTheme();
        blog.logout();
    }

    public static void testPractice4() {
        System.out.println("\n=== 문제 4: NaverCafe 자식 클래스 테스트 ===");

        NaverCafe cafe = new NaverCafe("네이버카페", "cafeuser01", "카페지기", 3, "정회원", 80);

        cafe.showUserInfo();
        cafe.login();
        cafe.search();
        cafe.writeContent();
        cafe.joinCafe();
        cafe.uploadFile();
        cafe.logout();
    }

    public static void testAll() {
        System.out.println("\n=== 전체 테스트: 상속 관계 확인 ===");

        NaverShopping shopping = new NaverShopping("네이버쇼핑", "shopper01", "쇼핑러버", 5, 50000, 3);
        NaverBlog blog = new NaverBlog("네이버블로그", "blogger01", "일상기록가", 8, 150, 5000);
        NaverCafe cafe = new NaverCafe("네이버카페", "cafeuser01", "카페지기", 3, "정회원", 80);

        System.out.println("shopping은 NaverService의 인스턴스입니다: " + (shopping instanceof NaverService));
        System.out.println("blog는 NaverService의 인스턴스입니다: " + (blog instanceof NaverService));
        System.out.println("cafe는 NaverService의 인스턴스입니다: " + (cafe instanceof NaverService));

        System.out.println("\n=== 오버라이딩된 메서드 테스트 ===");
        shopping.search();
        blog.search();
        cafe.search();

        shopping.writeContent();
        blog.writeContent();
        cafe.writeContent();
    }
}
