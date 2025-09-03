package edu.polymorphism.pack3.ex1;

/*
public interface 소셜미디어기능들(){}
public class Meta플랫폼(){}

추상 없이 부모+ 인터페이스
public class Instagram extends Meta플랫폼 implements 소셜미디어기능들{}

추상기능 부모에 abstract
public class Instagram extends Meta플랫폼
 */
public class Instagram extends Meta플랫폼 {
    public Instagram(String 유저아이디) {
        super("Instagram", 유저아이디);
    }

    @Override
    public void post(String content) {
        System.out.println("[Instagram] 릴스 게시물 : " + content);
    }

    @Override
    public void like(String postId) {
        System.out.println("[Instagram] 게시물 : " + postId + " 에 좋아요를 눌렀습니다.");
    }


}
