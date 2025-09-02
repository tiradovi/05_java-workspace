package edu.polymorphism.pack1.model;

/*
Object 클래스
개발자가 만드는 모든 클래스는 extends Object를 한 상태에서 만들어짐
당연히 extends Object를 작성해야하기에 굳이 작성하지 않음

Object 개발자들이 기본적으로 필요하다 여기는 기능을 작성해놓은 문서
 Java 개발자 포함하여 모든 개발자들이 만드는 Class 변수 이름 뒤에 상속
 ex) toString() : System.out.println()과 같은 형태로 모든 필드의 정보를 출력하기윟 작성하는 코드를 단축하여 출력
 ex) equals() : 두 객체가 같은 클래스 주소를 가리키는가와 같은 비교
 


  부모 클래스 역할
*/
public class SmartPhone {
    // 인스턴스 변수 필드 속성
    protected String display;
    protected String newsAgency;
    protected String ap;

    // 기본 생성자
    public SmartPhone() {
    }

    // 매개변수 생성자
    public SmartPhone(String display, String newsAgency, String ap) {
        this.display = display;
        this.newsAgency = newsAgency;
        this.ap = ap;
    }


    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getNewsAgency() {
        return newsAgency;
    }

    public void setNewsAgency(String newsAgency) {
        this.newsAgency = newsAgency;
    }

    public String getAp() {
        return ap;
    }

    public void setAp(String ap) {
        this.ap = ap;
    }

    // 우리가 showInfo 와 같은 출력문을 하나씩 작성하지 않아도 알아서 출력
    // 즉 Object 클래스의 toString 사용

    @Override
    public String toString() {
        return "SmartPhone{" +
                "display='" + display + '\'' +
                ", newsAgency='" + newsAgency + '\'' +
                ", ap='" + ap + '\'' +
                '}';
    }
}

// 회원가입 HTML에서 소비자가 작성한 데이터를 DB에 저장하기 위해 Java를 통해 저장
// DB에 저장된 데이터 확인

// A. 생성자를 이용해서 특정 데이터를 사용할 수 있도록 전달
// B. set변수이름 or 변수내에 저장되어 있는 데이터
// C. main 이나 service에서 객체로 생성

// C-> B-> A