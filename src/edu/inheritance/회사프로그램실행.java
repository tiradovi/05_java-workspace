package edu.inheritance;

public class 회사프로그램실행 {
    public static void main(String[] args) {
        System.out.println(" ===== 더조은 직원 관리시스템 =====");

        // 직원 총 3명 대표제외
        개발자 dev1 = new 개발자("김개발", 1001, 4000000, "Java", "맥북");
        개발자 dev2 = new 개발자("이개발", 1002, 4000000, "Html", "윈도우");

        디자이너 des1 = new 디자이너("박디자인", 3001, 300000, "design", "Figma");

        매니저 man1 = new 매니저("임매니저", 4001, 300000, "manager", 4, 500000);
        // dev1의 정보출력
        dev1.info();
        dev1.work();
        dev1.codeReview();
        // dev2의 정보출력
        dev2.info();
        dev2.work();
        dev2.codeReview();
        // des1의 정보출력
        des1.info();
        des1.work();
        // man1의 정보출력
        man1.info();
        man1.work();
        man1.meeting();
    }
}
