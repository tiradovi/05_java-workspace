package edu.oop.constructor;

/**
 * 오버로딩(Over Loading : 과적)
 * <p>
 * - 한 클래스 내에 동일한 이름의 메서드를 여러 개 작성하는 법
 * <p>
 * - 같은 이름의 메서드가 수행하는 기능은 기본적으로 같으나
 * 전달받은 매개 변수에 따라 동작이 조금씩 다른경우 상황별로 정의
 * <p>
 * 조건:
 * 1) 메서드 이름이 같아야한다.
 * 2) 매개 변수 개수, 타입, 순서가 하나라도 달라야한다.
 */

/*
SpringBoot 
@ 기본생성자   : 세터를 이용해서 html에서 가져온 데이터를 담기
@ 매개변수생성자 : 세터를 이용하지 않고 html에서 가져온 데이터를 담기
@ 게터  : DB에 저장된 데이터를 자바에서 가져옴
@ 세터  : DB에 저장하기 전에 자바에서 소비자가 작성한 이름, 이메일과 같은 데이터를 가짐
 */
public class Member {
    // 필드 (== 멤버 변수)
    // 클래스 변수 : static 이 붙은 변수
    // --> static 메모리에 할당될 때 클래스명.변수명으로 할당
    // 개발자가 작성한 특정 행위를 new 클래스이름() 을 통해
    // 객체로 생성, 지속적으로 사용하기 위해 특정 명칭을 붙여 활용
    // 다만 클래스 변수의 경우 객체에 붙은 명칭을 활용하는 것이 아닌
    // class파일이름. 을 이용하여 변수 이름 사용

    // 인스턴스 변수 : static 이 없는 변수
    // --> 객체가 생성될 때 heap 메모리에 할당되기 때문에
    // Member m = new Member(); 로 객체를 만들 때
    // 호출하여 m이라는 이름으로 객체로 불러온 문서 사용

    private String memberId;
    private String memberName;
    private String memberPw;
    private int memberAge;

    // 생성자 : 객체 생성 시 필드 초기화 + 특정 기능 수행하는 일종의 메서드

    // 작성 규칙
    // 1) 반환형 없음
    // 2) 생성자 이름은 클래스 이름과 동일

    /* 기본 생성자 */
    // 매개 변수가 없는 형태
    // - 생성자가 하나도 작성되지 않는 경우 자바에서 자동으로 생성
    // 개발자가 작성하지 않아도 자동으로 생성
    // 필수생성자가 존재하면 기본생성자를 자동생성하지 않으므로 생성 필요

    /* 기본생성자 O 매개변수 생성자 존재 O  정상 작동*/
    /* 기본생성자 O 매개변수 생성자 존재 X  정상 작동*/
    /* 기본생성자 X 매개변수 생성자 존재 O  비정상 */
    /* 기본생성자 X 매개변수 생성자 존재 X  정상 작동*/

    public Member() {
    }

    public Member(String memberId, String memberName, String memberPw, int memberAge) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.memberPw = memberPw;
        this.memberAge = memberAge;
        // html에서 가져온 데이터를 담고있는 변수이름과 Member클래스에서 작성한 변수 이름과 일치하는 공간
    }

    public Member(String memberName) {
        this.memberName = memberName;
    }
}
