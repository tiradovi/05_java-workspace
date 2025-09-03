package edu.polymorphism.ex1.run;

import edu.polymorphism.ex1.service.MemberService;
import edu.polymorphism.ex1.service.ProductService;

public class CompanyRun {
    public static void main(String[] args) {
        ProductService ps = new ProductService();
        // ps = ProductService 의 대한 기능이 담긴 공간 명칭
        ps.info(); //  ProductService 내에 존재하는  info() 기능을 실행

        MemberService ms = new MemberService();
        ms.info();
    }
}