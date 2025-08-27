package edu.oop.field.pack1;

public class FieldRun {
    public static void main(String[] args) {
        FieldEx f1 = new FieldEx();

        System.out.println(f1.publicValue);
        System.out.println(f1.defaultValueOne);
        System.out.println(f1.defaultValueTwo);
        System.out.println(f1.protectedValue);
        //System.out.println(f1.privateValue); 이거 안됨
    }
}
