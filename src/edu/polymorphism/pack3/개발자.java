package edu.polymorphism.pack3;

/**
 * 직원 자식 클래스
 * implements 는 단독 사용가능
 */
public class 개발자 extends 직원 implements 업무수행기능 {
    // 만약 상속이 필요없는 경우에도 필요한 기능들이 있는 경우 인터페이스로 설정 가능
    private String 프로그래밍언어;

    public 개발자(String name, int salary, String 프로그래밍언어) {
        super(name, "dev", salary);
        this.프로그래밍언어 = 프로그래밍언어;
    }

    public String get프로그래밍언어() {
        return 프로그래밍언어;
    }

    public void set프로그래밍언어(String 프로그래밍언어) {
        this.프로그래밍언어 = 프로그래밍언어;
    }

    @Override
    public void work() {
        System.out.println(getName() + "개발자가 " + get프로그래밍언어() + "로 코딩하고 있습니다.");
    }

    @Override
    public void meeting() {
        System.out.println(getName() + "개발자가 개발 회의에 참가합니다.");
    }

    public void 코딩() {
        System.out.println(getName() + "개발자가 새로운 기능을 만들고 있습니다.");
    }

}
