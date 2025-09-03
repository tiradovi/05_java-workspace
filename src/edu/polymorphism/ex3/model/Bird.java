package edu.polymorphism.ex3.model;

public class Bird extends Animal {
    // 새 전용 필드들
    private double wingSpan; // 날개 길이
    private boolean canFly; // 비행 가능 여부

    public Bird() {
    }

    public Bird(String name, int age, String color, String type) {
        super(name, age, color, type);
    }

    public Bird(double wingSpan, boolean canFly) {
        this.wingSpan = wingSpan;
        this.canFly = canFly;
    }

    public Bird(String name, int age, String color, String type, double wingSpan, boolean canFly) {
        super(name, age, color, type);
        this.wingSpan = wingSpan;
        this.canFly = canFly;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    @Override
    public String toString() {
        return super.toString() +
                "wingSpan=" + wingSpan +
                ", canFly=" + canFly +
                '}';
    }

    @Override
    public void move() {
        System.out.println(getName() + "이(가) 짹짹! 웁니다.");
    }

    @Override
    public void makeSound() {
        if (isCanFly()) {
            System.out.println(getName() + "이(가) 날개를 펴고 날아갑니다!");
        } else {
            System.out.println(getName() + "이(가) 뛰어갑니다.");
        }
    }

    @Override
    public void eat() {
        System.out.println(getName() + "이(가) 씨앗을 먹습니다.");
    }

    @Override
    public void doSpecialAction() {
        System.out.println(getName() + "이(가) 깃털을 다듬습니다.");
        System.out.println("날개 길이: " + getWingSpan() + "cm");
    }
}