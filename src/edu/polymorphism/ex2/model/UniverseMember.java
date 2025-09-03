package edu.polymorphism.ex2.model;

/*
부모 클래스
name
id
toString
를 작성
 */
public class UniverseMember /* extends Object */ {
    // protected
    protected String name;
    protected String id;

    public UniverseMember() {
    }

    public UniverseMember(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "학교 멤버 :" +
                "name='" + name + '\'' +
                ", id='" + id + '\'';
    }
}