package edu.polymorphism.pack3.ex1;

public class 플랫폼실행하기 {
    public static void main(String[] args) {
        Facebook facebook = new Facebook("자연인");
        facebook.login();
        facebook.post("오늘도 자연은 아름답네요.");
        facebook.like("post001");
        facebook.logout();

        System.out.println();

        Instagram instagram = new Instagram("이코딩");
        instagram.login();
        instagram.post("맛있는 음식");
        instagram.like("post001");
        instagram.logout();
    }
}
