package edu.oop.method.ex;

import java.util.Scanner;

public class LibraryService {
    // 필드 인스턴스 변수 속성
    Scanner sc = new Scanner(System.in);
    LibraryMember m1 = null;
    LibraryMember m2 = null;
    LibraryMember m3 = null;


    public void displayMenu() {
        int input;
        int select;
        while (true) {
            System.out.println("""
                    === 멤버 관리 프로그램 ===
                    1. 회원 등록
                    2. 회원 정보 확인
                    3. 회원 정보 수정
                    4. 도서 대출
                    5. 도서 반납
                    6. 도서관 입장/퇴장
                    7. HTML 역량 비교하기
                    0. 도서관 통계 확인
                    """);
            input = sc.nextInt();
            switch (input) {
                case 1: // 회원 등록
                    System.out.println("회원을 등록할 슬롯을 선택하세요.");
                    System.out.print("1=member1 / 2=member2 / 3=member3: ");
                    select = sc.nextInt();
                    if (select == 1) m1 = createMember();
                    else if (select == 2) m2 = createMember();
                    else if (select == 3) m3 = createMember();
                    else {
                        System.out.println("다시 입력하세요 값의 범위는 1~3입니다.");
                        return;
                    }
                    break;

                case 2: // 회원 정보 확인
                    System.out.println("회원 정보를 확인할 번호를 선택하세요.");
                    System.out.print("1=member1 / 2=member2 / 3=member3: ");
                    select = sc.nextInt();
                    if (select == 1) System.out.println(memberInform(m1));
                    else if (select == 2) System.out.println(memberInform(m2));
                    else if (select == 3) System.out.println(memberInform(m3));
                    else {
                        System.out.println("다시 입력하세요 값의 범위는 1~3입니다.");
                        return;
                    }
                    break;

                case 3: // 회원 정보 수정
                    System.out.println("정보를 수정할 회원을 선택하세요.");
                    System.out.print("1=member1 / 2=member2 / 3=member3: ");
                    select = sc.nextInt();
                    if (select == 1) updateMemberInfo(m1);
                    else if (select == 2) updateMemberInfo(m2);
                    else if (select == 3) updateMemberInfo(m3);
                    else {
                        System.out.println("다시 입력하세요 값의 범위는 1~3입니다.");
                        return;
                    }
                    break;

                case 4: // 도서 대출
                    System.out.println("도서를 대출할 회원을 선택하세요.");
                    System.out.print("1=member1 / 2=member2 / 3=member3: ");
                    select = sc.nextInt();
                    if (select == 1) borrowBooks(m1);
                    else if (select == 2) borrowBooks(m2);
                    else if (select == 3) borrowBooks(m3);
                    else {
                        System.out.println("다시 입력하세요 값의 범위는 1~3입니다.");
                        return;
                    }
                    break;
                case 5: // 도서 반납
                    System.out.println("도서를 반납할 회원을 선택하세요.");
                    System.out.print("1=member1 / 2=member2 / 3=member3: ");
                    select = sc.nextInt();
                    if (select == 1) returnBooks(m1);
                    else if (select == 2) returnBooks(m2);
                    else if (select == 3) returnBooks(m3);
                    else {
                        System.out.println("다시 입력하세요 값의 범위는 1~3입니다.");
                        return;
                    }
                    break;
                case 6: // 도서관 입장/퇴장
                    System.out.println("1=입장 / 2=퇴장");
                    System.out.print("선택: ");
                    select = sc.nextInt();
                    if (select == 1) enterLibrary();
                    else if (select == 2) exitLibrary();
                    else {
                        System.out.println("다시 입력하세요 값의 범위는 1~2입니다.");
                        return;
                    }
                    break;

                case 7: // 도서관 통계 확인
                    System.out.println("=== 도서관 운영 통계 ===");
                    System.out.println("전체 회원 수 : " + LibraryMember.totalMemberCount + "명");
                    System.out.println("현재 방문자 수 : " + LibraryMember.currentVisitorCount + "명");
                    System.out.println("도서관 이름 : " + LibraryMember.LIBRARY_NAME);
                    System.out.println("도서관 운영 시간 : " + LibraryMember.OPENING_HOURS);
                    System.out.println("최대 대출 권수 : " + LibraryMember.MAX_BORROW_BOOKS);
                    System.out.println("최소 가입 연력 : " + LibraryMember.MIN_AGE_LIMIT);
                    break;
            }
        }
    }

    private LibraryMember createMember() {
        System.out.print("멤버 아이디 입력 :");
        String membershipId = sc.next();
        System.out.print("멤버 이름 입력 :");
        String memberName = sc.next();
        System.out.print("멤버 번호 입력 :");
        String phoneNumber = sc.next();
        System.out.print("멤버 나이 입력 :");
        int age = sc.nextInt();
        if (age < LibraryMember.MIN_AGE_LIMIT) {
            System.out.println(LibraryMember.MIN_AGE_LIMIT + "이하이므로 가입 불가");
            return null;
        }
        LibraryMember.totalMemberCount++;
        return new LibraryMember(membershipId, memberName, phoneNumber, age);
    }

    private String memberInform(LibraryMember member) {
        // String.format() = (static 메서드로 만들어짐) 정해진 형식에 원하는 값을 끼워넣어 문자열로 만듦
        // String.toString() = (일반 메서드로 만들어짐) 객체가 가진 데이터를 문자열로 파악하기 위해 만들어짐
        // 위와 같은 기능없이 밑에 처럼 출력 가능
        return member.getMembershipId() + "/" + member.getMemberName() + "/" + member.getPhoneNumber() + "/" + member.getAge();
    }

    private void updateMemberInfo(LibraryMember member) {
        System.out.print("변경할 이름 입력:");
        String newName = sc.next();

        member.setMemberName(newName);
        System.out.println("이름 수정 완료");
    }

    /**
     * 원하는 권수만큼 책 대출
     * 최대 대출은 10
     */
    private void borrowBooks(LibraryMember member) {
        System.out.print("대출할 책 권수 입력:");
        int bookCount = sc.nextInt();

        int result = member.getBorrowedBooks() + bookCount;
        if (result > LibraryMember.MAX_BORROW_BOOKS) {
            System.out.println("최대" + LibraryMember.MAX_BORROW_BOOKS + "권만 대출 가능");
        } else {
            member.setBorrowedBooks(result);
            System.out.println(bookCount + "권 대출 완료. 총 대출중인 도서 : " + member.getBorrowedBooks() + "권");
        }
    }

    private void returnBooks(LibraryMember member) {
        System.out.print("반납할 책 권수 입력:");
        int bookCount = sc.nextInt();

        int result = member.getBorrowedBooks() - bookCount;
        if (result < 0) {
            System.out.println("반납할 도서가 없습니다.");
        } else {
            member.setBorrowedBooks(result);
            System.out.println(bookCount + "권 반납 완료. 남은 대출 도서 : " + member.getBorrowedBooks() + "권");
        }
    }

    private void enterLibrary() {
        System.out.print("입장할 고객의 정보를 작성하세요");
        String name = sc.next();

        LibraryMember.currentVisitorCount++;
        System.out.println(name + "님이 도서관에 입장");
    }

    private void exitLibrary() {
        System.out.print("퇴장할 고객의 정보를 작성하세요");
        String name = sc.next();

        LibraryMember.currentVisitorCount--;
        System.out.println(name + "님이 도서관에 입장");
    }


    private void displayMemberInfo() {
    }


}

