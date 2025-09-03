package edu.polymorphism;

public interface 인터페이스 {
    /**
     * 멤버 인스턴스 변수 속성을 작성할 때 임의의 공간이 설정된 속성이 아닌
     * 데이터가 들어있는 상수 이름만 생성 가능
     * private 불가능
     * String name ="김개발"; 이런 리터럴 형태만 가능
     * 인터페이스에서 작성하는 모든 필드 명칭은 자동으로 public static final 처리
     * <p>
     * static = main 실행시 모든 상황에서 접근 가능한 위치 반드시 public
     * final = 값을 변경할 수 없는 상수
     */

    // public 생략 가능 : private, default, protected 사용이 불가능하기 때문
    // 무조건 나중에 재설정해야하는 기능만 나열하기 때문

    // public void/자료형 기능명칭(); {}가 붙은 메서드는 작성 불가능
    void fly();

    public void land();
    // public void map(){}; 불가
}
