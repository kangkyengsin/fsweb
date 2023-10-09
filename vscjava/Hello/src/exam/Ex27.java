package exam;

import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
        // 정수 세 개를 입력받아 합과 평균을 출력하는 프로그램을 작성해보자.
        Scanner scan = new Scanner(System.in);
        System.out.print("정수를 입력하시오. >");
        int a = scan.nextInt();
        System.out.print("정수를 입력하시오. >");
        int b = scan.nextInt();
        //삼항 연산자
        // int i = (a > b) ? a : b;
        // System.out.println(i);

        // int i;
        // if(a>b) {
        //     i = a;
        // } else {
        //     i = b;
        // }
        // System.out.println(i);

        if(a>b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
        
    }
}
