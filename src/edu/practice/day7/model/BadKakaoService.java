package edu.practice.day7.model;

/**
 * BadKakaoService - 상속, 추상화, 다형성을 사용하지 않은 나쁜 설계 예시
 * 모든 카카오 서비스를 하나의 클래스에 구현 (안티패턴)
 */
public class BadKakaoService {
    private String serviceName;
    private String userId;
    private String userNickname;
    private boolean isLoggedIn;

    // KakaoTalk 관련 필드
    private int friendCount;
    private boolean isOnline;

    // KakaoPay 관련 필드
    private int balance;
    private String bankAccount;

    // KakaoMap 관련 필드
    private String currentLocation;
    private boolean isGPSEnabled;

    // 서비스 타입 구분용
    private String serviceType; // "TALK", "PAY", "MAP"

    // 기본 생성자
    public BadKakaoService() {
        this.isLoggedIn = false;
        this.serviceType = "UNKNOWN";
    }

    // KakaoTalk용 생성자
    public BadKakaoService(String serviceName, String userId, String userNickname,
                           int friendCount, boolean isOnline) {
        this.serviceName = serviceName;
        this.userId = userId;
        this.userNickname = userNickname;
        this.friendCount = friendCount;
        this.isOnline = isOnline;
        this.isLoggedIn = false;
        this.serviceType = "TALK";
    }

    // KakaoPay용 생성자
    public BadKakaoService(String serviceName, String userId, String userNickname,
                           int balance, String bankAccount, boolean isPay) {
        this.serviceName = serviceName;
        this.userId = userId;
        this.userNickname = userNickname;
        this.balance = balance;
        this.bankAccount = bankAccount;
        this.isLoggedIn = false;
        this.serviceType = "PAY";
    }

    // KakaoMap용 생성자
    public BadKakaoService(String serviceName, String userId, String userNickname,
                           String currentLocation, boolean isGPSEnabled, boolean isMap) {
        this.serviceName = serviceName;
        this.userId = userId;
        this.userNickname = userNickname;
        this.currentLocation = currentLocation;
        this.isGPSEnabled = isGPSEnabled;
        this.isLoggedIn = false;
        this.serviceType = "MAP";
    }

    // 로그인 메서드
    public void login() {
        this.isLoggedIn = true;
        System.out.println(userNickname + "님이 " + serviceName + "에 로그인했습니다.");
    }

    // 로그아웃 메서드
    public void logout() {
        this.isLoggedIn = false;
        System.out.println(userNickname + "님이 " + serviceName + "에서 로그아웃했습니다.");
    }

    // 사용자 정보 표시
    public void showUserInfo() {
        System.out.println("=== 사용자 정보 ===");
        System.out.println("서비스: " + serviceName);
        System.out.println("아이디: " + userId);
        System.out.println("닉네임: " + userNickname);
        System.out.println("로그인 상태: " + (isLoggedIn ? "로그인" : "로그아웃"));
        System.out.println("서비스 타입: " + serviceType);

        // 각 서비스별 추가 정보 표시 (if문 남발)
        if ("TALK".equals(serviceType)) {
            System.out.println("친구 수: " + friendCount);
            System.out.println("온라인 상태: " + (isOnline ? "온라인" : "오프라인"));
        } else if ("PAY".equals(serviceType)) {
            System.out.println("잔액: " + balance + "원");
            System.out.println("연결 계좌: " + bankAccount);
        } else if ("MAP".equals(serviceType)) {
            System.out.println("현재 위치: " + currentLocation);
            System.out.println("GPS 상태: " + (isGPSEnabled ? "활성화" : "비활성화"));
        }
    }

    // 서비스 시작 (모든 서비스를 하나의 메서드에서 처리)
    public void startService() {
        if ("TALK".equals(serviceType)) {
            System.out.println("카카오톡을 시작합니다. 친구들과 채팅을 시작하세요!");
            if (isOnline) {
                System.out.println("온라인 상태로 접속했습니다.");
            }
        } else if ("PAY".equals(serviceType)) {
            System.out.println("카카오페이를 시작합니다. 간편결제 서비스가 준비되었습니다!");
            System.out.println("현재 잔액: " + balance + "원");
        } else if ("MAP".equals(serviceType)) {
            System.out.println("카카오맵을 시작합니다. 길찾기 서비스가 준비되었습니다!");
            if (isGPSEnabled) {
                System.out.println("GPS가 활성화되었습니다.");
            }
        } else {
            System.out.println("알 수 없는 서비스입니다.");
        }
    }

    // 서비스 종료 (모든 서비스를 하나의 메서드에서 처리)
    public void stopService() {
        if ("TALK".equals(serviceType)) {
            System.out.println("카카오톡을 종료합니다.");
            this.isOnline = false;
        } else if ("PAY".equals(serviceType)) {
            System.out.println("카카오페이를 종료합니다. 결제 내역을 저장했습니다.");
        } else if ("MAP".equals(serviceType)) {
            System.out.println("카카오맵을 종료합니다. 경로 기록을 저장했습니다.");
        } else {
            System.out.println("서비스를 종료합니다.");
        }
    }

    // 알림 보내기 (모든 서비스에서 동일하지만 각각 구현)
    public void sendNotification(String message) {
        if ("TALK".equals(serviceType)) {
            System.out.println("[카카오톡 알림] " + message);
        } else if ("PAY".equals(serviceType)) {
            System.out.println("[카카오페이 알림] " + message);
        } else if ("MAP".equals(serviceType)) {
            System.out.println("[카카오맵 알림] " + message);
        }
    }

    // 알림 받기 (모든 서비스에서 동일하지만 각각 구현)
    public void receiveNotification(String message) {
        if ("TALK".equals(serviceType)) {
            System.out.println("[카카오톡에서 알림 수신] " + message);
        } else if ("PAY".equals(serviceType)) {
            System.out.println("[카카오페이에서 알림 수신] " + message);
        } else if ("MAP".equals(serviceType)) {
            System.out.println("[카카오맵에서 알림 수신] " + message);
        }
    }

    // KakaoTalk 관련 메서드들 (serviceType 체크 필수)
    public void sendMessage(String friendName, String message) {
        if (!"TALK".equals(serviceType)) {
            System.out.println("카카오톡 서비스가 아닙니다!");
            return;
        }
        System.out.println(friendName + "에게 메시지 전송: " + message);
    }

    public void addFriend(String friendName) {
        if (!"TALK".equals(serviceType)) {
            System.out.println("카카오톡 서비스가 아닙니다!");
            return;
        }
        this.friendCount++;
        System.out.println(friendName + "를 친구로 추가했습니다. (총 친구 수: " + friendCount + ")");
    }

    public void changeStatus(boolean online) {
        if (!"TALK".equals(serviceType)) {
            System.out.println("카카오톡 서비스가 아닙니다!");
            return;
        }
        this.isOnline = online;
        System.out.println("상태를 " + (online ? "온라인" : "오프라인") + "으로 변경했습니다.");
    }

    // KakaoPay 관련 메서드들 (serviceType 체크 필수)
    public boolean processPayment(int amount) {
        if (!"PAY".equals(serviceType)) {
            System.out.println("카카오페이 서비스가 아닙니다!");
            return false;
        }
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원 결제 완료. 잔액: " + balance + "원");
            return true;
        } else {
            System.out.println("잔액이 부족합니다. 현재 잔액: " + balance + "원");
            return false;
        }
    }

    public void refund(int amount) {
        if (!"PAY".equals(serviceType)) {
            System.out.println("카카오페이 서비스가 아닙니다!");
            return;
        }
        balance += amount;
        System.out.println(amount + "원 환불 완료. 잔액: " + balance + "원");
    }

    public int getBalance() {
        if (!"PAY".equals(serviceType)) {
            System.out.println("카카오페이 서비스가 아닙니다!");
            return -1;
        }
        return balance;
    }

    public void chargeBalance(int amount) {
        if (!"PAY".equals(serviceType)) {
            System.out.println("카카오페이 서비스가 아닙니다!");
            return;
        }
        balance += amount;
        System.out.println(amount + "원 충전 완료. 잔액: " + balance + "원");
    }

    public void transferMoney(String recipient, int amount) {
        if (!"PAY".equals(serviceType)) {
            System.out.println("카카오페이 서비스가 아닙니다!");
            return;
        }
        if (processPayment(amount)) {
            System.out.println(recipient + "에게 " + amount + "원 송금 완료");
        }
    }

    // KakaoMap 관련 메서드들 (serviceType 체크 필수)
    public void searchLocation(String location) {
        if (!"MAP".equals(serviceType)) {
            System.out.println("카카오맵 서비스가 아닙니다!");
            return;
        }
        System.out.println("'" + location + "' 검색 결과를 표시합니다.");
    }

    public void findRoute(String start, String end) {
        if (!"MAP".equals(serviceType)) {
            System.out.println("카카오맵 서비스가 아닙니다!");
            return;
        }
        System.out.println(start + "에서 " + end + "까지의 경로를 찾습니다.");
        System.out.println("예상 소요시간: 25분, 거리: 8.5km");
    }

    public void enableGPS() {
        if (!"MAP".equals(serviceType)) {
            System.out.println("카카오맵 서비스가 아닙니다!");
            return;
        }
        this.isGPSEnabled = true;
        System.out.println("GPS를 활성화했습니다. 현재 위치: " + currentLocation);
    }

    // Getter/Setter 메서드들 (모든 필드에 대해 필요)
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

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    // KakaoTalk getter/setter
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

    // KakaoPay getter/setter
    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    // KakaoMap getter/setter
    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public boolean isGPSEnabled() {
        return isGPSEnabled;
    }

    public void setGPSEnabled(boolean GPSEnabled) {
        isGPSEnabled = GPSEnabled;
    }

    // 테스트용 메인 메서드
    public static void main(String[] args) {
        System.out.println("=== BadKakaoService 테스트 - 나쁜 설계의 예 ===\n");

        // KakaoTalk 객체 생성
        System.out.println("=== KakaoTalk 테스트 ===");
        BadKakaoService kakaoTalk = new BadKakaoService("카카오톡", "user01", "채팅왕", 150, true);
        kakaoTalk.showUserInfo();
        kakaoTalk.login();
        kakaoTalk.startService();
        kakaoTalk.addFriend("친구1");
        kakaoTalk.sendMessage("친구1", "안녕하세요!");
        kakaoTalk.sendNotification("새로운 메시지가 도착했습니다.");
        kakaoTalk.changeStatus(false);
        kakaoTalk.stopService();
        kakaoTalk.logout();

        System.out.println("\n" + "=".repeat(50) + "\n");

        // KakaoPay 객체 생성
        System.out.println("=== KakaoPay 테스트 ===");
        BadKakaoService kakaoPay = new BadKakaoService("카카오페이", "user02", "페이유저", 100000, "123-456-789", true);
        kakaoPay.showUserInfo();
        kakaoPay.login();
        kakaoPay.startService();
        kakaoPay.chargeBalance(50000);
        System.out.println("현재 잔액: " + kakaoPay.getBalance() + "원");
        kakaoPay.processPayment(15000);
        kakaoPay.transferMoney("친구", 20000);
        kakaoPay.sendNotification("결제가 완료되었습니다.");
        kakaoPay.stopService();
        kakaoPay.logout();

        System.out.println("\n" + "=".repeat(50) + "\n");

        // KakaoMap 객체 생성
        System.out.println("=== KakaoMap 테스트 ===");
        BadKakaoService kakaoMap = new BadKakaoService("카카오맵", "user03", "여행러", "서울시 강남구", true, true);
        kakaoMap.showUserInfo();
        kakaoMap.login();
        kakaoMap.startService();
        kakaoMap.enableGPS();
        kakaoMap.searchLocation("롯데월드");
        kakaoMap.findRoute("강남역", "홍대입구");
        kakaoMap.sendNotification("목적지에 도착했습니다.");
        kakaoMap.stopService();
        kakaoMap.logout();

        System.out.println("\n" + "=".repeat(50) + "\n");

        // 잘못된 사용 예시
        System.out.println("=== 잘못된 사용 예시 ===");
        System.out.println("카카오톡 객체에서 결제 기능 호출 시도:");
        kakaoTalk.processPayment(1000); // 실패

        System.out.println("카카오페이 객체에서 친구 추가 시도:");
        kakaoPay.addFriend("친구2"); // 실패

        System.out.println("카카오맵 객체에서 메시지 전송 시도:");
        kakaoMap.sendMessage("친구3", "안녕!"); // 실패

        System.out.println("\n=== 이런 설계의 문제점들 ===");
        System.out.println("1. 하나의 클래스가 너무 많은 책임을 가짐 (단일 책임 원칙 위배)");
        System.out.println("2. 코드 중복이 많음 (DRY 원칙 위배)");
        System.out.println("3. 새로운 서비스 추가 시 기존 클래스 수정 필요 (개방-폐쇄 원칙 위배)");
        System.out.println("4. 메서드 호출 시마다 serviceType 검사 필요");
        System.out.println("5. 유지보수가 어려움");
        System.out.println("6. 다형성 활용 불가능");
        System.out.println("7. 인터페이스를 통한 계약 정의 불가능");
    }
}