package edu.oop.field.pack2;

import edu.oop.field.pack1.FieldEx;

/**
 * 다른 폴더의 클래스 파일 호출
 * 따라서 import 작성
 */
public class FieldRun2 {
    public static void main(String[] args) {
        FieldEx f1 = new FieldEx();

        // 어디서든 접근 가능
        System.out.println(f1.publicValue);
        /*
        같은 패키지 내에서만 사용 가능
        System.out.println(f1.defaultValueOne);
        System.out.println(f1.defaultValueTwo);
        
        같은 패키지 또는 상속받았을 때 사용 가능 
        public class FieldRun2 extends FieldEx 추가시 사용 가능
        System.out.println(f1.protectedValue);
        
        같은 클래스에서만 사용 가능
        System.out.println(f1.privateValue);
        */
    }
}
