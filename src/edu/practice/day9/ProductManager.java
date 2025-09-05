package edu.practice.day9;

import java.util.HashMap;
import java.util.Map;

public class ProductManager {
    Map<String, String> productMap;
    Map<String, Integer> priceMap;

    public ProductManager() {
        productMap = new HashMap<>();
        priceMap = new HashMap<>();

        productMap.put("P001", "갤럭시S24");
        priceMap.put("P001", 1200000);

        productMap.put("P002", "아이폰15");
        priceMap.put("P002", 1300000);

        productMap.put("P003", "나이키운동화");
        priceMap.put("P003", 150000);
    }

    void addProduct(String productId, String productName, int price) {
        if (productMap.containsKey(productId)) {
            System.out.println("이미 존재하는 상품입니다!");
        } else {
            productMap.put(productId, productName);
            priceMap.put(productId, price);
            System.out.println(productName + " 상품이 추가되었습니다!");
        }
    }

    void searchProduct(String productId) {
        if (productMap.containsKey(productId)) {
            System.out.println(
                    "상품ID: " + productId +
                            ", 상품명: " + productMap.get(productId) +
                            ", 가격: " + priceMap.get(productId) + "원"
            );
        } else {
            System.out.println("존재하지 않는 상품입니다.");
        }
    }

    void displayAllProducts() {
        System.out.println("=== 전체 상품 목록 ===");
        for (Map.Entry<String, String> entry : productMap.entrySet()) {
            String id = entry.getKey();
            String name = entry.getValue();
            int price = priceMap.get(id);
            System.out.println("상품ID: " + id + ", 상품명: " + name + ", 가격: " + price + "원");
        }
    }

    void removeProduct(String productId) {
        if (productMap.containsKey(productId)) {
            String name = productMap.get(productId);
            productMap.remove(productId);
            priceMap.remove(productId);
            System.out.println(name + " 상품이 삭제되었습니다.");
        } else {
            System.out.println("존재하지 않는 상품ID입니다.");
        }
    }
}
