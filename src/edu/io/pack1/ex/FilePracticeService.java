package edu.io.pack1.ex;

import java.io.File;
import java.io.IOException;

public class FilePracticeService {
    public void method1() {
        File log = new File("my_logs");
        File logfile = new File("my_logs/access_log.log");

        if (!log.exists()) {
            log.mkdir();
            System.out.println("my logs 폴더 생성 완료.");
        }
        try {
            if (!logfile.exists()) {
                logfile.createNewFile();
                System.out.println("access_log.log 파일 생성 성공.");
            }
        } catch (IOException e) {
            System.out.println("access_log.log 파일 생성 실패.");
        }
    }

    // cmd에서  tree /f 사용시 폴더별 파일 확인 가능
    public void method2() {
        String path = "src/edu/oop/method/ex";
        File file = new File(path);
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile()) {
                System.out.println(f.getName() + "[파일]");
            } else if (f.isDirectory()) {
                System.out.println(f.getName() + "[폴더]");
            }
        }
    }

    public void method3() {
        String path = "C:/io_test/temp";
        File folder = new File(path);
        File file = new File(path + "/delete_target.txt");
        if (!folder.exists()) {
            folder.mkdir();
        }
        try {
            if (!file.exists()) {
                file.createNewFile();
                System.out.println(file.getName() + "생성완료");
            } else if (file.exists()) {
                file.delete();
                System.out.println(file.getName() + "삭제완료");
            }
        } catch (IOException e) {
            System.out.println("파일 생성 및 삭제중 오류 발생");
        }
        if (file.exists()) {
            System.out.println("파일 삭제 실패");
        } else {
            System.out.println("파일 삭제 완료");
        }
    }

}
