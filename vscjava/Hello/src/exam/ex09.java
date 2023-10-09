package exam;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        // 키보드로 입력한 정수값을 그대로 출력하는 프로그램을 작성해보자.
        Scanner scan = new Scanner(System.in);
        float num = scan.nextFloat();
        System.out.print(num);
        double num2 = scan.nextDouble();
        System.out.print(num2);
    }
}
