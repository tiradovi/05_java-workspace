package edu.practice.day3;

public class Practice1 {
    private String title;       //(제목)
    private String author;      //(저자)
    private int price;          // (가격)
    private boolean isAvailable = true;// (대출 가능 여부, 기본값 true)

    public Practice1() {
    }

    public Practice1(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
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

    public int getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(getTitle() + "이(가) 대출되었습니다.");
        } else {
            System.out.println(getTitle() + "이(는) 이미 대출된 상태입니다.");
        }
    }

    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println(getTitle() + "이(가) 반납되었습니다.");
        } else {
            System.out.println(getTitle() + "이(는) 이미 반납된 상태입니다.");
        }
    }

    public void displayInfo() {
        System.out.println("=== 도서 정보 ===");
        System.out.printf("제목: %s\n", getTitle());
        System.out.printf("저자: %s\n", getAuthor());
        System.out.printf("가격: %d원\n", getPrice());
        System.out.println("대출 가능: " + (isAvailable ? "가능" : "불가능"));
        System.out.println();
    }

}
