package edu.practice.day9;

/**
 * Java 9일차 Map, 컬렉션 실습문제 실행 클래스
 * 각 문제의 주석을 해제하고 실행하세요
 */
public class PracticeRun {
    public static void main(String[] args) {
        PracticeRun runner = new PracticeRun();

        System.out.println("=== Java 9일차 Map, 컬렉션 실습문제 실행 ===");

        // 각 메서드 주석을 해제하고 실행해보세요
        runner.productManager();
        // runner.memberPointManager();
        // runner.employeeManager();
        // runner.informationManagementSystem();
        // runner.allSystemsIntegration();
    }

    public void productManager() {
        System.out.println("\n=== ProductManager 테스트 ===");

        ProductManager pm = new ProductManager();

        System.out.println("--- 초기 상품 목록 ---");
        pm.displayAllProducts();

        System.out.println("\n--- 상품 검색 테스트 ---");
        pm.searchProduct("P001");
        pm.searchProduct("P999");

        System.out.println("\n--- 상품 추가 테스트 ---");
        pm.addProduct("P004", "맥북프로", 2500000);
        pm.addProduct("P001", "갤럭시S24", 1200000); // 중복 테스트

        System.out.println("\n--- 상품 삭제 테스트 ---");
        pm.removeProduct("P003");
        pm.removeProduct("P999"); // 없는 상품 테스트

        System.out.println("\n--- 최종 상품 목록 ---");
        pm.displayAllProducts();
    }

//    public void memberPointManager() {
//        System.out.println("\n=== MemberPointManager 테스트 ===");
//
//        MemberPointManager mpm = new MemberPointManager();
//
//        System.out.println("--- 초기 회원 목록 ---");
//        mpm.displayAllMembers();
//
//        System.out.println("\n--- 신규 회원 등록 테스트 ---");
//        mpm.registerMember("user04");
//        mpm.registerMember("user01"); // 중복 테스트
//
//        System.out.println("\n--- 포인트 적립 테스트 ---");
//        mpm.earnPoints("user01", 500);
//        mpm.earnPoints("user99", 100); // 없는 회원
//
//        System.out.println("\n--- 포인트 사용 테스트 ---");
//        mpm.usePoints("user02", 1000);
//        mpm.usePoints("user02", 1000); // 포인트 부족 테스트
//
//        System.out.println("\n--- 최종 회원 목록 ---");
//        mpm.displayAllMembers();
//    }
//
//
//    public void informationManagementSystem() {
//        System.out.println("\n=== 종합 정보 관리 시스템 시뮬레이션 ===");
//
//        System.out.println("디지털 정보 관리 시스템\n");
//
//        // 아침: 직원 출근 및 업무 시작
//        System.out.println("=== 09:00 - 업무 시작 ===");
//        EmployeeManager em = new EmployeeManager();
//        em.searchEmployee("E001");
//        System.out.println("김개발 직원이 출근하여 상품 관리 업무를 시작합니다.");
//
//        // 오전: 새 상품 등록
//        System.out.println("\n=== 10:00 - 상품 관리 ===");
//        ProductManager pm = new ProductManager();
//        pm.addProduct("P004", "애플워치", 450000);
//        pm.displayAllProducts();
//
//        // 점심시간: 직원 급여 정보 확인
//        System.out.println("\n=== 12:00 - 급여 정보 확인 ===");
//        em.displayByDepartment("IT");
//        em.updateSalary("E001", 4800);
//
//        // 오후: 신규 상품 할인 이벤트 준비
//        System.out.println("\n=== 14:00 - 이벤트 준비 ===");
//        pm.addProduct("P005", "무선이어폰", 180000);
//        System.out.println("신규 상품 출시 이벤트를 준비합니다!");
//
//        // 저녁: 회원 포인트 적립 이벤트
//        System.out.println("\n=== 18:00 - 포인트 관리 ===");
//        MemberPointManager mpm = new MemberPointManager();
//        mpm.earnPoints("user01", 200);
//        mpm.earnPoints("user02", 300);
//        mpm.usePoints("user01", 500);
//
//        System.out.println("\n정보 관리 시스템 업무 완료");
//    }
//
//    public void allSystemsIntegration() {
//        System.out.println("\n=== 통합 시스템 운영 ===");
//
//        System.out.println("모든 관리 시스템을 통합 운영합니다!\n");
//
//        // 모든 매니저 생성
//        ProductManager pm = new ProductManager();
//        MemberPointManager mpm = new MemberPointManager();
//        EmployeeManager em = new EmployeeManager();
//
//        System.out.println("=== 1단계: 시스템 현황 확인 ===");
//        pm.displayAllProducts();
//        mpm.displayAllMembers();
//
//        System.out.println("\n=== 2단계: 신규 데이터 추가 ===");
//        pm.addProduct("P006", "게이밍키보드", 120000);
//        mpm.registerMember("user05");
//
//        System.out.println("\n=== 3단계: 비즈니스 로직 실행 ===");
//        mpm.earnPoints("user05", 1000); // 신규 회원 적립
//        pm.searchProduct("P006"); // 신상품 조회
//
//        System.out.println("\n=== 4단계: 최종 시스템 현황 ===");
//        System.out.println("상품 관리:");
//        pm.displayAllProducts();
//        System.out.println("\n회원 관리:");
//        mpm.displayAllMembers();
//
//
//        System.out.println("\n통합 시스템 운영 완료");
//    }
}
