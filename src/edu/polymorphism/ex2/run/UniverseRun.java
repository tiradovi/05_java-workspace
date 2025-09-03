package edu.polymorphism.ex2.run;

import edu.polymorphism.ex2.service.UniverseService;

public class UniverseRun {
    public static void main(String[] args) {
        // UniverseService 내부에 존재하는 기능 실행
        UniverseService universeService = new UniverseService();
        universeService.info();
    }
}