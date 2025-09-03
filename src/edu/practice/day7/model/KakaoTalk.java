package edu.practice.day7.model;

public class KakaoTalk extends KakaoService {
    private int friendCount;
    private boolean isOnline;

    public KakaoTalk() {
        super();
    }

    public KakaoTalk(String serviceName, String userId, String userNickname) {
        super(serviceName, userId, userNickname, true);
    }

    public KakaoTalk(String serviceName, String userId, String userNickname, int friendCount, boolean isOnline) {
        super(serviceName, userId, userNickname, true);
        this.friendCount = friendCount;
        this.isOnline = isOnline;
    }

    @Override
    public void showUserInfo() {
        super.showUserInfo();
        if ("TALK".equals(getServiceType())) {
            System.out.println("친구 수: " + friendCount);
            System.out.println("온라인 상태: " + (isOnline ? "온라인" : "오프라인"));
        }
    }

    @Override
    public void startService() {
        if ("TALK".equals(getServiceType())) {
            System.out.println("카카오톡을 시작합니다. 친구들과 채팅을 시작하세요!");
            if (isOnline) {
                System.out.println("온라인 상태로 접속했습니다.");
            }
        }
    }

    @Override
    public void stopService() {
        if ("TALK".equals(getServiceType())) {
            System.out.println("카카오톡을 종료합니다.");
            this.isOnline = false;
        }
    }

    @Override
    public String getServiceType() {
        return "TALK";
    }

    @Override
    public void performSpecialAction() {
        System.out.println("메시지 전송 기능");
    }

    @Override
    public void sendNotification(String message) {
        if ("TALK".equals(getServiceType())) {
            System.out.println("[카카오톡 알림] " + message);
        }
    }

    @Override
    public void receiveNotification(String message) {
        if ("TALK".equals(getServiceType())) {
            System.out.println("[카카오톡에서 알림 수신] " + message);
        }
    }

    public void sendMessage(String friendName, String message) {
        if (!"TALK".equals(getServiceType())) {
            System.out.println("카카오톡 서비스가 아닙니다!");
            return;
        }
        System.out.println(friendName + "에게 메시지 전송: " + message);
    }

    public void addFriend(String friendName) {
        if (!"TALK".equals(getServiceType())) {
            System.out.println("카카오톡 서비스가 아닙니다!");
            return;
        }
        this.friendCount++;
        System.out.println(friendName + "를 친구로 추가했습니다. (총 친구 수: " + friendCount + ")");
    }

    public void changeStatus(boolean online) {
        if (!"TALK".equals(getServiceType())) {
            System.out.println("카카오톡 서비스가 아닙니다!");
            return;
        }
        this.isOnline = online;
        System.out.println("상태를 " + (online ? "온라인" : "오프라인") + "으로 변경했습니다.");
    }

    public int getFriendCount() {
        return friendCount;
    }

    public void setFriendCount(int friendCount) {
        this.friendCount = friendCount;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }
}