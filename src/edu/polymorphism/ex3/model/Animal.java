package edu.polymorphism.ex3.model;

public class Animal {
    // 공통 필드
    protected String name;
    protected int age;
    protected String color;
    protected String type; // "개", "고양이", "새"

    public Animal() {
    }

    public Animal(String name, int age, String color, String type) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.type = type;

    }

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", type='" + type + '\'';
    }

    // 추후 중괄호 내부에 기능을 작성할 것!
    // 내일부터 인터페이스 추상클래스
    // 지금은 재사용하여 각 class 에 맞게 커스텀해야할 기능을
    // 필수로 작성하지 않아도 상속받은 자식 클래스가
    // 정상적으로 작동함
    // 상속을 받을 때 필수로 해야하는 기능에 대해 설정하는 방법
    public void makeSound() {
    }

    ;

    public void move() {
    }

    ;

    public void doSpecialAction() {
    }

    ;

    public void eat() {
    }

    ;
}