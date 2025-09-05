package edu.exception.pack2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * catch 구문 여러개 작성하기
 * 1) throw : 예외 강제 발생
 * 2) 예외 + 다형성
 * - catch 문 여러개 작성시
 * 부모 예외를 처리하는 catch 문이 자식 예외도 모두 잡아서 처리
 * 따라서 Exception은 맨아래에 작성
 * <p>
 * throw 같은 경우 자바 프로그램상 문제가 없지만
 * 회사 내 프로그램에서 소비자가 진행하면 안되는 행동을 발생할 경우
 * 진행하지 못하도록 정지 후, 회사가 원하는 방향으로 프로그램이 진행되도록 처리
 */
public class ExceptionEx2 {
    Scanner sc = new Scanner(System.in);

    /*
    throw new 문제가 발생할 상황에 대한 명칭Exception();
     case1 에서 문제가 발생할경우 break없이도 method1()기능 자체 중단하는 상황 발생
     break를 굳이 작성하지 않아도 case2번부터 내용 출력X
                    case 1:
                        throw new ArithmeticException("개발자가 발생하는 문제~1번");
                     case 2:
                        throw new NullPointerException("개발자가 발생하는 문제~2번");
                    case 3:
                        throw new ClassCastException();
                    case 4:
                            throw new RuntimeException();
     */
    public void method1() {
        while (true) {
            try {
                System.out.println("[예외 강제 발생 시키기]");

                System.out.println("1. ArithmeticException");
                System.out.println("2. NullPointerException");
                System.out.println("3. ClassCastException");
                System.out.println("4. RuntimeException");
                System.out.println("0. 종료");
                System.out.print("예외 선택>>");
                int choice = sc.nextInt();

                // throw new예외(): 개발자가 예외를 강제로 발생할 때 사용하는 구문
                // throw 구문 내에 멈추는 기능 존재 따라서 break 작성시 두번작성한 효과
                switch (choice) {
                    case 1:
                        throw new ArithmeticException("개발자가 발생하는 문제~1번");
                    case 2:
                        throw new NullPointerException("개발자가 발생하는 문제~2번");
                    case 3:
                        throw new ClassCastException();
                    case 4:
                        throw new RuntimeException();
                    case 0:
                        System.out.println("프로그램 종료");
                        System.exit(0);
                    default:
                        System.out.println("메뉴에 작성된 번호만 입력");
                }
            } catch (InputMismatchException e) {
                System.out.println("input 내에 버퍼가 남아있습니다.");
                sc.nextLine();// 입력 버퍼에 잘못 들어간 값 제거
            } catch (ArithmeticException e) {
                System.out.println("계산적인 문제가 발생했습니다.");
                System.out.println("아래 단계에 따라 문제 해결");
                // 개발자가 대안을 코드로 작성
            } catch (NullPointerException e) {
                System.out.println("참조하는 객체가 없습니다.");
            } catch (ClassCastException e) {
                System.out.println("클래스 참조문제 발생");
                System.out.println("부모클래스 공간에서 자식클래스 메서드 실행시 나오는 문제");
            } catch (RuntimeException e) {
                System.out.println("프로그램 실행중 발생한 예외처리 완료");
            } finally {

            }
        }
    }

    public void method2() {

    }

    public void method3() {
        try {
            // 각종 예외 강제로 발생시키고
        } catch (Exception e) {
            System.out.println("예외는 어떤 예외들이 뜨는 지 확인 후");

        }
    }
}
