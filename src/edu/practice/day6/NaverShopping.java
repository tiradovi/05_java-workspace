package edu.practice.day6;

public class NaverShopping extends NaverService {
    private int point;
    private int cartCount;

    public NaverShopping() {
    }

    public NaverShopping(String serviceName, String userId, String userNickname, int userLevel) {
        super(serviceName, userId, userNickname, userLevel);
    }

    public NaverShopping(String serviceName, String userId, String userNickname, int userLevel, int point, int cartCount) {
        super(serviceName, userId, userNickname, userLevel);
        this.point = point;
        this.cartCount = cartCount;
    }

    @Override
    public void search() {
        System.out.println("쇼핑몰에서 상품을 검색합니다.");
    }

    @Override
    public void writeContent() {
        System.out.println("상품 리뷰를 작성합니다.");
    }

    @Override
    public void showUserInfo() {
        super.showUserInfo();
        System.out.println("적립금 : " + getPoint());
        System.out.println("장바구니 개수 : " + getCartCount());
        System.out.println("======================");
        System.out.println();
    }

    public void addToCart() {
        System.out.println("장바구니에 추가합니다.");
        cartCount++;
    }

    public void buyProduct() {
        System.out.println("상품을 구매합니다.");

    }

    // 게터, 세터
    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getCartCount() {
        return cartCount;
    }

    public void setCartCount(int cartCount) {
        this.cartCount = cartCount;
    }
}
