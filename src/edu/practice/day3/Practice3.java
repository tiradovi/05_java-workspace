package edu.practice.day3;

public class Practice3 {
    private String accountHolder;
    private String accountNumber;
    private long balance;
    private String password;
    private int transactionCount = 0;

    public Practice3() {
    }

    public Practice3(String accountHolder, String accountNumber, long balance, String password) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.password = password;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setTransactionCount(int transactionCount) {
        this.transactionCount = transactionCount;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public String getPassword() {
        return password;
    }

    public int getTransactionCount() {
        return transactionCount;
    }


    public void deposit(long amount) {
        setBalance(getBalance() + amount);
        setTransactionCount(getTransactionCount() + 1);
        System.out.println(getAccountHolder() + "님이 " + amount + "원 입금하셨습니다. 현재 잔액: " + getBalance() + "원");
        setTransactionCount(getTransactionCount() + 1);
        System.out.println();
    }

    public void withdraw(String pw, long amount) {
        if (!getPassword().equals(pw)) {
            System.out.println("비밀번호가 일치하지 않습니다.");
            return;
        }
        if (amount > getBalance()) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        setBalance(getBalance() - amount);
        System.out.println(getAccountHolder() + "님이 " + amount + "원 출금하셨습니다. 현재 잔액: " + getBalance() + "원");
        System.out.println();
    }

    public void transfer(String pw, Practice3 targetAccount, long amount) {
        if (!getPassword().equals(pw)) {
            System.out.println("비밀번호가 일치하지 않습니다.");
            return;
        }
        if (amount > getBalance()) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        setBalance(getBalance() - amount);
        targetAccount.setBalance(getBalance() + amount);

        System.out.println(getAccountHolder() + "님이 " + targetAccount.getAccountHolder() + "님에게 " + amount + "원 이체했습니다.");
        System.out.println(getAccountHolder() + "현재 잔액: " + getBalance() + "원");
        System.out.println(targetAccount.getAccountHolder() + " 상대방 잔액: " + targetAccount.getBalance() + "원");
        System.out.println();
    }

    public void checkTransactionCount() {
        System.out.println("=== " + getAccountHolder() + "님 총 거래 횟수 ===");
        System.out.println("총 " + getTransactionCount() + "회 거래를 하셨습니다.");
    }

    public void displayAccount() {
        System.out.println("=== " + getAccountHolder() + "님 계좌 정보 ===");
        System.out.println("계좌번호: " + getAccountNumber());
        System.out.println("잔액: " + getBalance() + "원");
        System.out.println("총 거래 횟수: " + getTransactionCount() + "회");
        System.out.println();
    }
}
