package edu.inheritance.ex0;
// 상속 : 부모의 코드를 물려 받아 자식이 자신의 것처럼 활용

// 상속 키워드 : extends (확장하다)
//               -> 부모 코드를 자식이 물려 받아 자식의 전체 크기가 증가

public class 개발자 extends 직원 {
    // 필드
    private String computer;

    // 메서드
    // 기본 생성자
    public 개발자(String eName, int eId, double baseSalary, String department, String computer) {
        /*
          super() : 직원에 존재하는 생성자를 가리킴
         - 자식 객체 생성시 부모 생성자를 호출하는 생성자

          1) super(): 직원 클래스 안에 존재하는 기본 생성자
         2) super(매개변수) : 직원 클래스 안에 존재하는 파라미터 생성자 의미
         */
        super(eName, eId, baseSalary, department);
        /*
        this 대신 super를 사용해서 매개변수로 전달받은 eName, eId, baseSalary, department 사용 처리
        this.eName = eName;
        this.eId = eId;
        this.baseSalary = baseSalary;
        this.department = department;
         */
        this.computer = computer;
    }

    public String getComputer() {
        return computer;
    }

    public void setComputer(String computer) {
        this.computer = computer;
    }

    @Override
    public void info() {
        super.info();// 직원 클래스에서 기존 info()기능에 작성한 텍스트 호출
        System.out.println("컴퓨터 : " + getComputer());
    }

    // 개발자 클래스에서만 다른 기능을 하도록 변경
    @Override
    public void work() {
        System.out.println(geteName() + "개발자가 " + getComputer() + "로 코딩을 합니다.");
    }

    // 아래는 직원클래스에서 사용하지 않고 개발자 클래스에서만 사용하는 기능 추가
    public void codeReview() {
        System.out.println(geteName() + "개발자가 코드 리뷰를 진행합니다.");
    }

}

