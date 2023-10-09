package exam;

import java.util.Scanner;

public class Ex38 {

    public static void main(String[] args) {
        // 삼각형의 넓이를 구하는 프로그램을 작성한다.
        Scanner scan = new Scanner(System.in);
        System.out.print("삼각형의 밑변을 입력해주세요>");
        int a = scan.nextInt();
        System.out.print("삼각형의 높이를 입력해주세요>");
        int b = scan.nextInt();

        System.out.printf("삼각형의 넓이는"+"?%.1f",(float)(a*b)/2);
    }
}