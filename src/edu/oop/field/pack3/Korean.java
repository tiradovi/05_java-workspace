package edu.oop.field.pack3;

public class Korean {
    /* 필드 */

    // static 이 붙은 필드는 프로그램 실행시
    // static 메모리 영역에 할당된다.

    /*
    static 필드 앞에 public을 작성하는 이유
    -> 공유가 목적이기 때문
     */
    public static int nationalCode = 82;

    // static + final
    public static final String ANCESTOR = "단군 할아버지";

    private String name; // 이름
    private String id;   // 주민등록번호

    // 일반 초기화 블럭
    // 객체 생성 시 필드를 {} 내부의 값으로 초기화
    // 실행 시점 : 객체가 생성될 때 마다 실행
    // -> new Korean() 할 때 마다 실행
    {
        name = "홍길동";
        id = "981212-1234567";
    }

    // static 초기화 블럭
    // static 붙어있으면 프로그램 실행시 1회만 읽음
    // new 상관 없음
    static {
        nationalCode = 10;
    }

    // 반환형 void : 오직 실행 뿐 전달 값X
    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    // 반환형 String : 문자열 반환
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    /**
     * return
     * return; 중지
     * return 전달 값; 전달값 반환
     * 가장 밑에 쓰는거 뿐 아니라 특정 조건에서 반환도 가능
     */

    /**************************** int *********************************/
    public int method1() {
        // public 자료형이 int이브로 반환값도 int
        return 0;
    }

    public int method2() {
        int b = 1;
        return b;
    }

    public int method3(int c) {
        c = 3;
        return c;
    }

    /**************************** String *********************************/
    public String method4() {
        // public 자료형 String 반환값도 String
        return "안녕하세요";
    }

    public String method5() {
        String d = "반갑습니다";
        return d;
    }

    public String method6(String e) {
        return e;
    }


}
