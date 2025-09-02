package edu.polymorphism.pack1.model;

public class Iphone extends SmartPhone {
    private int iosVersion;

    public Iphone() {
    }

    public Iphone(int androidVersion) {
        this.iosVersion = androidVersion;
    }

    public Iphone(String display, String newsAgency, String ap) {
        super(display, newsAgency, ap);
    }

    public Iphone(String display, String newsAgency, String ap, int iosVersion) {
        super(display, newsAgency, ap);
        this.iosVersion = iosVersion;
    }

    public int getIosVersion() {
        return iosVersion;
    }

    public void setIosVersion(int iosVersion) {
        this.iosVersion = iosVersion;
    }

    @Override
    public String toString() {
        return "Iphone iosVersion : " + iosVersion + super.toString();
    }
}
