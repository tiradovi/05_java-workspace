package edu.variable.ex;

public class 더나은회사 {
    public static final String 회사이름 = "더나은회사";
    public static final String 주소 = "서울특별시 중구 명동";
    public static int 사원수 = 20;

    private String 이름;
    private String 부서;
    private int 연봉;
    private String 취미;

    public 더나은회사() {
    }

    public 더나은회사(String 이름, String 부서, int 연봉, String 취미) {
        this.이름 = 이름;
        this.부서 = 부서;
        this.연봉 = 연봉;
        this.취미 = 취미;
    }

    @Override
    public String toString() {
        return "더나은회사{" +
                "이름='" + 이름 + '\'' +
                ", 부서='" + 부서 + '\'' +
                ", 연봉=" + 연봉 +
                ", 취미='" + 취미 + '\'' +
                '}';
    }
}
