package exam;

import java.util.Scanner;

public class Ex64 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("첫번째값 : ");
        int num1 = scan.nextInt();
        System.out.println("두번째값 : ");
        int num2 = scan.nextInt();

        int num3 = num1 % num2;
        System.out.println("나머지 : " + num3);
    }
}
