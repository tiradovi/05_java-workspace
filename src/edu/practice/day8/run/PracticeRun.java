package edu.practice.day8.run;


import edu.practice.day8.service.PracticeService;

/**
 * Java 8일차 인터페이스, 다형성 실습문제 실행 클래스
 * 각 문제의 주석을 해제하고 실행하세요
 */
public class PracticeRun {
    public static void main(String[] args) {
        System.out.println("=== Java 8일차 인터페이스, 다형성 실습문제 실행 ===");
        PracticeService practiceService = new PracticeService();
        practiceService.videoPlayer();
        practiceService.socialMedia();
        practiceService.onlineShopping();
        practiceService.messenger();
        practiceService.streamingService();
        practiceService.digitalLife();
        practiceService.servicesTogether();
    }

}
