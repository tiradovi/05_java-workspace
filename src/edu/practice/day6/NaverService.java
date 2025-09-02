package edu.practice.day6;

public class NaverService {
    protected String serviceName;
    protected String userId;
    protected String userNickname;
    protected int userLevel;

    public NaverService() {

    }

    public NaverService(String serviceName, String userId, String userNickname, int userLevel) {
        this.serviceName = serviceName;
        this.userId = userId;
        this.userNickname = userNickname;
        this.userLevel = userLevel;
    }

    public void login() {
        System.out.println(getUserNickname() + "님이 " + getServiceName() + "에 로그인했습니다.");
    }

    public void logout() {
        System.out.println(getUserNickname() + "님이 " + getServiceName() + "에서 로그아웃했습니다.");
    }

    public void search() {
        System.out.println("상품을 검색합니다.");
    }

    public void writeContent() {
        System.out.println("리뷰를 작성합니다.");
    }

    public void showUserInfo() {
        System.out.println("===== 정보 =====");
        System.out.println("서비스명 : " + getServiceName());
        System.out.println("유저 아이디 : " + getUserId());
        System.out.println("유저 이름 : " + getUserNickname());
        System.out.println("유저 등급 : " + getUserLevel());
    
    }

    //게터 세터
    public String getServiceName() {
        return serviceName;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public int getUserLevel() {
        return userLevel;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public void setUserLevel(int userLevel) {
        this.userLevel = userLevel;
    }
}

