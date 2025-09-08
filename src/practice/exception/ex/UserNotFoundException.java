package practice.exception.ex;

public class UserNotFoundException extends Exception {
    public UserNotFoundException() {
        super("존재하지 않는 아이디입니다.");
    }

    public UserNotFoundException(String message) {
        super(message);
    }
}
