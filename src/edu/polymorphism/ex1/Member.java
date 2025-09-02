package edu.polymorphism.ex1;

public class Member {
    // 회원 정보 관련 필드들
    private String memberName;
    private String memberId;
    private String memberEmail;
    private String memberPhone;
    private String memberAddress;
    private int memberAge;
    private String memberGrade; // 일반, VIP, VVIP
    private double memberPoint;

    public Member() {
    }

    public Member(String memberName, String memberId, String memberEmail, String memberPhone, String memberAddress, int memberAge, String memberGrade, double memberPoint) {
        this.memberName = memberName;
        this.memberId = memberId;
        this.memberEmail = memberEmail;
        this.memberPhone = memberPhone;
        this.memberAddress = memberAddress;
        this.memberAge = memberAge;
        this.memberGrade = memberGrade;
        this.memberPoint = memberPoint;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public String getMemberPhone() {
        return memberPhone;
    }

    public void setMemberPhone(String memberPhone) {
        this.memberPhone = memberPhone;
    }

    public String getMemberAddress() {
        return memberAddress;
    }

    public void setMemberAddress(String memberAddress) {
        this.memberAddress = memberAddress;
    }

    public int getMemberAge() {
        return memberAge;
    }

    public void setMemberAge(int memberAge) {
        this.memberAge = memberAge;
    }

    public String getMemberGrade() {
        return memberGrade;
    }

    public void setMemberGrade(String memberGrade) {
        this.memberGrade = memberGrade;
    }

    public double getMemberPoint() {
        return memberPoint;
    }

    public void setMemberPoint(double memberPoint) {
        this.memberPoint = memberPoint;
    }

    // 회원 관련 메서드들
    public void memberLogin() {
        System.out.println(getMemberName() + "님이 로그인했습니다.");
    }

    public void memberLogout() {
        System.out.println(getMemberName() + "님이 로그아웃했습니다.");
    }

    public void addMemberPoint(double point) {
        setMemberPoint(getMemberPoint() + point);
        System.out.println("포인트가 " + point + "점 적립되었습니다. 현재 포인트: " + getMemberPoint());
    }

    public void useMemberPoint(double point) {
        if (getMemberPoint() >= point) {
            setMemberPoint(getMemberPoint() - point);
            System.out.println("포인트 " + point + "점을 사용했습니다. 남은 포인트: " + getMemberPoint());
        } else {
            System.out.println("포인트가 부족합니다.");
        }
    }

    public void upgradeMemberGrade() {
        if (getMemberGrade().equals("일반")) {
            setMemberGrade("VIP");
        } else if (getMemberGrade().equals("VIP")) {
            setMemberGrade("VVIP");
        }
        System.out.println("회원등급이 " + getMemberGrade() + "로 승급되었습니다.");
    }

}
