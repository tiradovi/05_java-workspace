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

        // 필수 생성자를 활용하여 데이터 저장하고 저장된 데이터 확인
        // 필수 생성자는 Account 클래스에서 활용할 데이터를 외부에서 매개변수 데이터로 필히 넣어줘야하는 매개변수 작성 공간
        // public        Account(String name,         String accountNumber,   long balance, String password) 순서 일치하는지 확인
        Account a2 = new Account("김길동", "234-241-424", 5000000, "1234");
        System.out.println("===== a2 계좌 정보 =====");
        System.out.println(a2.getName());
        System.out.println(a2.getAccountNumber());
        System.out.println(a2.getBalance());
        System.out.println(a2.getPassword());
    }
}
