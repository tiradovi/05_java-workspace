package edu.exception.pack3.ex2.run;

import edu.exception.pack3.ex2.service.CustomExceptionService;

public class CustomExceptionRun {  // 메인 메소드 - 각 문제를 테스트해보세요
    public static void main(String[] args) {
        CustomExceptionService service = new CustomExceptionService();

        System.out.println("=== 문제 1: 키 입력 검증 ===");
        service.problem1();

        System.out.println("\n=== 문제 2: 비밀번호 길이 검사 ===");
        service.problem2();

        System.out.println("\n=== 문제 3: 시험 점수 검증 ===");
        service.problem3();

        System.out.println("\n=== 문제 4: 이름 입력 검증 ===");
        service.problem4();

        System.out.println("\n=== 문제 5: 장바구니 상품 개수 ===");
        service.problem5();

        System.out.println("\n🎉 모든 연습문제 완료!");
    }
}
