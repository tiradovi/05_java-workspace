package edu.oop.basic;

/**
 * 계좌 실행 클래스
 */
public class AccountRun {
    public static void main(String[] args) {
        Account a1 = new Account(); // Account()는 기본 생성자를 호출해서 객체 생성

        // private이 설정된 값과 안된 값 접근 가능 여부 확인


        // private을 적용한 변수는 외부에서 확인 불가
        // a1.accountNumber="1234";    불가
        // 반드시 setter를 통할 것

        // 간접 접근 기능 이용 세팅
        a1.setName("홍길동");

        // 간접 접근 기능 이용 출력
        a1.getName(); // 가져오기만 함
        System.out.println(a1.getName());// 출력

        a1.setAccountNumber("123-456-789");
        a1.setPassword("7890");

        /*
        Account 에서 accountNumber는 String 따라서 저장 또한 String이어야 함

        int a1Num = a1.getAccountNumber();  X

        String a1Num = a1.getAccountNumber(); O

        private String accountNumber;

        */
        String a1Num = a1.getAccountNumber();
        String a1Password = a1.getPassword();
        System.out.println(a1Num);
        System.out.println(a1Password);

    }
}
