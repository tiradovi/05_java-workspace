package edu.oop.method.ex;

/**
 * 결혼정보회사 회원 데이터를 관리하는 클래스
 */
public class MatchingMember {
    // --- Static (정적) 필드: 클래스에 속하며 모든 객체가 공유 ---
    public static int totalMemberCount;
    public static int successfulMatchCount;

    // --- 공통 규정 (final: 변경 불가능한 상수) ---
    public static final String COMPANY_NAME = "더조은 결혼정보회사";
    public static final String SERVICE_PHONE = "1588-5678";
    public static final int MAX_MATCHING_SCORE = 100;
    public static final int MIN_AGE_LIMIT = 20;
    public static final int MAX_AGE_LIMIT = 65;

    // --- Instance (인스턴스) 필드: 객체마다 개별적으로 가지는 데이터 ---
    private String memberId;
    private String memberName;
    private int age;
    private char gender;
    private String job;
    private int matchingScore;

    // --- 초기화 블록 ---
    static {
        totalMemberCount = 0;
        successfulMatchCount = 0;
        System.out.println("=== " + COMPANY_NAME + " 시스템 시작 ===");
        System.out.println("고객센터: " + SERVICE_PHONE + "\n");
    }

    {
        memberId = "TMP001";
        memberName = "임시회원";
        age = 20;
        gender = '미';
        job = "미정";
        matchingScore = 0;
    }

    // --- 생성자 ---
    public MatchingMember() {
    }

    public MatchingMember(String memberId, String memberName, int age, char gender, String job) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.age = age;
        this.gender = gender;
        this.job = job;
    }

    // --- Getter/Setter 메서드 ---
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getMatchingScore() {
        return matchingScore;
    }


}
