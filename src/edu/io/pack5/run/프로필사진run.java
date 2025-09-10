package edu.io.pack5.run;

import edu.io.pack5.service.프로필사진service;

public class 프로필사진run {
    public static void main(String[] args) {
        프로필사진service service = new 프로필사진service();
        service.createProfileFolder();

    }
}
