package edu.inheritance.ex;

public class Animal {
    private String name;
    private int age;
    private String color;

    //  Dog dog2 = new Dog(); // 기본 생성자
    //  Cat cat1 = new Cat();
    // Bird bird = new Bird();
    // 위와 같이 작성시 Animal에 기본 생성자가 있어야 한다.
    // 기본 생성자
    public Animal() {
    }

    // 필수 생성자
    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    // 게터, 세터
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // 공통 기능
    public void eat() {
        System.out.println(getName() + "이(가) 음식을 먹고 있습니다.");
    }

    public void sleep() {
        System.out.println(getName() + "이(가) 잠을 자고 있습니다.");
    }

    public void showInfo() {
        System.out.println("=== 동물 정보 ===");
        System.out.println("이름 : " + getName());
        System.out.println("나이 : " + getAge());
        System.out.println("색깔 : " + getColor());

    }

    public void makeSound() {
        System.out.println(getName() + "이(가) 소리를 냅니다.");
    }

    public void move() {
        System.out.println(getName() + "이(가) 움직입니다.");
    }
}
