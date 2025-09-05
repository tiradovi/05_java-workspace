package edu.exception.pack3.ex2.개발자Exception;

public class 회사에서만든예외문서 extends Exception {

    public 회사에서만든예외문서() {
        super("회사에서 공식적으로 출력하는 예외에 대한 설명입니다.");
    }

    // 회사에서 공식적으로 출력하는 예외에 대한 설명을
    // 잠시 수정해서 활용해야할 경우에는 message 파라미터 이용
    public 회사에서만든예외문서(String message) {
        super(message);
    }
}
