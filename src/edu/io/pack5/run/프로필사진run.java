package edu.io.pack5.run;

import edu.io.pack5.service.프로필사진service;

public class 프로필사진run {
    public static void main(String[] args) {
        프로필사진service service = new 프로필사진service();
        String imgurl1 = "https://www.fitpetmall.com/wp-content/uploads/2023/10/GettyImages-492548888-1.png";
        String imgurl2 = "https://i.namu.wiki/i/UHPnPScHCBrY70JhvMyqExeI5PzTzpO4tEwHs4He52FR4ZmWnPy-8etpgfbDD5-9GvTAytzTqqjGkc-V6apmQw.webp";
     /*   try {
            service.createProfileFolder("member03", "프로필사진2.txt");
            service.createProfileFolder("member04", "프로필사진2.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/
        // service.saveImg(imgurl1);
        service.saveImg2(imgurl2);
    }
}
