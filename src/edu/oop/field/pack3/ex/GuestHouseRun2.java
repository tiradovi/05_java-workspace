package edu.oop.field.pack3.ex;

import java.util.Scanner;

public class GuestHouseRun2 {
    public static void main(String[] args) {
        System.out.println("=== 게스트하우스 방문자 관리 시스템 ===");

        System.out.println("전체 방문자 수:" + GuestHouse.totalCount);

        System.out.println("=== 게스트 하우스 공통 정보 ===");
        System.out.println("게스트하우스명: " + GuestHouse.GUESTHOUSE_NAME);
        System.out.println("Wi-Fi 비밀번호: " + GuestHouse.WIFI_PASSWORD);

        System.out.println("=== 게스트 하우스 운영 규정 (static final) ===");
        System.out.println("체크인 시간: " + GuestHouse.CHECK_IN_TIME);
        System.out.println("체크아웃 시간: " + GuestHouse.CHECK_OUT_TIME);
        System.out.println("최대 숙박일수: " + GuestHouse.MAX_STAY_DAYS);
        System.out.println("최소 숙박일수: " + GuestHouse.MIN_STAY_DAYS);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("고객정보 계속 입력하려면 0이외 숫자 입력");
            System.out.println("방문자명 :");
            String name = sc.nextLine();
            if (name.equals("0")) {
                break;
            }
            System.out.println("체크인날짜 :");
            String date = sc.nextLine();

            System.out.println("객실번호 :");
            int room = sc.nextInt();
            sc.nextLine();

            GuestHouse guest = new GuestHouse();
            guest.setGuestName(name);
            guest.setCheckInDate(date);
            guest.setRoomNumber(room);
            /*
            필요한 타입: class 파일 자료형
                int
            제공된 타입: 준 자료형
               String
             
             방법 1: 클래스에 작성한 데이터 타입 변경 [추천X]
             방법 2: 전달할 데이터 타입 수정
             */

            // 체크인
            guest.checkIn();
            guest.guestInfo();
        }
        sc.close();
    }
}

