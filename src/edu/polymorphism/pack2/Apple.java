package edu.polymorphism.pack2;

//클래스 'Apple'은(는) abstract로 선언되거나 'Fruits'에서 추상 메서드 'taste()'을(를) 구현해야 합니다
// 이 문제는 자식클래스에서 abstract의 메서드 구현을 안한 경우 생기는 문제
public class Apple extends Fruits {
    private String 품종;

    public Apple() {
    }

    public Apple(String fruitName) {
        super(fruitName);
    }

    public Apple(String fruitName, String 품종) {
        super(fruitName);
        this.품종 = 품종;
    }


    public String get품종() {
        return 품종;
    }

    public void set품종(String 품종) {
        this.품종 = 품종;
    }

    @Override
    public void taste() {
        System.out.println(getFruitName() + "의 맛은 " + get품종() + "에 따라 다릅니다.");
    }

}
