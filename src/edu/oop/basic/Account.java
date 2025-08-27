package edu.oop.basic;

/**
 * 계좌 클래스 추후 DB와 Java를 연결할 변수 명칭을 작성하는 클래스
 */
public class Account {
    // [캡슐화] : 객체의 속성(필드) 직접 접근을 제한하는 것이 원칙
    // private : 현재 객체만 접근 가능한, 사적인, 개인적인

    // 속성에 직접 접근할 수 없으므로 간접 접근할 수 있는 기능
    // 속성(값)

    private String name;          // 이름(예금주)
    private String accountNumber; // 계좌 번호
    private long balance;         // 잔액
    private String password;      // 비밀 번호

    // 단축키 Alt + Insert 클릭시 생성자 getter, setter를 만들어주는 기능 실행
    // 메서드(기능) - 생성자
    //              생성자 - 기본
    //              생성자 - 필수

    // c 형태로 되어있는 edu.oop.basic.Account 를 선택해서 생성
    // 메서드(기능) - 기본 생성자
    public Account() {
    }

    //  c 형태 아래에 존재하는 f 형태에서 필요한 속성 명칭을 선택해서 생성
    // 메서드(기능) - 필수 생성자
    public Account(String name, String accountNumber, long balance, String password) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.password = password;
    }

    // 메서드(기능) - setter : html에서 사용자에게 전달받은 값을 자바의 변수이름 내부에 저장하는 역할
    /*
     * Setter 주의점
     * if(계좌잔액 < 0 ){
     * // 잔액은 음수가 될 수 없습니다.
     * return; // 계좌 잔액에 일치하지 않는 데이터를 돌려보내기
     * }
     *
     * setter 내부에서 if문이나 조건을 통해 데이터를 저장하는 형태를 작성하는 것은 지양
     * */

    /*
        private String name;

        public void setName(String [html에서 데이터 전달받아올 이름]) {
        this.name = [html에서 데이터 전달받아올 이름];
        }

        public void setName(String name) {
        this.name = name;
        }

     setName : private String name 변수 명칭에 [html에서 데이터 전달받아올 이름] 데이터 저장 메서드
     this.name:  private String name
     name : [html에서 데이터 전달받아올 이름]

     가능한 [html에서 데이터 전달받아올 이름] 은 this.[이름]과 같아야 함
     */

    public void setName(String name) {
        this.name = name;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // 메서드(기능) - getter : DB나 이메일인증키와 같은 데이터를 사용자에게 전달하는 역할

    /**
     *
     * @return : 메서드 내부에서 (특정 데이터, setter로 저장된 데이터, 리터럴 형태로 변수이름에 직접적으로 작성된 데이터)를 반환
     * <p>
     * public [리턴할 변수이름의 자료형] get[변수이름](){
     * return [데이터를 전달할 변수이름];
     * }
     */
    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public String getPassword() {
        return password;
    }

    // 생성자 기본, 필수, getter setter 이외 개발자가 필요로 하는 메서드 기능 작성

    /**
     * 비밀번호와 출금할 금액을 전달 받아와 조건에 맞으면 잔액에서 차감 후 현재 잔액을 출력
     * <p>
     * 조건 1) 비밀번호가 일치하지 않으면 "비밀번호 불일치" 출력
     * 조건 2) 출금할 금액이 잔액보다 크면 "잔액 부족" 출력
     *
     * @param pw      : 클라이언트가 작성한 비밀번호를 가지고 있는 매개변수이름
     * @param amount: 클라이언트가 출금 요청한 숫자의 데이터를 가지고 있는 출금할 금액의 매개변수이름
     */
    public void withdraw(String pw, long amount) {
        // 자바에서
        // 기본 자료형 비교는 ==
        // 객체(참조형) 비교는 A.equals(B)

        // 현재 계좌 비밀번호(password)와
        // 전달 받은 비밀번호(pw)가 같을 경우 true/ 다르면 false
        if (!password.equals(pw)) {
            System.out.println("비밀번호 불일치");
            return;
        }

        // 출금할 금액 amount가
        // 잔액 balance 보다 크면
        if (amount > balance) {
            System.out.println("잔액이 부족합니다.");
            return;
        }

        this.balance -= amount;
        System.out.printf("%s 계좌에서 %d원 출금 : \n ", accountNumber, amount);
        System.out.println(name + "의 현재 잔액 : " + balance);

    }
}
