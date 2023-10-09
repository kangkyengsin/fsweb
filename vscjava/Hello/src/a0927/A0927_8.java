package a0927;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A0927_8 {
    public static void main(String[] args) {
        // 스캐너 객체 생성
        Scanner scanner = new Scanner(System.in);

        boolean validInput = false;
        int score = 0;

        while (!validInput) {
            try {
                // 사용자에게 메시지를 출력하여 점수 입력 받기
                System.out.print("점수를 입력하세요: ");
                score = scanner.nextInt();

                validInput = true; // 유효한 입력을 받으면 반복문 종료
            } catch (InputMismatchException e) {
                System.out.println("올바른 숫자를 입력하세요.");
                scanner.nextLine(); // 잘못된 입력을 제거하기 위해 스캐너 버퍼를 비움
            }
        }

        // 입력 받은 점수에 따라 학점 계산
        char grade;

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // 학점 출력
        System.out.println("학점: " + grade);

        // 스캐너 닫기 (권장사항)
        scanner.close();
    }
}