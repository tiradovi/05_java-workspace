package edu.oop.field.pack3.ex;

public class ShoppingMallMember {
    public static int totalMemberCount;
    public static int dailyVisitorCount;

    public static final String SHOPPING_MALL_NAME = "더조은 온라인 쇼핑몰";
    public static final String SERVICE_CENTER_NUMBER = "1588-1234";
    public static final int MAX_CART_ITEMS = 50;
    public static final int MIN_PASSWORD_LENGTH = 8;

    private String memberId;
    private String memberName;
    private String email;
    private int cartItemCount;

    {
        memberId = "guest123";
        memberName = "게스트";
        email = "guest@tjemall.com";
        cartItemCount = 0;
        visitSite();
    }

    static {
        totalMemberCount = 0;
        dailyVisitorCount = 0;
        System.out.println("=== " + SHOPPING_MALL_NAME + " 시스템 시작 ===");
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCartItemCount(int cartItemCount) {
        this.cartItemCount = cartItemCount;
    }

    public String getMemberId() {
        return memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public String getEmail() {
        return email;
    }

    public int getCartItemCount() {
        return cartItemCount;
    }

    public void joinMember(String memberId, String memberName, String email) {
        setMemberId(memberId);
        setMemberName(memberName);
        setEmail(email);
        System.out.println(getMemberName() + "님이 회원가입하셨습니다. (회원번호" + getMemberId() + ")");
        totalMemberCount++;
        visitSite();
    }

    public void visitSite() {
        dailyVisitorCount++;
        System.out.println(getMemberName() + "님이 사이트를 방문했습니다.");
    }

    public void addToCart(int itemCount) {
        // char, String : equals 활용
        // int 는 부등호
        // static final은 관계없음
        if (MAX_CART_ITEMS >= getCartItemCount() + itemCount) {
            setCartItemCount(getCartItemCount() + itemCount);
            System.out.println(getMemberName() + "님이 " + itemCount + "개 상품을 추가했습니다.");
        } else {
            System.out.println("장바구니 최대 수량(" + MAX_CART_ITEMS + "개)를 초과할 수 없습니다.");
        }
    }

    public void printMemberInfo() {
        System.out.println("=================");
        System.out.println("회원아이디 :" + getMemberId());
        System.out.println("회원이름 :" + getMemberName());
        System.out.println("이메일 :" + getEmail());
        System.out.println("장바구니 :" + getCartItemCount() + "개");
    }


}
