package edu.practice.day7.model;

public class KakaoMap extends KakaoService {
    private String currentLocation;
    private boolean isGPSEnabled;

    public KakaoMap() {
        super();
    }

    public KakaoMap(String serviceName, String userId, String userNickname) {
        super(serviceName, userId, userNickname, true);
    }

    public KakaoMap(String serviceName, String userId, String userNickname, String currentLocation, boolean isGPSEnabled) {
        super(serviceName, userId, userNickname, true);
        this.currentLocation = currentLocation;
        this.isGPSEnabled = isGPSEnabled;
    }

    @Override
    public void showUserInfo() {
        super.showUserInfo();
        if ("MAP".equals(getServiceType())) {
            System.out.println("현재 위치: " + currentLocation);
            System.out.println("GPS 상태: " + (isGPSEnabled ? "활성화" : "비활성화"));
        }
    }

    @Override
    public void startService() {
        if ("MAP".equals(getServiceType())) {
            System.out.println("카카오맵을 시작합니다. 길찾기 서비스가 준비되었습니다!");
            if (isGPSEnabled) {
                System.out.println("GPS가 활성화되었습니다.");
            }
        }
    }

    @Override
    public void stopService() {
        if ("MAP".equals(getServiceType())) {
            System.out.println("카카오맵을 종료합니다. 경로 기록을 저장했습니다.");
        }
    }

    @Override
    public String getServiceType() {
        return "MAP";
    }

    @Override
    public void performSpecialAction() {
        System.out.println("길찾기 기능");
    }

    @Override
    public void sendNotification(String message) {
        if ("MAP".equals(getServiceType())) {
            System.out.println("[카카오맵 알림] " + message);
        }
    }

    @Override
    public void receiveNotification(String message) {
        if ("MAP".equals(getServiceType())) {
            System.out.println("[카카오맵에서 알림 수신] " + message);
        }
    }

    public void searchLocation(String location) {
        if (!"MAP".equals(getServiceType())) {
            System.out.println("카카오맵 서비스가 아닙니다!");
            return;
        }
        System.out.println("'" + location + "' 검색 결과를 표시합니다.");
    }

    public void findRoute(String start, String end) {
        if (!"MAP".equals(getServiceType())) {
            System.out.println("카카오맵 서비스가 아닙니다!");
            return;
        }
        System.out.println(start + "에서 " + end + "까지의 경로를 찾습니다.");
        System.out.println("예상 소요시간: 25분, 거리: 8.5km");
    }

    public void enableGPS() {
        if (!"MAP".equals(getServiceType())) {
            System.out.println("카카오맵 서비스가 아닙니다!");
            return;
        }
        this.isGPSEnabled = true;
        System.out.println("GPS를 활성화했습니다. 현재 위치: " + currentLocation);
    }

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
}