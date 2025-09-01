package edu.inheritance.ex3;

/**
 * 구글 서비스 부모 클래스
 */
public class GoogleService {
    // private 와 다르게 protected는 자식클래스에서 접근 가능
    protected String serviceName;
    protected String userEmail;
    protected String userName;
    protected String accountType;
    // 상속은 확장의 개념이므로 protected 사용

    // 기본 생성자

    public GoogleService() {
    }

    public GoogleService(String serviceName, String userEmail, String userName, String accountType) {
        this.serviceName = serviceName;
        this.userEmail = userEmail;
        this.userName = userName;
        this.accountType = accountType;
    }


    // 공통 변경X 메서드
    public void login() {
        System.out.println(getUserName() + "님이 " + getServiceName() + "에 로그인했습니다");
    }

    public void logout() {
        System.out.println(getUserName() + "님이 " + getServiceName() + "에 로그아웃했습니다");
    }

    public void syncData() {
        System.out.println(getServiceName() + "에서 동기화를 진행합니다.");
    }

    public void showUserInfo() {
        System.out.println("=== 사용자 정보 ===");
        System.out.println("서비스 : " + getServiceName());
        System.out.println("이메일 : " + getUserEmail());
        System.out.println("이름 : " + getUserName());
        System.out.println("계정타입 : " + getAccountType());
        System.out.println("====================");
    }

    // 자식 클래스에서 오버라이딩할 메서드
    public void search() {
        System.out.println(getServiceName() + " 에서 검색합니다");
    }

    public void share() {
        System.out.println(getServiceName() + " 에서 공유합니다.");
    }

    // 게터, 세터
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
}
