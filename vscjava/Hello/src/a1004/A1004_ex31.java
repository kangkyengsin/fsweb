package a1004;

import java.util.Scanner;

public class A1004_ex31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력하세요: ");
        int score = scanner.nextInt();

        char grade;

        if(score >= 90) {
            grade = 'A';
        } else if (score >= 70) {
            grade = 'B';
        } else if (score >= 40) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        System.out.println("학점 :" + grade);
        scanner.close();
    }
}
