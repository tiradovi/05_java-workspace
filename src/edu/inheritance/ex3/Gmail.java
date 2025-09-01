package edu.inheritance.ex3;

public class Gmail extends GoogleService {
    private int inboxCount;
    private int storageUsed;

    public Gmail() {
    }

    // GoogleService에 존재하는 필드 값만 사용하는 생성자
    // GoogleService에서 전달받은 serviceName은 Gmail이기 때문에 직접 작성
    public Gmail(String userEmail, String userName, String accountType) {
        super("Gmail", userEmail, userName, accountType);
    }

    public Gmail(String userEmail, String userName, String accountType, int inboxCount, int storageUsed) {
        super("Gmail", userEmail, userName, accountType);
        this.inboxCount = inboxCount;
        this.storageUsed = storageUsed;
    }

    @Override
    public void search() {
        System.out.println("Gmail에서 메일을 검색합니다");
    }

    @Override
    public void share() {
        System.out.println("Gmail에서 메일을 전달합니다");
    }

    public void sendEmail() {
        System.out.println(getUserName() + "님이 이메일을 발송합니다");
    }

    public int getInboxCount() {
        return inboxCount;
    }

    public void setInboxCount(int inboxCount) {
        this.inboxCount = inboxCount;
    }

    public int getStorageUsed() {
        return storageUsed;
    }

    public void setStorageUsed(int storageUsed) {
        this.storageUsed = storageUsed;
    }
}
