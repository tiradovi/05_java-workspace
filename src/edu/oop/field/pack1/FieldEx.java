package edu.oop.field.pack1;

public class FieldEx {
    // 필드(Field)
    // - 객체의 속성을 나타냄

    // - 필드 == 멤버 변수

    // * 작성법 *
    // [접근제한자] [예약어] 자료형 변수명 [=초기값];

    // 접근 제한자별 필드 선언

    public int publicValue = 10;
    protected int protectedValue = 10;
    /* default */
    int defaultValueOne = 10;
    int defaultValueTwo = 10;
    // 제어자 default는 허용되지 않습니다.
    private int privateValue = 10;

    // 모든 접근제한자가 같은 클래스 내부에 접근 가능하기 때문에 오류 없음

    public void method1() {
        System.out.println(publicValue);
        System.out.println(protectedValue);
        System.out.println(defaultValueOne);
        System.out.println(defaultValueTwo);
        System.out.println(privateValue);
    }
}
