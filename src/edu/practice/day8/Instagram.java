package edu.practice.day8;

public class Instagram implements SocialMedia {
    private String photo;

    public Instagram(String photo) {
        this.photo = photo;
    }

    @Override
    public void post() {
        System.out.println("📸 인스타그램에" + getPhoto() + "사진을 올립니다! #일상 #맛집");
    }

    @Override
    public void like() {

    }

    @Override
    public void share() {

    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
