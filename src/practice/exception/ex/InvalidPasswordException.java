package practice.exception.ex;

public class InvalidPasswordException extends Exception {
    public InvalidPasswordException() {
        super("일치하는 비밀번호가 존재하지 않습니다.");
        // sout, super 둘다 문자열 출력이지만 super 권장
    }

    
    public InvalidPasswordException(String message) {
        super(message);
    }

}
