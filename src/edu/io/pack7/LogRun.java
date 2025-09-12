package edu.io.pack7;

public class LogRun {

    public static void main(String[] args) {
        LoginLog loginLog = new LoginLog();
        loginLog.login();

        loginLog.login();
        loginLog.logout();
    }
}