package edu.polymorphism.pack3;

public class 직원프로그램실행 {
    public static void main(String[] args) {
        관리자 m = new 관리자("김팀장", 6000);
        개발자 d = new 개발자("박개발", 5000, "Java");

        System.out.println("=== 직원 정보 ===");
        System.out.println(m.toString());
        System.out.println(d.toString());

        System.out.println("=== 업무 수행 ===");
        m.work();
        d.work();

        System.out.println("=== 회의 참석===");
        m.meeting();
        d.meeting();

        System.out.println("=== 고유 업무 ===");
        m.예산관리();
        d.코딩();

    }
}
