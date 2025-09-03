package edu.polymorphism.pack3;

public class 관리자 extends 직원 implements 업무수행기능 {

    public 관리자(String name, int salary) {
        super(name, "manager", salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + "매니저가 팀을 관리하고 있습니다.");
    }

    @Override
    public void meeting() {
        System.out.println(getName() + "매니저가 임원 회의에  참석합니다.");
    }

    public void 예산관리() {
        System.out.println(getName() + "매니저가 팀 회식을 위하여 팀 예산을 관리합니다.");
    }
}
