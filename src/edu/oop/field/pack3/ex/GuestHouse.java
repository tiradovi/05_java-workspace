package edu.oop.field.pack3.ex;

public class GuestHouse {
    /* 필드 */
    // static 필드는 static 메모리에 할당 공유가 목적

    public static int totalCount = 0;// 전체 방문자 수

    // static + final
    public static final String GUESTHOUSE_NAME = "서울 게스트 하우스";
    public static final String WIFI_PASSWORD = "welcome2025";
    public static final String CHECK_IN_TIME = "15:00";
    public static final String CHECK_OUT_TIME = "11:00";
    public static final int MAX_STAY_DAYS = 30;
    public static final int MIN_STAY_DAYS = 1;

    private String guestName;
    private String checkInDate;
    private int roomNumber;

    // 초기화 블럭
    // - 객체 생성시 필드를 {} 내부의 값으로 초기화
    {
        guestName = "익명 방문자";
        checkInDate = "2025-08-28";
        roomNumber = 101;
    }

    // static 초기화 블럭
    // - 최초 1회 필드를 {} 내부의 값으로 초기화
    static {
        totalCount = 0;
        System.out.println("=== " + GUESTHOUSE_NAME + " 시스템 시작 ===");
    }

    // 자동 생성- 기본 생성자
    public GuestHouse() {
    }
    // 필수 생성자는 자동 생성 X, 필수 생성자를 만들었다면 기본생성자도 생성 필요


    // setter 데이터 보관
    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    // getter 데이터 전달
    public String getGuestName() {
        return guestName;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    // 메서드

    // 체크인 - 방문자 수 증가
    public void checkIn() {
        totalCount++;
        System.out.println(guestName + " 님이 " + roomNumber + " 호실에 체크인 하였습니다.");
    }

    // 메서드 방문자 정보 출력
    public void guestInfo() {
        System.out.println("=================");
        System.out.println("방문자명 :" + guestName);
        System.out.println("체크인날짜 :" + checkInDate);
        System.out.println("객실번호 :" + roomNumber + "호");

    }
}
