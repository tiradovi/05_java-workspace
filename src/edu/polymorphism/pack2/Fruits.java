package edu.polymorphism.pack2;

/*
부모 클래스
 */
public abstract class Fruits {
    protected String fruitName;

    public Fruits() {
    }

    public Fruits(String fruitName) {
        this.fruitName = fruitName;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    ///  abstract
    ///  접근제어자 abstract 자료형 인경우 중괄호 생략
    public abstract void taste();

    public void info() {
        System.out.println("Fruit" + fruitName);
    }

}
