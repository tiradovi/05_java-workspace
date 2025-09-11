package edu.variable.ex;

public class 더조은회사 {
    public static final String 회사이름 = "더조은회사";
    public static final String 주소 = "서울특별시 종로구 관철동";
    public static int 사원수 = 5;

    private String 이름;
    private String 부서;
    private int 연봉;

    public 더조은회사() {
    }

    public 더조은회사(String 이름, String 부서, int 연봉) {
        this.이름 = 이름;
        this.부서 = 부서;
        this.연봉 = 연봉;
    }

    @Override
    public String toString() {
        return "더조은회사{" +
                "이름='" + 이름 + '\'' +
                ", 부서='" + 부서 + '\'' +
                ", 연봉=" + 연봉 +
                '}';
    }
}
