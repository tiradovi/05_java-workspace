package edu.exception.pack3;

public class 개발자Exception extends RuntimeException {
    public 개발자Exception() {
        super("100을 초과하였습니다.");
    }

    public 개발자Exception(String message) {
        super(message);
    }
}
