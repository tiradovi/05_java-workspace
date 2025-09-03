package edu.polymorphism;

/*
추상화 : 어떤 개념이나 정보를 단순화하고 핵심적인 요소만 뽑아내는 것을 의미

코드에서 추상화란..
추후 어떤 구현이 될지는 알 수 없지만 그 구현의 기능 명칭은 알 수 있음

abstract : 기능에 대한 틀만 존재하고 구체적인 기능이 없음
그리고 반드시 추상화 기능을 작성하는 class 문서에서는
class 앞에 abstract 작성해야함

// 이 파일에는 세부적인 기능없이 기능에 대한 명칭만 작성된 메서드가 존재합니다. 와 같은 표기
public abstract class 파일이름 {


        //추상화 할 기능 또한 abstract 작성해야하며  {} 는 생략한다.
}
 */
public abstract class 추상화 {


    // 필드는 작성해도 되고 안해도 된다.!
    //접근제어자   추상화    리턴유무       메서드명칭();
    public abstract void info();

    public abstract String display();

    public abstract int method3();
}