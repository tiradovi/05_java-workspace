package edu.polymorphism.pack2;

/**
 * 부모 클래스
 */
public abstract class Animal {
    // 필드
    protected String name;

    // 생성자
    public Animal() {
    }

    // 생성자
    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 먹고 자는 행위 무조건 함!

    public abstract void eat();

    public void sleep() {
    }


    // eat sleep 을 상속받는 Dog에서 작성하지 않아도 아무런 문제가 되지 않음
    //public void eat() {}
    //public void sleep() {}
}