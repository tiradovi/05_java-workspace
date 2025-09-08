package practice.exception.ex;

import java.io.File;
import java.util.Scanner;

public class ExceptionService {
    public void method1() {
        int a = 10;
        int b = 0;

        try {
            System.out.println("a/b: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("0 으로 숫자를 나눌 수 없습니다.");
        } catch (Exception e) {
            System.out.println("개발자가 예상못한 오류");
        }
    }

    public void method2() {
        int[] arr = {1, 2, 3};

        try {
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("현재 목록 개수:" + arr.length);
        } catch (Exception e) {
            System.out.println("개발자가 예상못한 오류");
        } finally {
            System.out.println("프로그램 종료");
        }
    }

    public void method3() {
        String file = "파일이름.txt";
        // 파일이름 확인, 확장자명 확인
        // 확장자표기인 .이 존재하지않으면 예외 발생
        int dotIndex = file.lastIndexOf('.');
        try {
            String 파일이름 = file.substring(0, dotIndex);
            String 확장자이름 = file.substring(dotIndex);

            System.out.println("파일이름 확인 : " + 파일이름);
            System.out.println("확장자명 확인 : " + 확장자이름);
            System.out.println("파일이름과 확장자명 확인 검사를 성공했습니다.");
        } catch (StringIndexOutOfBoundsException e) {
            // 파일이름txt에서 . 이 존재하지 않는 경우 dotIndex가 -1로 찾을 수 없음

            System.out.println("file 이름 내에 .이 존재하지 않습니다.");
        }
    }

    public void method4() {
        Scanner sc = new Scanner(System.in);
        String file = sc.nextLine();
        // 파일이름 확인, 확장자명 확인
        // 확장자표기인 .이 존재하지않으면 예외 발생

        try {
            int dotIndex = file.lastIndexOf('.');
            System.out.println(dotIndex);
            if (dotIndex + 1 == file.length()) {
                throw new IllegalArgumentException("존재하는 확장자 명칭이 없습니다.");
            }

            String 파일이름 = file.substring(0, dotIndex);
            String 확장자이름 = file.substring(dotIndex);

            System.out.println("파일이름 확인 : " + 파일이름);
            System.out.println("확장자명 확인 : " + 확장자이름);
            System.out.println("파일이름과 확장자명 확인 검사를 성공했습니다.");
        } catch (IllegalArgumentException e) {
            System.out.println("존재하는 확장자 명칭이 없습니다.");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("file 이름 내에 .이 존재하지 않습니다.");
        }
    }

    public void method5() {
        String DBID = "user1";
        String DBPW = "pass1";

        Scanner sc = new Scanner(System.in);
        System.out.print("ID : ");
        String UserId = sc.nextLine();
        System.out.print("PW : ");
        String UserPw = sc.nextLine();
        try {
            if (!DBID.equals(UserId)) {
            /*
            sout은 확인
            throw new 가 기능 정지
             */
                throw new UserNotFoundException();
            }
            if (!DBPW.equals(UserPw)) {
                throw new InvalidPasswordException();
            }
            System.out.println(UserId + "님이 로그인");
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        } catch (InvalidPasswordException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("개발자가 모르는 문제 발생");
            File log = new File("log.txt");
        }

    }
}
