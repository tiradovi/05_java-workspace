package edu.io.pack1.service;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

/*************** 개발자 상식 *********************
 * OS : 운영체제
 * Windows   / Linux,Mac
 * 폴더     / 디렉토리
 *
 * - 경로 표기 방법(하위 폴더 표시하는 형태)
 * \ : Windows   -> C:\폴더이름1\폴더이름2\..
 * / : Linux,Mac -> C:/폴더이름1/폴더이름2/..
 *
 * Java 언어의 특징 : 플랫폼(OS)에 독립적으로 윈도우, 리눅스, 맥북에 관계 없이 사용가능
 *
 * - 경로 표기 방법
 * 1) 절대 경로 : 하나의 절대적인 기준으로 부터 목표까지의 경로를 모두 표기하는 방법
 * [Windows] : C:/ or D:/
 * [Linux, Mac] : /Users,  /
 *
 * 2) 상대 경로 : 현재 위치를 기준으로 목표까지의 경로를 표기하는 방법
 * 자바에서 특정 경로 없이 파일만 생성할 경우 메인폴더 기준으로 생성 
 * java_basic 아래에 생성
 *
 *************************************************/
public class FileService {
    /* File 클래스
    
    - java.io 패키지
    - 파일 / 디렉토리(폴더) 관리하는 클래스( 파일/ 디렉토리 존재 유무 관계 없음)
    
    - 파일 생성, 제거, 이름, 크기, 마지막 수정일, 존재여부 등 기능 제공

    - File 클래스 메서드:

    boolean mkdir() : 디렉토리 생성(한 개의 폴더만 생성 make directory(folder))
    boolean mkdirs() : 경로상에 존재하는 모든 디렉토리 생성(폴더 여러개 한 번에 생성 make directory(folder))
    boolean createNewFile() : 파일 생성
    boolean delete() : 파일 / 디렉토리 삭제
    String getName() : 파일 이름 반환
    String parent() : 파일 저장된 디렉토리 반환
    String getPath() : 전체 경로 반환
    boolean isFile() : 현재 File 객체가 관리하는게 파일이면 true
    boolean isDirectory() : 현재 File 객체가 관리하는게 디렉토리면 true
    boolean exists() : 파일 / 디렉토리가 존재하면 true, 아니면 false
    long length() : 파일 크기 반환
    long lastModified : 파일 마지막 수정일(1970.01.01 9:00) 부터 현재까지 지난시간 ms단위로 반환)
    String[] list() : 디렉토리 내 파일 목록을 String[] 배열로 반환
    File[] listFiles() : 디렉토리 내 파일 목록을 File[] 배열로 반환

     */

    /**
     * File 클래스로 객체 생성
     * + 폴더가 존재하지 않으면 폴더를 생성
     */
    public void method1() {
        // 제일 앞 "/": 최상위 폴더 (== root, 절대 경로)

        // C 드라이브 폴더 다음에 io_test 폴더와 gildong 폴더가 존재하는지 확인 후 
        // 존재하지 않으면 생성, 존재하면 생성 하지 않음
        File 폴더들 = new File("/io_test/gildong");
        // 존재 여부 상관없이 폴더 명칭을 가지는 파일 객체 생성

        System.out.println("폴더 존재여부 확인 : " + 폴더들.exists());

        // 폴더들.exists(); -> true false;

        // 폴더 모두 생성
        폴더들.mkdirs(); // 폴더가 하나가 아닌 io_test폴더 내에 gildong 이라는 폴더 생성할 예정이기 때문

        System.out.println("마지막 폴더 명칭 : " + 폴더들.getName());
        System.out.println("마지막 폴더까지의 경로 : " + 폴더들.getPath());
    }

    /**
     * File 클래스로 객체 생성
     * 지정된 위치에 파일 생성
     */
    public void method2() {
        File 파일하나 = new File("/io_test/gildong/파일생성확인.txt");

        // 폴더 생성은 mkdir(), mkdirs()
        // 폴더와 별개로 [파일] 을 생성할 때
        // createNewFile()

        try {//컴퓨터에서 코드 실행시 문제가 발생할 가능성이 있는 코드 실행
            파일하나.createNewFile();
        } catch (IOException e) {
            // 문제 발생시
            System.out.println("파일 생성중 문제 발생");
        } catch (Exception e) {
            System.out.println("개발자가 발견하지 못한 문제");
            System.out.println("문제 확인 공간");
            e.printStackTrace();// 예외 정보 + 예외가 발생한 위치까지의 기능 추적
            System.out.println(e.getMessage());//e.printStackTrace()와 같음 둘중 하나 사용
        }

    }

    /**
     * c드라이브 아래 io_test/practice/폴더및파일생성.txt 파일 생성
     */
    public void method3() {
        String 폴더경로 = "/io_test/practice";
        File 폴더만드는객체 = new File(폴더경로);
        File 파일만드는객체 = new File(폴더경로 + "/폴더및파일생성.txt");
        try {
            if (!폴더만드는객체.exists()) {
                폴더만드는객체.mkdirs();

                if (!파일만드는객체.exists()) {
                    파일만드는객체.createNewFile();
                    System.out.println(파일만드는객체.getName() + "파일이 생성되었습니다.");
                }

            }
        } catch (IOException e) {
            System.out.println(파일만드는객체.getName() + "파일을 생성하지 못했습니다.");
        }
    }

    /**
     * c드라이브 아래 io_test/practice/files 폴더 존재 유무 확인
     * 존재하면 폴더 미생성 , 미존재하면 생성
     * 그 후 method4.txt 생성
     */
    public void method4() {
        String 폴더경로 = "/io_test/practice/files";
        File 폴더객체 = new File(폴더경로);
        File 파일객체 = new File(폴더경로 + "/method4.txt");

        if (!폴더객체.exists()) {
            폴더객체.mkdirs();
        }
        try {
            if (!파일객체.exists()) {
                파일객체.createNewFile();
                System.out.println(파일객체.getName() + "파일이 생성되었습니다.");
            }
        } catch (IOException e) {
            System.out.println(파일객체.getName() + "파일을 생성하지 못했습니다.");
        }
    }

    /**
     *
     * 현재 경로 C
     */
    public void method5() {

        File directory = new File("/Users/user/Desktop/java-workspace/java_basic");
        File[] files = directory.listFiles();

        for (File file : files) {
            String name = file.getName(); // 파일 이름
            long lastModified = file.lastModified(); // 마지막 수정날짜
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 간단히 날짜형식 지정
            String date = simpleDateFormat.format(lastModified); // 날짜 변환
            String type;//파일 유형
            if (file.isFile()) {
                type = "file";
            } else {
                type = "folder";
            }

        }
    }

}
