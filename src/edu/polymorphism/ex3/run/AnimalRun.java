package edu.polymorphism.ex3.run;

import edu.polymorphism.ex3.service.AnimalService;

// 동물 패키지를 실행하는 공간
public class AnimalRun {

    public static void main(String[] args) {
        AnimalService animalService = new AnimalService();
        animalService.display();
    }
}