package edu.oop.field.pack3;

public class StaticTestRun {
    public static void main(String[] args) {

        // Korean 객체 생성
        Korean k1 = new Korean();
        Korean k2 = new Korean();

        System.out.println("k1의 nationalCode :" + k1.nationalCode);
        System.out.println("k2의 nationalCode :" + k2.nationalCode);

        // k1을 이용해서 nationalCode 변경
        k1.nationalCode = 1;
        System.out.println("---- nationalCode 변경 후 ----");
        System.out.println("k1의 nationalCode :" + k1.nationalCode);
        System.out.println("k2의 nationalCode :" + k2.nationalCode);
        /* static 변수는 공유 변수
        static {
        nationalCode = 10;
        }
        */
        System.out.println("우리의 조상 :" + Korean.ANCESTOR);

    }
}
