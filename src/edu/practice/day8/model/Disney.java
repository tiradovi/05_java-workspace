package edu.practice.day8.model;

public class Disney implements StreamingService {
    private String movie;

    public Disney(String movie) {
        this.movie = movie;
    }

    @Override
    public void login() {
        System.out.println("🔐 디즈니플러스에 로그인합니다. 마법같은 시간!");
    }

    @Override
    public void watch() {
        System.out.println("🎬 디즈니플러스에서 " + getMovie() + " 감상 중... 꿈과 희망이 가득!");
    }

    @Override
    public void logout() {
        System.out.println("👋 디즈니플러스에서 로그아웃. 꿈은 계속되어요!");
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }
}
