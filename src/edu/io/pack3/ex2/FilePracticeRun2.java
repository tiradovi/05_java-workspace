package edu.io.pack3.ex2;

import java.util.Scanner;

public class FilePracticeRun2 {
    public static void main(String[] args) {
        FilePracticeService2 filePracticeService = new FilePracticeService2();

        Scanner sc = new Scanner(System.in);
        System.out.print("폴더를 입력하시겠습니까?(yes/no): ");
        String choice = sc.nextLine().trim().toLowerCase();
        String dirName = "";
        if (choice.equals("yes")) {
            System.out.print("폴더입력 : ");
            dirName = sc.nextLine();
        } else {
            dirName = "";
        }
        System.out.print("내용을 확인할 파일이름 + 확장자를 입력하세요 : ");
        String fileName = sc.nextLine();
        int dotIndex = fileName.lastIndexOf('.');

        if (dotIndex + 1 == fileName.length()) {
            System.out.println("존재하는 확장자 명칭이 없습니다.");
            return;
        } else if (dotIndex == -1) {
            System.out.println(". 이 존재하지 않습니다.");
            return;
        }
        filePracticeService.method1(dirName, fileName);
    }
}
