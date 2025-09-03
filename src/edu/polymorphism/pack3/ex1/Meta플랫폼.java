package edu.polymorphism.pack3.ex1;

public abstract class Meta플랫폼 {
    protected String 플랫폼이름;
    protected String 유저아이디;

    public Meta플랫폼() {
    }

    public Meta플랫폼(String 플랫폼이름, String 유저아이디) {
        this.플랫폼이름 = 플랫폼이름;
        this.유저아이디 = 유저아이디;
    }

    // 게터,세터
    public String get플랫폼이름() {
        return 플랫폼이름;
    }

    public void set플랫폼이름(String 플랫폼이름) {
        this.플랫폼이름 = 플랫폼이름;
    }

    public String get유저아이디() {
        return 유저아이디;
    }

    public void set유저아이디(String 유저아이디) {
        this.유저아이디 = 유저아이디;
    }

    // 기타 메서드 : 보통 기타 메서드의 경우 또한 service로 분류해서 작성
    public void login() {
        System.out.println(유저아이디 + " 님이 " + 플랫폼이름 + "에 로그인했습니다.");
    }

    public void logout() {
        System.out.println(유저아이디 + " 님이 " + 플랫폼이름 + "에 로그아웃했습니다.");
    }

    abstract void post(String content);

    abstract void like(String postId);
}
