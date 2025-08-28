package edu.practice.day4;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;

    {
        isAvailable = true;
    }


    public Book() {
    }

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            return "대출 성공";
        } else {
            return "이미 대출중";
        }
    }

    public String returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            return "반납 완료";
        } else {
            return "이미 반납됨";
        }
    }

    public void displayBook() {

    }
}
