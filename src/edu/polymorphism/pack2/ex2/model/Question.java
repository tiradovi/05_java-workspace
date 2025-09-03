package edu.polymorphism.pack2.ex2.model;

public class Question extends Post {
    private int answerCount;

    public Question() {
    }

    public Question(String postId, String title, String author, String content) {
        super(postId, title, author, content);
    }

    public Question(String postId, String title, String author, String content, int answerCount) {
        super(postId, title, author, content);
        this.answerCount = 0;
    }


    public int answerCount() {
        return answerCount;
    }

    public void setAnswerCount(int answerCount) {
    }

    public void addanswerCount() {
        setAnswerCount(answerCount() + 1);
    }

    @Override
    public void displayPost() {
        System.out.println("[Q&A] " + getTitle() + " 작성자:" + getAuthor() + " 답변개수: " + answerCount() + "개 내용: " + getContent());

    }

}
