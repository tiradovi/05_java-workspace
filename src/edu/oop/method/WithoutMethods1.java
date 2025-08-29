package edu.oop.method;

public class WithoutMethods1 {
    static String url = "https://www.google.com";

    public class WithoutMethods {
        public static void main(String[] args) {
            // 학생 1의 성적 처리
            String student1Name = "김철수";
            int student1Korean = 85;
            int student1English = 90;
            int student1Math = 78;

            // 학생 1 총점 계산
            int student1Total = student1Korean + student1English + student1Math;

            // 학생 1 평균 계산
            double student1Average = student1Total / 3.0;

            // 학생 1 학점 계산
            String student1Grade = score(student1Average);

            // 학생 1 결과 출력
            displayInfo(student1Name, student1Korean, student1English, student1Math, student1Total, student1Average, student1Grade);

            // 학생 2의 성적 처리 (완전히 중복된 로직)
            String student2Name = "이영희";
            int student2Korean = 92;
            int student2English = 88;
            int student2Math = 95;

            // 학생 2 총점 계산
            int student2Total = student2Korean + student2English + student2Math;

            // 학생 2 평균 계산
            double student2Average = student2Total / 3.0;

            // 학생 2 학점 계산 (동일한 로직 반복)
            String student2Grade = score(student2Average);

            // 학생 2 결과 출력 (동일한 형식 반복)
            displayInfo(student2Name, student2Korean, student2English, student2Math, student2Total, student2Average, student2Grade);


            // 학생 3의 성적 처리 (또 다시 중복)
            String student3Name = "박민수";
            int student3Korean = 76;
            int student3English = 82;
            int student3Math = 69;

            // 학생 3 총점 계산
            int student3Total = student3Korean + student3English + student3Math;

            // 학생 3 평균 계산
            double student3Average = student3Total / 3.0;

            // 학생 3 학점 계산 (또 다시 동일한 로직)
            String student3Grade = score(student3Average);

            // 학생 3 결과 출력 (또 다시 동일한 형식)
            displayInfo(student3Name, student3Korean, student3English, student3Math, student3Total, student3Average, student3Grade);

            // 전체 통계 계산
            int totalAllStudents = student1Total + student2Total + student3Total;
            double averageAllStudents = totalAllStudents / 9.0; // 총 9과목

            System.out.println("=== 전체 통계 ===");
            System.out.println("전체 학생 수: 3명");
            System.out.println("전체 총점 합계: " + totalAllStudents + "점");
            System.out.println("전체 평균: " + String.format("%.2f", averageAllStudents) + "점");

            // 최고점 학생 찾기 (비효율적인 방식)
            if (student1Average >= student2Average && student1Average >= student3Average) {
                System.out.println("최고 성적: " + student1Name + " (" + String.format("%.2f", student1Average) + "점)");
            } else if (student2Average >= student1Average && student2Average >= student3Average) {
                System.out.println("최고 성적: " + student2Name + " (" + String.format("%.2f", student2Average) + "점)");
            } else {
                System.out.println("최고 성적: " + student3Name + " (" + String.format("%.2f", student3Average) + "점)");
            }
        }
    }

    public static String score(double studentAverage) {
        if (studentAverage >= 90) return "A";
        else if (studentAverage >= 80) return "B";
        else if (studentAverage >= 70) return "C";
        else return "D";
    }

    public static void displayInfo(String name, int kor, int eng, int math, int total, double average, String grade) {
        System.out.println("=== " + name + " 성적표 ===");
        System.out.println("국어: " + kor + "점");
        System.out.println("영어: " + eng + "점");
        System.out.println("수학: " + math + "점");
        System.out.println("총점: " + total + "점");
        System.out.println("평균: " + String.format("%.2f", average) + "점");
        System.out.println("학점: " + grade);
        System.out.println();
    }
}