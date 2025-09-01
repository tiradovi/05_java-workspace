package edu.inheritance;

public class 직원 {
    private String eName;
    private int eId;
    private double baseSalary;
    private String department;

    // 메서드 필드 이외에는 거의 다 기능 = 메서드의 종류들
    // 생성자 매개변수 생성자


    public 직원(String eName, int eId, double baseSalary, String department) {
        this.eName = eName;
        this.eId = eId;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    // 공통 기능
    public void info() {
        System.out.println("=== 직원 정보 ===");
        System.out.println("이름 : " + eName);
        System.out.println("사번 : " + eId);
        System.out.println("부서 : " + department);
        System.out.println("기본급 : " + baseSalary + "원");

    }
}
