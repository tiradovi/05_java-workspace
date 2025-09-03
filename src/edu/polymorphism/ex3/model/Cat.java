package edu.polymorphism.ex3.model;

public class Cat extends Animal {
    // 고양이 전용 필드들
    private int livesLeft; // 남은 목숨 (9개)
    private boolean isIndoor; // 실내묘 여부

    public Cat() {
    }

    public Cat(String name, int age, String color, String type) {
        super(name, age, color, type);
    }

    public Cat(int livesLeft, boolean isIndoor) {
        this.livesLeft = livesLeft;
        this.isIndoor = isIndoor;
    }

    public Cat(String name, int age, String color, String type, int livesLeft, boolean isIndoor) {
        super(name, age, color, type);
        this.livesLeft = livesLeft;
        this.isIndoor = isIndoor;
    }

    public int getLivesLeft() {
        return livesLeft;
    }

    public void setLivesLeft(int livesLeft) {
        this.livesLeft = livesLeft;
    }

    public boolean isIndoor() {
        return isIndoor;
    }

    public void setIndoor(boolean indoor) {
        isIndoor = indoor;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + "이(가) 야옹~ 웁니다.");
    }

    @Override
    public void move() {
        System.out.println(getName() + "이(가) 조용히 걸어갑니다.");
    }

    @Override
    public void eat() {
        System.out.println(name + "이(가) 참치캔을 먹습니다.");
    }

    @Override
    public void doSpecialAction() {
        System.out.println(name + "이(가) 그루밍을 합니다.");
        if (livesLeft > 0) {
            System.out.println("남은 목숨: " + livesLeft + "개");
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "livesLeft=" + livesLeft +
                ", isIndoor=" + isIndoor +
                '}';
    }
}