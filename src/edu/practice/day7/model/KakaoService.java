package edu.practice.day7.model;

/**
 * 부모 클래스 이지만
 * 부모 클래스를 상속받은
 * 자식 클래스들 이 반드시 작성해야하는 기능이 포함되어 있는 클래스
 */
public abstract class KakaoService {
    protected String serviceName;
    protected String userId;
    protected String userNickname;
    protected boolean isLoggedIn;

    public KakaoService() {
        this.isLoggedIn = false;
    }

    public KakaoService(String serviceName, String userId, String userNickname, boolean isLoggedIn) {
        this.serviceName = serviceName;
        this.userId = userId;
        this.userNickname = userNickname;
        this.isLoggedIn = isLoggedIn;
    }

    // 오버라이드 없는 일반 메서드
    public void login() {
        isLoggedIn = true;
        System.out.println(userNickname + "님이 " + serviceName + "에 로그인했습니다.");
    }

    public void logout() {
        isLoggedIn = false;
        System.out.println(userNickname + "님이 " + serviceName + "에서 로그아웃했습니다.");
    }

    public void showUserInfo() {
        System.out.println("=== 사용자 정보 ===");
        System.out.println("서비스명: " + serviceName);
        System.out.println("아이디: " + userId);
        System.out.println("닉네임: " + userNickname);
        System.out.println("로그인 여부: " + (isLoggedIn ? "로그인됨" : "로그아웃됨"));
    }

    // 추상 메서드
    public abstract void startService();

    public abstract void stopService();

    public abstract String getServiceType();

    public abstract void performSpecialAction();

    public abstract void sendNotification(String message);

    public abstract void receiveNotification(String message);

    //게터 세터
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        isLoggedIn = loggedIn;
    }
}