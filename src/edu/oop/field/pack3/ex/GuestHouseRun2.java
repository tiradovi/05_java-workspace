package edu.oop.field.pack3.ex;

import java.util.Scanner;

public class GuestHouseRun2 {
    public static void main(String[] args) {
        System.out.println("=== 게스트하우스 방문자 관리 시스템 ===");
        Scanner sc = new Scanner(System.in);
        GuestHouse guest = new GuestHouse();
        while (true) {
            if (sc.nextInt() == 0) {
                break;
            }

            guest.setGuestName(sc.nextLine());
            guest.setCheckInDate(sc.nextLine());
            guest.setRoomNumber(sc.nextInt());

        }


        // 체크인
        guest.checkIn();

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
        guest.guestInfo();


    }
}

