package edu.exception.pack1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 예외 발생 구문을 try-catch 로 처리
 * try{}: 문제가 발생할 것 같은 가능성이 있는 코드를 시도하는 구문
 * catch(예외){} : try구문중 (예외)와 같은 예외가 발생된 경우 catch에 작성된 구문 실행
 * 여러개 작성 가능
 * catch(특정1 예외사항){
 * 특정 1 예외 상황 발생시 대처해야하는 기능
 * }
 * catch(특정2 예외사항){
 * 특정 2 예외 상황 발생시 대처해야하는 기능
 * }catch(Exception e){
 * 개발자가 확인하지 못한 상황 확인후 기능 추가 예정
 * 즉 대처보다는 문제환경을 개발자에게 전달
 * }
 * <p>
 * <p>
 * finally: 마지막에 반드시 수행해야하는 구문 try구문에서 예외발생 여부 관계없이 실행
 *
 */
public class ExceptionEx1 {
    /*
    Exception : 코드로 처리 가능한 에러
    Exception Handling : Exception 발생시 처리하는 방법
     */

    public void method1() {
        int[] arr = {10, 20, 30, 40};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // Index 4 out of bounds for length 4 (i<= arr.length) 인 경우
        // 프로그램 실행중 예외 발생시, 상황에 맞는 코드 수행 그 후 예외 출력후 실행종료

        // 자바 개발자가 만든 폴더위치와 폴더 내 존재하는 파일
        //                   java.lang.ArrayIndexOutOfBoundsException
        //                   배열과 숫자 관련해서 문제가 발생하면 Index 숫자 out of bounds for length 숫자
        //                   로 예외사항 전달

    }

    /**
     * 예외 발생 구문을 try-catch 로 처리
     * try{}: 문제가 발생할 것 같은 가능성이 있는 코드를 시도하는 구문
     * catch(예외){} : try구문중 예외가 발생된 경우 catch에 작성된 구문 실행
     * finally: 마지막에 반드시 수행해야하는 구문 try구문에서 예외발생 여부 관계없이
     */
    public void method2() {
        int[] arr = {10, 20, 30, 40};

        try {
            for (int i = 0; i <= arr.length; i++) {
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("개발자가 예상한 예외상황 : " + e);
        } catch (Exception e) {
            System.out.println("개발자가 예상못한 예외상황 : " + e);
        }

    }

    public void method3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 스캐너에 문자 작성시");

        try {


            System.out.print("정수입력 1 : ");
            int input1 = sc.nextInt();
            System.out.print("정수입력 2 : ");
            int input2 = sc.nextInt();
            System.out.println("결과:" + input1 + "+" + input2 + "=" + (input1 + input2));
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void method4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 스캐너에 문자 작성시");

        try {
            System.out.print("정수입력 1 : ");
            int input1 = sc.nextInt();
            System.out.print("정수입력 2 : ");
            int input2 = sc.nextInt();
            System.out.println("결과:" + input1 + "+" + input2 + "=" + (input1 + input2));
        } catch (InputMismatchException e) {
            System.out.println("개발자가 예상");
        } catch (Exception e) {
            System.out.println("예상외");
        } finally {
            System.out.println("프로그램 종료");
        }
    }
}
