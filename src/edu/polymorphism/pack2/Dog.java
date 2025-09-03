package edu.polymorphism.pack2;

public class Dog extends Animal {
    private String breed; //견종

    public Dog() {
    }

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    @Override
    public void eat() {
        // Animal을 상속받는 동물들은
        // 접근제한자 와 void 나 자료형 사이에 존재하는
        // abstract 표시가 적힌 method 기능들을 무조건
        // 개별 class에 맞게 재작성을 해야함
    }

    // sleep  의 경우  public void 사이에
    // abstract 가 없으므로 작성하지 않아도 됨
    // 필수가 아님~
}