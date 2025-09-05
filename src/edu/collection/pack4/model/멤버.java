package edu.collection.pack4.model;

public class 멤버 {
    public static final String 우리회사이름 = "[멤버]";
    public static String 회사사이트방문자수 = "5명";

    private String 멤버이름;
    private String 멤버핸드폰번호;
    private String 멤버이메일;

    public 멤버() {
    }

    public 멤버(String 멤버이름, String 멤버핸드폰번호, String 멤버이메일) {
        this.멤버이름 = 멤버이름;
        this.멤버핸드폰번호 = 멤버핸드폰번호;
        this.멤버이메일 = 멤버이메일;
    }

    public String get멤버이름() {
        return 멤버이름;
    }

    public void set멤버이름(String 멤버이름) {
        this.멤버이름 = 멤버이름;
    }

    public String get멤버핸드폰번호() {
        return 멤버핸드폰번호;
    }

    public void set멤버핸드폰번호(String 멤버핸드폰번호) {
        this.멤버핸드폰번호 = 멤버핸드폰번호;
    }

    public String get멤버이메일() {
        return 멤버이메일;
    }

    public void set멤버이메일(String 멤버이메일) {
        this.멤버이메일 = 멤버이메일;
    }
}
