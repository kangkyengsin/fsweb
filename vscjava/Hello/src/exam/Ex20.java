package exam;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        // 정수 세 개를 입력받아 합과 평균을 출력하는 프로그램을 작성해보자.
        Scanner scan = new Scanner(System.in);
        System.out.print("첫번째 값를 입력 >");
        int a = scan.nextInt();
        System.out.print("두번째 값를 입력 >");
        int b = scan.nextInt();
        System.out.print("세번째 값를 입력 >");
        int c = scan.nextInt();

        int[] scores;
        // 배열 변수에 배열을 대입
        scores = new int[] { a, b, c };
        // 배열 항목의 총합을 구하고 출력
        int sum1 = 0;
        for (int i = 0; i < 3; i++) {
            sum1 += scores[i];
        }
        System.out.println("총합: " + sum1);
    }
}
