package edu.exception.pack3.ex3;

import java.io.File;
import java.io.IOException;

public class NewFileServiceRun {
    // 자바는 컴퓨터와 연관있는 서버언어
    // 파일 생성, 삭제, 수정과 같은 코드 작업 가능

    // JS는 nodeJs 활용시 가능
    public static void main(String[] args) {
        // File이라는 자바 개발자들이 만든 문서 활용
        File file = new File("생성된.txt");
        if (!file.exists()) {
            // 생성된.txt가 존재하지 않는게 사실이라면
            try {
                file.createNewFile();
                System.out.println("file 생성 완료");
            } catch (IOException e) {
                System.out.println("파일을 생성하는 도중 문제발생");
            } catch (Exception e) {
                System.out.println("예기치 못한 문제 발생");
                System.out.println("err : " + e);
            } finally {
                System.out.println("파일 생성 종료");
            }
        }
    }
}
