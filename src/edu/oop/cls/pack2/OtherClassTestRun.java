package edu.oop.cls.pack2;

import edu.oop.basic.Account;
import edu.oop.basic.Nation;

public class OtherClassTestRun {
    public static void main(String[] args) {

        // Nation과 Account 는 public 이므로 다른 폴더에서도 접근 가능
        Nation n = new Nation();
        Account a = new Account();

        // 다른 폴더이므로 접근 불가
        // ClassTest1 obj = new ClassTest1();
    }
}
