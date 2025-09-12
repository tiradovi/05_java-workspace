package edu.variable.ex;


import static edu.variable.ex.더나은회사.사원수;
import static edu.variable.ex.더조은회사.주소;
import static edu.variable.ex.더조은회사.회사이름;

public class 직원서비스 {

    public static void 회사정보() {
        // 동일한 변수이름이 존재함
        /*
        클래스 명칭 미사용시 아래와 같이 데이터 혼합이 발생 가능
        
        import static edu.variable.ex.더나은회사.사원수;
        import static edu.variable.ex.더조은회사.주소;
        import static edu.variable.ex.더조은회사.회사이름;

        따라서 위와 같이 import 해서 특정 데이터를 가져오는 것이 아니라
        static이 작성된 (클래스명칭.static변수명칭) 과 같은 형태로 어떤 문서인지 작성하는 것
         */
        System.out.println("회사 : " + 회사이름);
        System.out.println("주소 : " + 주소);
        System.out.println("총사원수 : " + 사원수);
    }

    public static void 더조은회사정보() {
        System.out.println("회사 : " + 회사이름);
        System.out.println("주소 : " + 주소);
        System.out.println("총사원수 : " + 더조은회사.사원수);
    }

    public static void 더나은회사정보() {
        System.out.println("회사 : " + 더나은회사.회사이름);
        System.out.println("주소 : " + 더나은회사.주소);
        System.out.println("총사원수 : " + 사원수);
    }
}
