package edu.io.pack3.ex1;

import java.util.Scanner;

public class FilePracticeRun1 {
    public static void main(String[] args) {
        FilePracticeService1 filePracticeService1 = new FilePracticeService1();

        Scanner sc = new Scanner(System.in);
        System.out.print("폴더를 입력하시겠습니까?(yes/no): ");
        // yes : dirName
        // no : 최상위 폴더
        String choice = sc.nextLine().trim().toLowerCase();
        String dirName = "";
        if (choice.equals("yes")) {
            System.out.print("폴더입력");
            dirName = sc.nextLine();
        } else if (choice.equals("no")) {
            dirName = "";
        }
        System.out.print("내용을 확인할 파일이름 + 확장자를 입력하세요 : ");
        String fileName = sc.nextLine();
        filePracticeService1.method1(dirName, fileName);
    }
}
