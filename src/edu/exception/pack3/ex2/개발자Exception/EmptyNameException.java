package edu.exception.pack3.ex2.개발자Exception;

public class EmptyNameException extends RuntimeException {
    public EmptyNameException() {
        super("이름은 비어있을 수 없습니다");
    }

    public EmptyNameException(String message) {
        super(message);
    }
}
