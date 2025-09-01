package edu.inheritance.ex;

class Dog extends Animal {
    private String breed;

    // Animal에 기본생성자가 없을 경우 작성 불가
    public Dog() {
        super();
    }

    public Dog(String name, int age, String color) {
        super(name, age, color);
    }

    public Dog(String name, int age, String color, String breed) {
        super(name, age, color);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + "이(가) 멍멍 짖습니다.");
    }

    @Override
    public void move() {
        System.out.println(getName() + "이(가) 네 발로 뛰어다닙니다.");
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("품종 : " + getBreed());
        System.out.println("=====================");
        System.out.println();
    }

    public void wagTail() {
        System.out.println(getName() + "이(가) 꼬리를 흔듭니다!");
    }

    public void fetch() {
        System.out.println(getName() + "이(가) 공을 물어옵니다!");
    }

}