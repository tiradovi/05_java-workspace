package edu.polymorphism.pack1.service;

import edu.polymorphism.pack1.model.Galaxy;
import edu.polymorphism.pack1.model.Iphone;
import edu.polymorphism.pack1.model.SmartPhone;

public class PolyService {
    //필드
    // 자료형 공간이름 = 공간을 설정할 때 공간 내에 들어올 수 있는 데이터를 Iphone 형태만 가능하도록 설정
    // 아이폰 전용 집 집이름 = 아이폰이 사는것
    Iphone iphone1 = new Iphone();
    // 갤럭시 전용 집 집이름 = 갤럭시가 사는것
    Galaxy galaxy1 = new Galaxy();

    // 스마트폰 전용 집 집이름 = 아이폰이 사는것
    SmartPhone s1 = new Iphone();
    // 스마트폰 전용 집 집이름 = 갤럭시가 사는것
    SmartPhone s2 = new Galaxy();

    // Galaxy galaxy3 = new Smartphone();
    // 이건 자바에서 아는 형태가 아니기에 형변환 어려움
    // Galaxy galaxy3 = (Galaxy) new Smartphone();
    // 가능하지만 데이터 손실이 일어날 수 있다. ClassCastException문제 발생
    // SmartPhone을 상속받는 Galaxy와 같은 데이터가 잘못 들어올 수 있기 때문에
    // 부모 변수이름 = new 자식(); 가능
    // 자식 변수이름 = new 부모(); 불가

    int 인트변수 = (int) 100L; // 이건 자바에서 둘다 숫자임을 알고있음


    //메서드
    public void method1() {
        s1.setDisplay("레티나 디스플레이");
        s2.setDisplay("AMOLED"); // 전류를 받으면 스스로 빛을 내는 기술

        // s1.setIosVersion(20); -> smartPhone 공간이기 때문에 Iphone에 작성된 필드 작성X

        System.out.println("S1 display: " + s1.getDisplay());
        System.out.println("S2 display: " + s2.getDisplay());
    }

    public void method2() {
        // 동일하게 만들어진 정보에 대해서 확인할 때 주로 사용
        // 부모 타입으로 이루어진 배열 객체를 생성
        // 부모 타입에 해당하는 정보를 출력할 수 있음

        // 하나씩 작성하는 것이아닌 배열 형태로 작성 가능
        SmartPhone 스마트폰1번 = new SmartPhone();
        SmartPhone 스마트폰2번 = new SmartPhone();
        SmartPhone 스마트폰3번 = new SmartPhone();

        SmartPhone[] 스마트폰공장1 = {스마트폰1번, 스마트폰2번, 스마트폰3번};
        SmartPhone[] 스마트폰공장2 = new SmartPhone[3];
        // 스마트폰 4대에 대한 정보를 sps라는 공간에 한번에 넣어줄 수 있다.
        스마트폰공장2[0] = 스마트폰1번;
        스마트폰공장2[1] = 스마트폰2번;
        스마트폰공장2[2] = 스마트폰3번;

        스마트폰공장2[0].setDisplay("아이폰 14 디스플레이");
        스마트폰공장2[1].setDisplay("갤럭시 S23 디스플레이");
        스마트폰공장2[2].setDisplay("파이폰 디스플레이");
        /* 공간크기가 더있거나 빈공간이 존재하면 nullpointerException
        스마트폰공장2[0] = 스마트폰1번;
        스마트폰공장2[1] = 스마트폰2번;
        스마트폰공장2[2] = 스마트폰3번;

        스마트폰공장2[0].setDisplay("아이폰 14 디스플레이");
        스마트폰공장2[1].setDisplay("갤럭시 S23 디스플레이");
        스마트폰공장2[2].setDisplay("파이폰 디스플레이");
         */

        // 스마트폰 공장내에 존재하는 스마트폰들의 정보를 for문활용하여 출력
        for (SmartPhone 기기확인 : 스마트폰공장2) {
            System.out.println("공장 내 기기들의 디스플레이 :" + 기기확인.getDisplay());
        }
        // 한번에 출력 가능

    }
}
