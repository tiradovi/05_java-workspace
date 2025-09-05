package edu.exception.pack1.ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PracticeException1 {
    Scanner sc = new Scanner(System.in);

    // 단축키 : 코드 블록 드래그 후 : ctrl + alt + t 작성
    // if 부터 try-catch while 등의 코드 블록에 대한 상황 설정 가능
    public void method1() {

        try {
            System.out.print("정수 입력 1 :");
            int input1 = sc.nextInt();
            System.out.print("정수 입력 2 :");
            int input2 = sc.nextInt();

            System.out.println(input1 / input2);
        } catch (ArithmeticException e) {
            System.out.println("0으로 숫자를 나눌 수 없습니다.");
        } catch (InputMismatchException e) {
            System.out.println("숫자만 입력 가능");
        } catch (Exception e) {
            System.out.println("예상 못한 문제");
        } finally {
            System.out.println("프로그램을 종료합니다.");
        }
    }

    /**
     * 문제 2: method2()
     * 기능명칭 : 배열 값 조회
     * 크기가 5인 정수 배열을 생성하고 {10, 20, 30, 40, 50} 으로 초기화
     * 사용자에게 "조회할 인덱스 번호 입력 : " 메시지 출력 후 입력받기
     * <p>
     * System.out.println("배열의 " + 인덱스 + "번째 값 : " + arr[인덱스]);
     * 에 대해 수행하고,
     * 배열 범위를 벗어난 인덱스 입력 시 발생하는 예외를
     * catch 처리 한 후
     * System.out.println("배열의 범위를 벗어났습니다. (0~4 사이의 숫자를 입력하세요)");
     * <p>
     * 성공 실패 관계 없이 "배열 조회를 완료했습니다." 출력
     */
    public void method2() {
        // 여기에 코드 작성
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        System.out.print("조회할 인덱스 번호 입력 : ");
        int i = sc.nextInt();
        sc.nextLine();
        try {
            System.out.println("배열의 " + i + "번째 값 : " + arr[i]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("배열의 범위를 벗어났습니다. (0~4 사이의 숫자를 입력하세요)");
        } finally {
            System.out.println("배열 조회를 완료했습니다.");
        }
    }

    /**
     * 문제 3: method3()
     * 기능명칭 : 문자열을 숫자로 변환
     * 사용자에게 "숫자 형태의 문자열 입력 : " 메시지 출력 후 입력받기
     * <p>
     * int number = Integer.parseInt(입력받은문자열);
     * System.out.println("변환된 숫자 : " + number);
     * System.out.println("변환된 숫자 * 2 = " + (number * 2));
     * 에 대해 수행하고,
     * 숫자가 아닌 문자열 입력 시 발생하는 예외를
     * catch 처리 한 후
     * System.out.println("숫자 형태가 아닙니다. 올바른 숫자를 입력해주세요.");
     * <p>
     * 성공 실패 관계 없이 "문자열 변환 작업을 종료합니다." 출력
     */
    public void method3() {
        // 여기에 코드 작성
        System.out.print("숫자 형태의 문자열 입력 : ");
        String str = sc.nextLine();
        try {
            int number = Integer.parseInt(str);
            System.out.println("변환된 숫자 : " + number);
            System.out.println("변환된 숫자 * 2: " + (number * 2));
        } catch (NumberFormatException e) {
            System.out.println("숫자 형태가 아닙니다. 올바른 숫자를 입력해주세요.");
        } finally {
            System.out.println("문자열 변환 작업을 종료합니다.");
        }

    }

    /**
     * 문제 4: method4()
     * 기능명칭 : Scanner로 정수 입력받기
     * 사용자에게 "나이를 입력하세요 : " 메시지 출력 후 정수로 입력받기
     * <p>
     * int age = sc.nextInt();
     * System.out.println("입력된 나이 : " + age + "세");
     * System.out.println("10년 후 나이 : " + (age + 10) + "세");
     * 에 대해 수행하고,
     * 정수가 아닌 값(문자, 실수 등) 입력 시 발생하는 예외를
     * catch 처리 한 후
     * System.out.println("정수만 입력 가능합니다. 다시 실행해주세요.");
     * <p>
     * 성공 실패 관계 없이 "나이 입력 프로그램을 종료합니다." 출력
     */
    public void method4() {
        // 여기에 코드 작성
        System.out.print("나이를 입력하세요 : ");

        try {
            int age = sc.nextInt();
            sc.nextLine();
            System.out.println("입력된 나이 : " + age + "세");
            System.out.println("10년 후 나이 : " + (age + 10) + "세");
        } catch (InputMismatchException e) {
            System.out.println("정수만 입력 가능합니다. 다시 실행해주세요.");
            sc.nextLine();
        } finally {
            System.out.println("나이 입력 프로그램을 종료합니다.");
        }

    }

    /**
     * 문제 5: method5()
     * 기능명칭 : 문자열 길이 체크
     * 사용자에게 "문자열을 입력하세요 : " 메시지 출력 후 입력받기
     * 만약 입력값이 null이면 강제로 NullPointerException 발생시키기
     * (입력받은 후 inputStr = null; 로 설정)
     * <p>
     * System.out.println("입력된 문자열 : " + inputStr);
     * System.out.println("문자열의 길이 : " + inputStr.length());
     * 에 대해 수행하고,
     * NullPointerException 발생 시
     * catch 처리 한 후
     * System.out.println("문자열이 null입니다. 처리할 수 없습니다.");
     * <p>
     * 성공 실패 관계 없이 "문자열 길이 체크를 완료합니다." 출력
     */
    public void method5() {
        // 여기에 코드 작성
        System.out.print("문자열을 입력하세요 : ");
        String inputStr = sc.nextLine();
        if (inputStr.equals("")) {
            inputStr = null;
        }
        try {
            System.out.println("입력된 문자열 : " + inputStr);
            System.out.println("문자열의 길이 : " + inputStr.length());
        } catch (NullPointerException e) {
            System.out.println("문자열이 null입니다. 처리할 수 없습니다.");
        } finally {
            System.out.println("문자열 길이 체크를 완료합니다.");
        }
    }

    /**
     * 문제 6: method6()
     * 기능명칭 : 파일명 확장자 추출
     * 사용자에게 "파일명을 입력하세요 (예: test.txt) : " 메시지 출력 후 입력받기
     * <p>
     * String extension = fileName.substring(fileName.lastIndexOf(".") + 1);
     * System.out.println("파일명 : " + fileName);
     * System.out.println("확장자 : " + extension);
     * 에 대해 수행하고,
     * '.'이 없는 파일명 입력 시 발생하는 예외를
     * catch 처리 한 후
     * System.out.println("올바른 파일명이 아닙니다. 확장자가 포함된 파일명을 입력하세요.");
     * <p>
     * 성공 실패 관계 없이 "파일명 처리를 완료했습니다." 출력
     */
    public void method6() {
        // 여기에 코드 작성
        System.out.print("파일명을 입력하세요 (예: test.txt) : ");
        String fileName = sc.nextLine();

        try {
            // fileName.lastIndexOf(".")==-1
            int dotIndex = fileName.lastIndexOf(".");
            // . 이 없거나 마지막 문자가.인경우 예외 발생
            System.out.println(dotIndex);
            if (dotIndex == -1) {// 인위적인 예외 발생
                throw new StringIndexOutOfBoundsException("확장자가 존재하지않습니다.");
            }
            String extension = fileName.substring(dotIndex + 1);
            // 점이 없으면 dotIndex가 -1 이므로 charAt(0)에서 빈문자열 발생해서 예외 유도
            extension.charAt(0);
            System.out.println("파일명 : " + fileName);
            System.out.println("확장자 : " + extension);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("올바른 파일명이 아닙니다. 확장자가 포함된 파일명을 입력하세요.");
        } finally {
            System.out.println("파일명 처리를 완료했습니다.");
        }
    }

}