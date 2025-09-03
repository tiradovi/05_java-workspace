package edu.polymorphism.pack2.ex2.run;

import edu.polymorphism.pack2.ex2.service.PostService;

public class PostMain {

    public static void main(String[] args) {
        PostService postService = new PostService();
        postService.display();
    }
}
