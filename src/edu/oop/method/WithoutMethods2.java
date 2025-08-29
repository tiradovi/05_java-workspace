package edu.oop.method;

public class WithoutMethods2 {
    public static void main(String[] args) {
        // 주문 1 처리
        String customer1Name = "김고객";
        String customer1Phone = "010-1234-5678";
        String customer1Address = "서울시 강남구 테헤란로 123";

        // 주문 1 상품 정보
        String product1_1 = "노트북";
        int price1_1 = 1200000;
        int quantity1_1 = 1;
        String product1_2 = "마우스";
        int price1_2 = 25000;
        int quantity1_2 = 2;
        String product1_3 = "키보드";
        int price1_3 = 80000;
        int quantity1_3 = 1;

        // 주문 1 금액 계산
        int subtotal1_1 = price1_1 * quantity1_1;
        int subtotal1_2 = price1_2 * quantity1_2;
        int subtotal1_3 = price1_3 * quantity1_3;
        int totalAmount1 = subtotal1_1 + subtotal1_2 + subtotal1_3;

        // 주문 1 할인 계산 (100만원 이상 10% 할인)
        int discountAmount1 = discountRate(totalAmount1);

        // 주문 1 배송비 계산
        int paymentAmount1 = totalAmount1 + 배송비계산(totalAmount1);

        // 주문 1 결제 영수증 출력
        System.out.println("==================== 주문 영수증 ====================");
        System.out.println("고객명: " + customer1Name);
        System.out.println("연락처: " + customer1Phone);
        System.out.println("배송지: " + customer1Address);
        System.out.println("---------------------------------------------------");
        System.out.println("주문 상품:");
        System.out.println("1. " + product1_1 + " x " + quantity1_1 + "개 = " + subtotal1_1 + "원");
        System.out.println("2. " + product1_2 + " x " + quantity1_2 + "개 = " + subtotal1_2 + "원");
        System.out.println("3. " + product1_3 + " x " + quantity1_3 + "개 = " + subtotal1_3 + "원");
        System.out.println("---------------------------------------------------");
        System.out.println("상품 총액: " + totalAmount1 + "원");
        System.out.println("할인 금액: -" + discountAmount1 + "원 ");
        System.out.println("배송비: " + 배송비계산(totalAmount1) + "원");
        System.out.println("최종 결제 금액: " + paymentAmount1 + "원");
        System.out.println("===================================================");
        System.out.println();


        // 주문 2 처리 (완전히 동일한 로직 반복)
        String customer2Name = "박구매";
        String customer2Phone = "010-9876-5432";
        String customer2Address = "부산시 해운대구 우동 456";

        // 주문 2 상품 정보
        String product2_1 = "스마트폰";
        int price2_1 = 800000;
        int quantity2_1 = 1;
        String product2_2 = "케이스";
        int price2_2 = 15000;
        int quantity2_2 = 1;
        String product2_3 = "충전기";
        int price2_3 = 30000;
        int quantity2_3 = 2;

        // 주문 2 금액 계산 (동일한 로직)
        int subtotal2_1 = price2_1 * quantity2_1;
        int subtotal2_2 = price2_2 * quantity2_2;
        int subtotal2_3 = price2_3 * quantity2_3;
        int totalAmount2 = subtotal2_1 + subtotal2_2 + subtotal2_3;

        // 주문 2 할인 계산 (동일한 로직 반복)
        int discountAmount2 = discountRate(totalAmount2);

        // 주문 2 배송비 계산 (동일한 로직)
        int paymentAmount2 = totalAmount2 + 배송비계산(totalAmount2);

        // 주문 2 결제 영수증 출력 (동일한 형식)
        System.out.println("==================== 주문 영수증 ====================");
        System.out.println("고객명: " + customer2Name);
        System.out.println("연락처: " + customer2Phone);
        System.out.println("배송지: " + customer2Address);
        System.out.println("---------------------------------------------------");
        System.out.println("주문 상품:");
        System.out.println("1. " + product2_1 + " x " + quantity2_1 + "개 = " + subtotal2_1 + "원");
        System.out.println("2. " + product2_2 + " x " + quantity2_2 + "개 = " + subtotal2_2 + "원");
        System.out.println("3. " + product2_3 + " x " + quantity2_3 + "개 = " + subtotal2_3 + "원");
        System.out.println("---------------------------------------------------");
        System.out.println("상품 총액: " + totalAmount2 + "원");
        System.out.println("할인 금액: -" + discountAmount2 + "원");
        System.out.println("배송비: " + 배송비계산(totalAmount2) + "원");
        System.out.println("최종 결제 금액: " + paymentAmount2 + "원");
        System.out.println("===================================================");
        System.out.println();


        // 주문 3 처리 (또 다시 중복)
        String customer3Name = "이쇼핑";
        String customer3Phone = "010-5555-7777";
        String customer3Address = "대구시 중구 동성로 789";

        // 주문 3 상품 정보
        String product3_1 = "태블릿";
        int price3_1 = 400000;
        int quantity3_1 = 1;
        String product3_2 = "스타일러스";
        int price3_2 = 50000;
        int quantity3_2 = 1;
        String product3_3 = "보호필름";
        int price3_3 = 20000;
        int quantity3_3 = 3;

        // 주문 3 금액 계산 (또 다시 동일한 로직)
        int subtotal3_1 = price3_1 * quantity3_1;
        int subtotal3_2 = price3_2 * quantity3_2;
        int subtotal3_3 = price3_3 * quantity3_3;
        int totalAmount3 = subtotal3_1 + subtotal3_2 + subtotal3_3;

        // 주문 3 할인 계산 (또 다시 동일한 로직)
        int discountAmount3 = discountRate(totalAmount3);

        // 주문 3 배송비 계산 (또 다시 동일한 로직)
        int paymentAmount3 = totalAmount3 + 배송비계산(totalAmount3);

        // 주문 3 결제 영수증 출력 (또 다시 동일한 형식)
        System.out.println("==================== 주문 영수증 ====================");
        System.out.println("고객명: " + customer3Name);
        System.out.println("연락처: " + customer3Phone);
        System.out.println("배송지: " + customer3Address);
        System.out.println("---------------------------------------------------");
        System.out.println("주문 상품:");
        System.out.println("1. " + product3_1 + " x " + quantity3_1 + "개 = " + subtotal3_1 + "원");
        System.out.println("2. " + product3_2 + " x " + quantity3_2 + "개 = " + subtotal3_2 + "원");
        System.out.println("3. " + product3_3 + " x " + quantity3_3 + "개 = " + subtotal3_3 + "원");
        System.out.println("---------------------------------------------------");
        System.out.println("상품 총액: " + totalAmount3 + "원");
        System.out.println("할인 금액: -" + discountAmount3 + "원");
        System.out.println("배송비: " + 배송비계산(totalAmount3) + "원");
        System.out.println("최종 결제 금액: " + paymentAmount3 + "원");
        System.out.println("===================================================");
        System.out.println();


        // 일일 매출 통계 계산
        int dailyTotalSales = paymentAmount1 + paymentAmount2 + paymentAmount3;
        int dailyTotalDiscount = discountAmount1 + discountAmount2 + discountAmount3;


        System.out.println("================= 일일 매출 통계 =================");
        System.out.println("총 주문 건수: 3건");
        System.out.println("총 매출액: " + dailyTotalSales + "원");
        System.out.println("총 할인액: " + dailyTotalDiscount + "원");


        // 가장 큰 주문 찾기 (비효율적)
        if (paymentAmount1 >= paymentAmount2 && paymentAmount1 >= paymentAmount3) {
            System.out.println("최대 주문: " + customer1Name + " (" + paymentAmount1 + "원)");
        } else if (paymentAmount2 >= paymentAmount1 && paymentAmount2 >= paymentAmount3) {
            System.out.println("최대 주문: " + customer2Name + " (" + paymentAmount2 + "원)");
        } else {
            System.out.println("최대 주문: " + customer3Name + " (" + paymentAmount3 + "원)");
        }
        System.out.println("===============================================");
    }

    public static int 배송비계산(int totalAmount) {
        if (totalAmount < 50000) return 3000;
        return 0;
    }

    public static int discountRate(int totalAmount) {
        double discountRate = 0.0;
        int discountAmount = 0;
        if (totalAmount >= 1000000) {
            discountRate = 0.1;
            discountAmount = (int) (totalAmount * discountRate);
            return discountAmount;
        } else if (totalAmount >= 500000) {
            discountRate = 0.05;
            discountAmount = (int) (totalAmount * discountRate);
            return discountAmount;
        }
        return discountAmount;
    }
/*
    public static void orderInfo() {
        System.out.println("==================== 주문 영수증 ====================");
        System.out.println("고객명: " + customer2Name);
        System.out.println("연락처: " + customer2Phone);
        System.out.println("배송지: " + customer2Address);
        System.out.println("---------------------------------------------------");
        System.out.println("주문 상품:");
        System.out.println("1. " + product2_1 + " x " + quantity2_1 + "개 = " + subtotal2_1 + "원");
        System.out.println("2. " + product2_2 + " x " + quantity2_2 + "개 = " + subtotal2_2 + "원");
        System.out.println("3. " + product2_3 + " x " + quantity2_3 + "개 = " + subtotal2_3 + "원");
        System.out.println("---------------------------------------------------");
        System.out.println("상품 총액: " + totalAmount2 + "원");
        System.out.println("할인 금액: -" + discountAmount2 + "원 (" + (int) (discountRate2 * 100) + "%)");
        System.out.println("배송비: " + shippingFee2 + "원");
        System.out.println("최종 결제 금액: " + paymentAmount2 + "원");
        System.out.println("===================================================");
        System.out.println();
    }*/
}