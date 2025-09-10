package edu.io.pack5.run;

import edu.io.pack5.service.중복된_파일_폴더명칭_Service;

public class 중복된_파일_폴더명칭_Run {
    public static void main(String[] args) {
        중복된_파일_폴더명칭_Service service = new 중복된_파일_폴더명칭_Service();
        //service.saveImage1();
        //service.saveImage2();
        //service.saveImage3();
        // service.saveImage5();
        String imgUrl = "https://i.namu.wiki/i/f5sB1VmqFMrhyfDBazayQ_Gv3sJR4UqLucxfEzvSYMWiqdBVOdf1rzdMR4n-HDyDCj7YXbwJrTImpHslTa5u4w.webp";
        service.kakaoSave(imgUrl);
    }
}
