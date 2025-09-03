package edu.polymorphism.ex1.service;

import edu.polymorphism.ex1.model.Clothing;
import edu.polymorphism.ex1.model.Electronics;
import edu.polymorphism.ex1.model.Food;
import edu.polymorphism.ex1.model.Product;

/*
 * 제품 관련 기능을 작성하는 문서
 */
public class ProductService {

    // 필드
    Electronics phone = new Electronics("삼성 갤럭시", "PHONE001", 800000.0, 10,
            "최신 스마트폰", "삼성", 0.2, "15W", 24);

    Clothing tshirt = new Clothing("면 티셔츠", "SHIRT001", 25000.0, 50,
            "100% 면 소재", "무신사", 0.3, "L", "화이트", "면");

    Food apple = new Food("사과", "APPLE001", 5000.0, 100,
            "국산 사과", "농협", 1.0, "2025-09-15", "한국", true);
    // 다형성을 활용해서 phone tshirt apple 제품 향상된 for문을 활용해서 정보 출력
    // displayProductInfo
    // 배열 처리할 변수의 명칭 products
    // for 문 내 활용할 변수의 명칭 product

    Product[] products = {phone, tshirt, apple};


    // for 문은 반드시 기능 내 작성
    // 전체 상품을 메인 페이지에서 모두 확인할 때 사용
    // category 에 작성된 카테고리들이 DB -> java 로 가져오고
    // java 에서 html 로 전달하여 카테고리를 볼 수 있도록 설정
    public void info() {
        for (Product product : products) {
            // Product 문서 클래스 내부에 작성된
            // 기능들 중에서  displayProductInfo() 로 작성된 기능을 수행
            // displayProductInfo() 기능 내부에 System 출력문으로 제품 정보를 확인할 수 있도록 설정
            // 한 내용이 실행되는 것
            product.displayProductInfo();
        }
    }


}