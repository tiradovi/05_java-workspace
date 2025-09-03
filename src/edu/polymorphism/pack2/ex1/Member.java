package edu.polymorphism.pack2.ex1;

/*
부모 클래스
일반 회원, Vip회원
 */
public abstract class Member {
    // 필드 인스턴스변수 속성
    protected String memberId;
    protected String memberName;
    protected String memberEmail;

    // 기능들 () 붙으면 메서드

    // 디폴트(기본)생성자 메서드
    public Member() {
    }

    // 파라미터(매개변수) 생성자 메서드
    public Member(String memberId, String memberName, String memberEmail) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.memberEmail = memberEmail;
    }

    // 게터, 세터
    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    // 수정 없는 공통 실행 기능 메서드
    public void login() {
        System.out.println(getMemberName() + " 님이 로그인 했습니다.");
    }

    public void logout() {
        System.out.println(getMemberName() + " 님이 로그아웃 했습니다.");
    }

    // 비추상 클래스에 추상 메서드가 있습니다 
    // -> public 과 class 사이에 abstract가 존재하지 않는데 추상메서드를 사용하는 경우
    public abstract double 할인율();

    public abstract void 쿠폰과혜택();
}
