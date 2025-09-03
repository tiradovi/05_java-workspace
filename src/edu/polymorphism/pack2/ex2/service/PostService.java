package edu.polymorphism.pack2.ex2.service;

import edu.polymorphism.pack2.ex2.model.Notice;
import edu.polymorphism.pack2.ex2.model.Post;
import edu.polymorphism.pack2.ex2.model.Question;
import edu.polymorphism.pack2.ex2.model.Review;

public class PostService {
    // Notice Question Review 개별 객체 생성 후 다형성으로 공통된 기능 실행
    Notice notice = new Notice("N001", "사이트 점검 안내", "관리자", "오늘 밤 12시 점검합니다.", "긴급");
    Question question = new Question("Q001", "회원가입이 안되요", "김질문", "회원가입 버튼을 눌러도 반응이 없습니다.");
    Review review = new Review("R001", "서비스 이용 후기", "이후기", "정말 좋은 서비스네요!", 5);

    Post[] posts = {notice, question, review};

    public void display() {
        for (Post post : posts) {
            System.out.println("============== 포스트 정보 ==============");
            post.displayPost();
            System.out.println();
            System.out.println("========= 각 게시글 별 좋아요 기능 =======");
            post.like();
            System.out.println();
            System.out.println("========= 각 게시글 별 공유 기능 =========");
            post.share();
            System.out.println();

        }
    }
}
