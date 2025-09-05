package edu.exception.pack3;

/*
Checked Exception / UnChecked Exception

Check : 확인하다

Checked Exception : 반드시 확인해야 하는 예외
    -> 예외 처리 구문 반드시 작성해야하는 예외

Unchecked Exception : 확인 안해도 되는 예외
    -> 예외 처리 구문 선택
 */
public class ExceptionEx3 {
    // 체크/ 언체크 구분

    public void method1() {
        {
            int result = 1;
            if (result == 1) {
                throw new RuntimeException(); // 빨간 줄 안뜸

                //throw new IOException(); // 빨간 줄 뜸
                //try- catch
            }
        }
    }

    public void method2() {
        int result = 101;
        if (result > 100) {
            throw new 개발자Exception();
        }

    }

}
