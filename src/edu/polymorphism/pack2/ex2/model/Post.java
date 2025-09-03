package edu.polymorphism.pack2.ex2.model;

public abstract class Post {
    protected String postId;
    protected String title;
    protected String author;
    protected String content;

    public Post() {
    }

    public Post(String postId, String title, String author, String content) {
        this.postId = postId;
        this.title = title;
        this.author = author;
        this.content = content;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void like() {
        System.out.println(getTitle() + " 게시글에 좋아요를 눌렀습니다.");
    }

    public void share() {
        System.out.println(getTitle() + " 게시글을 공유했습니다.");
    }

    public abstract void displayPost();
}
