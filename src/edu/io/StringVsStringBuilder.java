package edu.io;

public class StringVsStringBuilder {

    public void stringMethod() {
        String result = "";

        for (int i = 0; i < 1000; i++) {
            result += "숫자 : " + i + "\n";
        }
    }

    public void stringBuilderMethod() {
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < 1000; i++) {
            sb.append("숫자 : " + i + "\n");
        }

        String result = sb.toString();
    }
}
