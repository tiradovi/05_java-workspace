package edu.oop.field.pack3.ex;

public class GuestHouseRun {
    public static void main(String[] args) {
        System.out.println("=== 게스트하우스 방문자 관리 시스템 ===");

        GuestHouse guest1 = new GuestHouse();
        GuestHouse guest2 = new GuestHouse();

        guest1.setGuestName("김여행");
        guest1.setCheckInDate("2025-08-27");
        guest1.setRoomNumber(201);

        guest2.setGuestName("박배낭");
        guest2.setCheckInDate("2025-08-28");
        guest2.setRoomNumber(202);

        // static 변수 확인
        // (totalCount 최초 1회 실행이기 때문에 guest1이라고 작성해서 호출이 아닌 GuestHouse로 호출)
        System.out.println("guest1이 보이는 총 방문자 수:" + guest1.totalCount); //GuestHouse.totalCount
        System.out.println("guest2이 보이는 총 방문자 수:" + guest2.totalCount); //GuestHouse.totalCount

        // 체크인
        guest1.checkIn();
        guest2.checkIn();
        System.out.println("guest1이 보이는 총 방문자 수:" + guest1.totalCount); //GuestHouse.totalCount
        System.out.println("guest2이 보이는 총 방문자 수:" + guest2.totalCount); //GuestHouse.totalCount

        // 올바른 Static 접근 방식
        System.out.println("전체 방문자 수:" + GuestHouse.totalCount);

        System.out.println("=== 게스트 하우스 공통 정보 ===");
        System.out.println("게스트하우스명: " + GuestHouse.GUESTHOUSE_NAME);
        System.out.println("Wi-Fi 비밀번호: " + GuestHouse.WIFI_PASSWORD);

        System.out.println("=== 게스트 하우스 운영 규정 (static final) ===");
        System.out.println("체크인 시간: " + GuestHouse.CHECK_IN_TIME);
        System.out.println("체크아웃 시간: " + GuestHouse.CHECK_OUT_TIME);
        System.out.println("최대 숙박일수: " + GuestHouse.MAX_STAY_DAYS);
        System.out.println("최소 숙박일수: " + GuestHouse.MIN_STAY_DAYS);

        System.out.println("=== 방문자별 개별 정보 ===");
        guest1.guestInfo();
        guest2.guestInfo();


    }
}

