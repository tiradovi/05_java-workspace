package edu.exception.pack3.ex.run;

import edu.exception.pack3.ex.model.Cart;
import edu.exception.pack3.ex.service.CartService;

import java.util.Scanner;

public class CartRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("사용자 아이디 입력 : ");
        String createUserId = sc.nextLine();

        Cart cart = new Cart(createUserId);

        CartService cartService = new CartService();
        // 둘다 유저아이디 가져오기, html 대신 작성한 것이기에 나중에 사용불가
        cartService.장바구니시간체크기능(createUserId);

        cartService.장바구니시간체크기능(cart.getUserId()); // 이것만 활용 예정
    }
}
