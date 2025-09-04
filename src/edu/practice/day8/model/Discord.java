package edu.practice.day8.model;

public class Discord implements Messenger {
    private String server;

    public Discord(String server) {
        this.server = server;
    }

    @Override
    public void sendMessage() {
        System.out.println("💬 " + getServer() + " 서버에 메시지를 보냅니다!");
    }

    @Override
    public void receiveMessage() {
        System.out.println("📱 " + getServer() + " 서버에서 새 메시지가 도착했어요!");
    }

    @Override
    public void makeCall() {
        System.out.println("🎤 " + getServer() + " 서버 음성채널에 접속!");
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }
}
