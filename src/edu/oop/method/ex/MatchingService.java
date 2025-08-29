package edu.oop.method.ex;

import java.util.Scanner;

/**
 * 결혼정보회사 회원 관리 서비스 클래스
 */
public class MatchingService {
    Scanner sc = new Scanner(System.in);
    MatchingMember matchingMember1 = new MatchingMember();

    public void displayMenu() {
        int input;

        while (true) {
            System.out.println("\n=== 더조은 결혼정보회사 관리 시스템 ===");
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 정보 확인");
            System.out.println("3. 회원 정보 수정");
            System.out.println("0. 프로그램 종료");
            System.out.println("=====================================");

            System.out.print("메뉴 선택: ");
            input = sc.nextInt();

            switch (input) {
                case 1:
                    registerMember();
                    break;
                case 2:
                    viewMemberInfo();
                    break;
                case 3:
                    updateMemberDetails();
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 번호를 선택하셨습니다. 다시 입력해주세요.");
            }
        }
    }

    // --- 기능 메서드 ---
    private void registerMember() {
        System.out.print("아이디 작성 : ");
        String newId = sc.nextLine();
        System.out.print("이름 작성 : ");
        String newName = sc.next();
        System.out.print("나이 작성 : ");
        int newAge = sc.nextInt();
        System.out.print("성별 작성 : ");
        char newGender = sc.next().charAt(0);
        System.out.print("직업 작성 : ");
        String newJob = sc.next();

        if (checkAgeValid()) {
            MatchingMember.totalMemberCount++;
            System.out.println(matchingMember1.getMemberName() + "님이 회원가입하셨습니다. (회원ID: " + matchingMember1.getMemberId() + ")");
        } else {
            System.out.println("가입 연령 기준(" + MatchingMember.MIN_AGE_LIMIT + "세 ~ " + MatchingMember.MAX_AGE_LIMIT + "세)에 맞지 않아 등록이 취소됩니다.");
        }
    }

    /**
     * 나이 확인 기능
     *
     * @return 회사에서 원하는 나이 범위가 아니면 가입불가
     */
    private boolean checkAgeValid() {
        return matchingMember1.getAge() >= MatchingMember.MIN_AGE_LIMIT && matchingMember1.getAge() <= MatchingMember.MAX_AGE_LIMIT;
    }

    private void viewMemberInfo() {
        System.out.println("--- 회원 정보 ---");
        System.out.printf("ID: %s, 이름: %s, 나이: %d세, 성별: %c, 직업: %s, 매칭점수: %d점\n",
                matchingMember1.getMemberId(), matchingMember1.getMemberId(), matchingMember1.getAge(), matchingMember1.getGender(), matchingMember1.getJob(), matchingMember1.getMatchingScore());
    }

    private void updateMemberDetails() {
        System.out.println("어떤 정보를 수정하시겠습니까?");
        System.out.print("1:이름 / 2:나이 / 3.직업>>");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
                System.out.print("이름 작성 : ");
                String updateName = sc.next();
                matchingMember1.setMemberName(updateName);
                System.out.println("이름 변경 완료");
                break;
            case 2:
                System.out.print("나이 작성 : ");
                int updateAge = sc.nextInt();
                sc.nextLine();
                matchingMember1.setAge(updateAge);
                System.out.println("나이 변경 완료");
                break;
            case 3:
                System.out.print("직업 작성 : ");
                String updateJob = sc.next();
                matchingMember1.setJob(updateJob);
                System.out.println("직업 변경 완료");
                break;
            default:
                System.out.println("잘못 입력");
        }
        viewMemberInfo();
    }
}


