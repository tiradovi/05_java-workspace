package edu.collection.pack2.model;

public class Person {
    // 필드 속성 인스턴스변수
    private String name;
    private int age;
    private char gender;
    // 메서드

    /// / 기본 생성자
    public Person() {
    }

    /// / 파라미터생성자
    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    /// / 게터 & 세터
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person [name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ']';
    }
}