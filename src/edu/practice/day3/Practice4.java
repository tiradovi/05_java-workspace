package edu.practice.day3;

import java.util.Scanner;

public class Practice4 {
    private String name;
    private int studentId;
    private int[] scores = new int[5];
    private String[] subjects;

    public Practice4() {
        this.subjects = new String[]{"국어", "영어", "수학", "과학", "사회"};
    }

    public Practice4(String name, int studentId, int[] scores) {
        this.name = name;
        this.studentId = studentId;
        this.scores = scores;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int[] getScores() {
        return scores;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void inputScores() {
        System.out.println("=== " + getName() + " 학생 성적 입력 ===");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < subjects.length; i++) {
            System.out.print(subjects[i] + " 점수: ");
            scores[i] = sc.nextInt();
        }
        System.out.println();
    }

    public int getTotalScore() {
        int totalScore = 0;
        for (int i = 0; i < scores.length; i++) {
            totalScore += scores[i];
        }
        return totalScore;
    }

    public double getAverage() {
        double average = (double) getTotalScore() / scores.length;
        return average;
    }

    public String getGrade() {
        double average = getAverage();
        String grade = "";
        if (average >= 90) {
            grade = "A";
        } else if (average >= 80) {
            grade = "B";
        } else if (average >= 70) {
            grade = "C";
        } else if (average >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }


        return grade;
    }

    public void printReport() {
        System.out.println("\n=== " + this.name + "(" + this.studentId + ") 성적표 ===");
        for (int i = 0; i < subjects.length; i++) {
            System.out.println(subjects[i] + ": " + scores[i] + "점");
        }

        System.out.println("-----------------------");
        System.out.println("총점: " + getTotalScore() + "점");
        System.out.printf("평균: %.1f점\n", getAverage());
        System.out.println("학점: " + getGrade());
    }
}
